package sch.taobao.servlet;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Test;
import org.springframework.web.util.HtmlUtils;
import sch.taobao.bean.*;
import sch.taobao.comparator.*;
import sch.taobao.dao.CategoryDAO;
import sch.taobao.dao.OrderDAO;
import sch.taobao.dao.ProductDAO;
import sch.taobao.dao.ProductImageDAO;
import sch.taobao.util.Page;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@WebServlet("/foreServlet")
public class ForeServlet extends BaseForeServlet {
	//首页方法
	public String home(HttpServletRequest request, HttpServletResponse response, Page page) {
		List<Category> cs =categoryDAO.list();//取出所有商品类
		Category category;
		productDAO.fill(cs);
		productDAO.fillByRow(cs);
		for (Category c: cs
			 ) {
			category =c;
			productDAO.fill(category);
			request.setAttribute("c",c);
		}
		request.setAttribute("cs", cs);
		return "home.jsp";
	}
	public String categoryNav(HttpServletRequest request,HttpServletResponse response,Page page){

		List<Category> cs =categoryDAO.list();//取出所有商品类
		Category category;
		productDAO.fill(cs);
		productDAO.fillByRow(cs);
		for (Category c: cs
				) {
			category =c;
			productDAO.fill(category);
			request.setAttribute("c",c);
		}
		request.setAttribute("cs", cs);

		return "category-nav.jsp";
	}
	//注册方法
	public String register(HttpServletRequest request, HttpServletResponse response, Page page) {
		//取出表单账号密码
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		name = HtmlUtils.htmlEscape(name);//？
		System.out.println(name);
		boolean exist = userDAO.isExist(name);//判断是否存在此账号

		//如果存在
		if(exist){
			request.setAttribute("msg", "用户名已经被使用,不能使用");//返回给前台的错误信息字符串msg
			return "register.jsp";	
		}
		//不存在则创建新的用户对象，将用户名，密码填充给用户对象
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		userDAO.add(user);//插入用户对象到用户表
		
		return "@registerSuccess.jsp";//返回注册成功页面
	}

	//登录方法
	public String login(HttpServletRequest request, HttpServletResponse response, Page page) {
		String name = request.getParameter("name");//用户名
		name = HtmlUtils.htmlEscape(name);//？
		String password = request.getParameter("password");//密码
		
		User user = userDAO.get(name,password);//从数据库中取出用户对象
		 
		if(null==user){
			request.setAttribute("msg", "账号密码错误");//错误信息返回给前台msg字符串
			return "login.jsp";
		}
		request.getSession().setAttribute("user", user);//返回给session对象
		return "@forehome";//跳转首页
	}

	//产品页面方法
	public String product(HttpServletRequest request, HttpServletResponse response, Page page) {
		int pid = Integer.parseInt(request.getParameter("pid"));//从相应产品页面中获得对应的产品id
		Product p = productDAO.get(pid);//取出对应id产品

		//分别取出单个产品图和产品详情图片的集合
		List<ProductImage> productSingleImages = productImageDAO.list(p, ProductImageDAO.type_single);
		List<ProductImage> productDetailImages = productImageDAO.list(p, ProductImageDAO.type_detail);
		//分别填充到相应的产品
		p.setProductSingleImages(productSingleImages);
		p.setProductDetailImages(productDetailImages);

		//取出产品集的属性值
		List<PropertyValue> pvs = propertyValueDAO.list(p.getId());

		//取出对应产品id的评价集合
		List<Review> reviews = reviewDAO.list(p.getId());

		//
		productDAO.setSaleAndReviewNumber(p);//填充产品的销售数量和评价数量

		request.setAttribute("reviews", reviews);//返回评价集合给前台

		request.setAttribute("p", p);//返回产品对象给前台
		request.setAttribute("pvs", pvs);//返回给产品属性给前台
		return "product.jsp";		
	}
	//登出操作
	public String logout(HttpServletRequest request, HttpServletResponse response, Page page) {
		request.getSession().removeAttribute("user");//移除session对象，session对象为空
		return "@forehome";//返回首页
	}

	//检查登录状态(Ajax交互)
	public String checkLogin(HttpServletRequest request, HttpServletResponse response, Page page) {
		User user =(User) request.getSession().getAttribute("user");//返回session对象
		if(null!=user)//如果不为空
			return "%success";//登录状态，返回？
		return "%fail";//未登录状态，返回？
	}
	public String loginAjax(HttpServletRequest request, HttpServletResponse response, Page page) {
		String name = request.getParameter("name");//用户名
		String password = request.getParameter("password");//密码
		User user = userDAO.get(name,password);//取出对象
		
		if(null==user){//对象为空
			return "%fail";//？
		}
		request.getSession().setAttribute("user", user);//对象不为空，user返回给session对象
		return "%success";//?
	}
	//产品类方法
	public String category(HttpServletRequest request, HttpServletResponse response, Page page) {
		int cid = Integer.parseInt(request.getParameter("cid"));//对应类别页面的cid
		
		Category c = new CategoryDAO().get(cid);//查询相应cid的产品类别
		new ProductDAO().fill(c);//填充对应产品类别的产品集合
		new ProductDAO().setSaleAndReviewNumber(c.getProducts());//设置所有产品的销量和评价数量
		
		String sort = request.getParameter("sort");//返回筛选条的input 筛选关键字
		if(null!=sort){//如果关键字不为空
		switch(sort){
			//关键字是评价数量
			case "review":
				Collections.sort(c.getProducts(),new ProductReviewComparator());
				break;
			//新品
			case "date" :
				Collections.sort(c.getProducts(),new ProductDateComparator());
				break;
			//销量
			case "saleCount" :
				Collections.sort(c.getProducts(),new ProductSaleCountComparator());
				break;
			//价格
			case "price":
				Collections.sort(c.getProducts(),new ProductPriceComparator());
				break;
			//综合评价
			case "all":
				Collections.sort(c.getProducts(),new ProductAllComparator());
				break;
			}
		}
		
		request.setAttribute("c", c);//返回给产品类别给前台
		return "category.jsp";		
	}
	//搜索
	public String search(HttpServletRequest request, HttpServletResponse response, Page page){
		String keyword = request.getParameter("keyword");
		List<Product> ps= new ProductDAO().search(keyword,0,20);
		productDAO.setSaleAndReviewNumber(ps);
		request.setAttribute("ps",ps);
		return "searchResult.jsp";
	}
	//立即购买
	public String buyone(HttpServletRequest request, HttpServletResponse response, Page page) {
		int pid = Integer.parseInt(request.getParameter("pid"));//获得产品页pid
		int num = Integer.parseInt(request.getParameter("num"));//获得产品数量
		Product p = productDAO.get(pid);//取出相应产品
		int oiid = 0;//订单项id
		
		User user =(User) request.getSession().getAttribute("user");//获得用户session
		/**
		 * 接下来就是新增订单项OrderItem， 新增订单项要考虑两个情况
		 */
		/*a. 如果已经存在这个产品对应的OrderItem，并且还没有生成订单，即还在购物车中*/
		boolean found = false;//购物车中存在相应购买产品的OrderItem

		List<OrderItem> ois = orderItemDAO.listByUser(user.getId());//获得没有生成订单的用户订单项集合
		for (OrderItem oi : ois) {
			if(oi.getProduct().getId()==p.getId()){//如果用户购买的此产品id对应某个没有生成订单的产品id（购物车的）
				oi.setNumber(oi.getNumber()+num);//订单对用户的产品数量追加
				orderItemDAO.update(oi);//更新产品项
				found = true;//生成订单的状态
				oiid = oi.getId();//获取此订单项的id
				break;
			}
		}		

		if(!found){//如果购物车中不存在相应的订单项
			OrderItem oi = new OrderItem();//生成新的订单项
			//填充订单项
			oi.setUser(user);
			oi.setNumber(num);
			oi.setProduct(p);
			orderItemDAO.add(oi);
			oiid = oi.getId();
		}
		return "@forebuy?oiid="+oiid;//跳转到对应购买产品的结算页面
	}

	//结算
	public String buy(HttpServletRequest request, HttpServletResponse response, Page page){
		/*
			结算页面还需要显示在购物车中选中的多条OrderItem数据，
			所以为了兼容从购物车页面跳转过来的需求，要用getParameterValues获取多个oiid
		 */
		String[] oiids=request.getParameterValues("oiid");//获得订单项id集合
		List<OrderItem> ois = new ArrayList<>();//新的订单项容器
		float total = 0;

		for (String strid : oiids) {//遍历订单项id集合
			int oiid = Integer.parseInt(strid);
			OrderItem oi= orderItemDAO.get(oiid);//取出订单项
			total +=oi.getProduct().getPromotePrice()*oi.getNumber();//累计oi的价格赋值在total上
			ois.add(oi);//向容器中添加订单项
		}
		
		request.getSession().setAttribute("ois", ois);//把订单项集合放在session的属性 "ois" 上
		request.setAttribute("total", total);// 把总价格放在 request的属性 "total" 上
		return "buy.jsp";
	}
	//添加到购物车
	public String addCart(HttpServletRequest request, HttpServletResponse response, Page page) {
		int pid = Integer.parseInt(request.getParameter("pid"));//获得产品页pid
		Product p = productDAO.get(pid);//取出产品
		int num = Integer.parseInt(request.getParameter("num"));//获得产品数量
		
		User user =(User) request.getSession().getAttribute("user");//获得相应用户session
		/*
			新增订单项OrderItem， 新增订单项要考虑两个情况
			如果已经存在这个产品对应的OrderItem，并且还没有生成订单，即还在购物车中。
			那么就应该在对应的OrderItem基础上，调整数量
		 */

		//如果已经存在这个产品对应的OrderItem，并且还没有生成订单，即还在购物车中。 那么就应该在对应的OrderItem基础上，调整数量
		boolean found = false;

		List<OrderItem> ois = orderItemDAO.listByUser(user.getId());//基于用户对象user，查询没有生成订单的订单项集合
		for (OrderItem oi : ois) {
			if(oi.getProduct().getId()==p.getId()){//如果遍历的订单项中有相同的产品
				oi.setNumber(oi.getNumber()+num);//订单项数量追加
				orderItemDAO.update(oi);//更新订单项
				found = true;
				break;
			}
		}		

		if(!found){// 如果不存在对应的OrderItem,那么就新增一个订单项OrderItem
			OrderItem oi = new OrderItem();
			oi.setUser(user);
			oi.setNumber(num);
			oi.setProduct(p);
			orderItemDAO.add(oi);
		}
		return "%success";//ajax
	}

	//购物车页面显示
	public String cart(HttpServletRequest request, HttpServletResponse response, Page page) {
		User user =(User) request.getSession().getAttribute("user");//获得user session
		List<OrderItem> ois = orderItemDAO.listByUser(user.getId());//获得用户的订单项集合
		request.setAttribute("ois", ois);//设置订单项属性
		return "cart.jsp";
	}

	/*
		购物车页面操作
	 */

	//购物车input表单改变数量
	public String changeOrderItem(HttpServletRequest request, HttpServletResponse response, Page page) {
		User user =(User) request.getSession().getAttribute("user");//获得user session
		if(null==user)//判断为空
			return "%fail";

		int pid = Integer.parseInt(request.getParameter("pid"));//产品pid
		int number = Integer.parseInt(request.getParameter("number"));//产品数量
		List<OrderItem> ois = orderItemDAO.listByUser(user.getId());//通过用户id获得用户订单项集合
		for (OrderItem oi : ois) {
			if(oi.getProduct().getId()==pid){//如果购物车中的产品id与订单项产品id相等
				oi.setNumber(number);//订单项设置购物车页面数量
				orderItemDAO.update(oi);//更新订单项
				break;
			}
			
		}		
		return "%success";//ajax
	}
	//购物车删除订单项
	public String deleteOrderItem(HttpServletRequest request, HttpServletResponse response, Page page){
		User user =(User) request.getSession().getAttribute("user");
		if(null==user)
			return "%fail";
		int oiid = Integer.parseInt(request.getParameter("oiid"));//获得订单项的id
		orderItemDAO.delete(oiid);//删除订单项
		return "%success";
	}
	//创建订单(购物车结算，立即购买)
	public String createOrder(HttpServletRequest request, HttpServletResponse response, Page page){
		User user =(User) request.getSession().getAttribute("user");

		/*通过表单获得*/
		String address = request.getParameter("address");//收货地址
		String post = request.getParameter("post");//邮政编码
		String receiver = request.getParameter("receiver");//收货人
		String mobile = request.getParameter("mobile");//电话
		String userMessage = request.getParameter("userMessage");//留言
		
		//根据当前时间加上一个4位随机数生成订单号
		String orderCode = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) +RandomUtils.nextInt(10000);

		Order order = new Order();//新订单
		/*填充数据*/
		order.setOrderCode(orderCode);
		order.setAddress(address);
		order.setPost(post);
		order.setReceiver(receiver);
		order.setMobile(mobile);
		order.setUserMessage(userMessage);
		order.setCreateDate(new Date());
		order.setUser(user);
		//设置订单的状态 待支付
		order.setStatus(OrderDAO.waitPay);
		//添加订单
		orderDAO.add(order);
		//从session中获取订单项集合
		List<OrderItem> ois= (List<OrderItem>) request.getSession().getAttribute("ois");		
		float total =0;
		for (OrderItem oi: ois) {
			oi.setOrder(order);//订单项填充订单
			orderItemDAO.update(oi);//更新订单项
			total+=oi.getProduct().getPromotePrice()*oi.getNumber();//计算总价格
		}

		//客户端跳转到确认支付页forealipay，并带上订单id和总金额
		return "@forealipay?oid="+order.getId() +"&total="+total;
	}
	//确认支付页
	public String alipay(HttpServletRequest request, HttpServletResponse response, Page page){
		return "alipay.jsp";
	}
	//支付成功
	public String payed(HttpServletRequest request, HttpServletResponse response, Page page) {
		int oid = Integer.parseInt(request.getParameter("oid"));//获取订单id
		Order order = orderDAO.get(oid);//数据库取出订单
		order.setStatus(OrderDAO.waitDelivery);//设置订单状态为待发货，后台进行发货
		order.setPayDate(new Date());//设置订单支付时间
		new OrderDAO().update(order);//更新订单到数据库
		request.setAttribute("o", order);//把这个订单对象放在request的属性"o"上
		return "payed.jsp";		
	}
	/*
		 我的订单页面操作
	 */
	//我的订单页显示
	public String bought(HttpServletRequest request, HttpServletResponse response, Page page) {
		User user =(User) request.getSession().getAttribute("user");
		List<Order> os= orderDAO.list(user.getId(),OrderDAO.delete);//查询user所有的状态不是"delete" 的订单集合os
		
		orderItemDAO.fill(os);//为这些订单填充订单项
		
		request.setAttribute("os", os);//把os放在request的属性"os"上
		
		return "bought.jsp";		
	}

	//确认收货
	public String confirmPay(HttpServletRequest request, HttpServletResponse response, Page page) {
		int oid = Integer.parseInt(request.getParameter("oid"));
		Order o = orderDAO.get(oid);
		orderItemDAO.fill(o);//为订单对象填充订单项
		request.setAttribute("o", o);//把订单对象放在request的属性"o"上
		return "confirmPay.jsp";		
	}
	//确认支付
	public String orderConfirmed(HttpServletRequest request, HttpServletResponse response, Page page) {
		int oid = Integer.parseInt(request.getParameter("oid"));
		Order o = orderDAO.get(oid);
		o.setStatus(OrderDAO.waitReview);//设置状态为待评价
		o.setConfirmDate(new Date());
		orderDAO.update(o);
		return "orderConfirmed.jsp";
	}	
	
	//删除订单
	public String deleteOrder(HttpServletRequest request, HttpServletResponse response, Page page){
		int oid = Integer.parseInt(request.getParameter("oid"));
		Order o = orderDAO.get(oid);
		o.setStatus(OrderDAO.delete);
		orderDAO.update(o);
		return "%success";		
	}
	//评价产品
	public String review(HttpServletRequest request, HttpServletResponse response, Page page) {
		int oid = Integer.parseInt(request.getParameter("oid"));//获得订单id
		Order o = orderDAO.get(oid);//取出订单
		orderItemDAO.fill(o);//填充订单项
		/*
			获取第一个订单项对应的产品,因为在评价页面需要显示一个产品图片，那么就使用这第一个产品的图片
		 */
		Product p = o.getOrderItems().get(0).getProduct();
		List<Review> reviews = reviewDAO.list(p.getId());//获取这个产品的评价集合(在页面的累计评价中显示)
		productDAO.setSaleAndReviewNumber(p);//设置销量和评价数量
		request.setAttribute("p", p);
		request.setAttribute("o", o);
		request.setAttribute("reviews", reviews);
		return "review.jsp";
	}
	//提交评价
	public String doreview(HttpServletRequest request, HttpServletResponse response, Page page) {
		int oid = Integer.parseInt(request.getParameter("oid"));
		Order o = orderDAO.get(oid);
		o.setStatus(OrderDAO.finish);//设置订单状态已完成
		orderDAO.update(o);//更新订单状态
		int pid = Integer.parseInt(request.getParameter("pid"));//获取评价页面的产品参数pid
		Product p = productDAO.get(pid);//取出产品
		
		String content = request.getParameter("content");//获取参数content (评价信息)
		
		content = HtmlUtils.htmlEscape(content);//？对评价信息进行转义

		User user =(User) request.getSession().getAttribute("user");//获取当前用户
		Review review = new Review();//创建评价对象review
		/*
			为评价对象review设置 评价信息，产品，时间，用户
		 */
		review.setContent(content);
		review.setProduct(p);
		review.setCreateDate(new Date());
		review.setUser(user);
		reviewDAO.add(review);//增加到数据库
		
		return "@forereview?oid="+oid+"&showonly=true";//客户端跳转到/forereview： 评价产品页面，并带上参数showonly=true
	}
	
}

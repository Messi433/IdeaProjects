
package sch.taobao.filter;

import org.apache.commons.lang.StringUtils;
import sch.taobao.bean.Category;
import sch.taobao.bean.OrderItem;
import sch.taobao.bean.User;
import sch.taobao.dao.CategoryDAO;
import sch.taobao.dao.OrderItemDAO;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//访问顺序 过滤器->baseServlet->Servlet
public class ForeServletFilter implements Filter {
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String contextPath=request.getServletContext().getContextPath();
		request.getServletContext().setAttribute("contextPath", contextPath);
		
		User user =(User) request.getSession().getAttribute("user");
		int cartTotalItemNumber= 0;
		if(null!=user){
			List<OrderItem> ois = new OrderItemDAO().listByUser(user.getId());
			for (OrderItem oi : ois) {
				cartTotalItemNumber+=oi.getNumber();
			}
		}
		request.setAttribute("cartTotalItemNumber", cartTotalItemNumber);
		
		List<Category> cs=(List<Category>) request.getAttribute("cs");
		if(null==cs){
			cs=new CategoryDAO().list();
			request.setAttribute("cs", cs);			
		}
		
		String uri = request.getRequestURI();
		//System.out.println("初始化输出uri      "+uri);
		uri =StringUtils.remove(uri, contextPath);
		//uri字符串包含fore且不是foreServlet
		if(uri.startsWith("/fore")&&!uri.startsWith("/foreServlet")){
			//截取fore字符串 即保留访问的方法名
			String method = StringUtils.substringAfterLast(uri,"/fore" );
			System.out.println("初始化输出method：     "+method);
			//设置属性method 给方法名 便于后台BaseForeServlet访问
			request.setAttribute("method", method);
			//跳转到foreServlet
			req.getRequestDispatcher("/foreServlet").forward(request, response);
			return;
		}

		//过滤器放行
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}
	
	
}



package sch.taobao.servlet;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import sch.taobao.dao.*;
import sch.taobao.util.Page;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class BaseBackServlet extends HttpServlet {

	public abstract String add(HttpServletRequest request, HttpServletResponse response, Page page) ;
	public abstract String delete(HttpServletRequest request, HttpServletResponse response, Page page) ;
	public abstract String edit(HttpServletRequest request, HttpServletResponse response, Page page) ;
	public abstract String update(HttpServletRequest request, HttpServletResponse response, Page page) ;
	public abstract String list(HttpServletRequest request, HttpServletResponse response, Page page) ;
	
	
	protected CategoryDAO categoryDAO = new CategoryDAO();
	protected OrderDAO orderDAO = new OrderDAO();
	protected OrderItemDAO orderItemDAO = new OrderItemDAO();
	protected ProductDAO productDAO = new ProductDAO();
	protected ProductImageDAO productImageDAO = new ProductImageDAO();
	protected PropertyDAO propertyDAO = new PropertyDAO();
	protected PropertyValueDAO propertyValueDAO = new PropertyValueDAO();
	protected ReviewDAO reviewDAO = new ReviewDAO();
	protected UserDAO userDAO = new UserDAO();
	protected AdministerDAO administerDAO = new AdministerDAO();

	//重写service方法
	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			/*获取分页信息*/
			//初始化
			int start= 0;
			int count = 5;
			try {
				start = Integer.parseInt(request.getParameter("page.start"));//获取分页参数start
			} catch (Exception e) {
				
			}
			try {
				count = Integer.parseInt(request.getParameter("page.count"));//获取分页参数count
			} catch (Exception e) {
			}
			Page page = new Page(start,count);//构造分页对象
			
			/*借助反射，调用对应的方法*/
			String method = (String) request.getAttribute("method");//获得后台的访问方法名
			//借助反射思想返回当前类指定参数的方法
			Method m = this.getClass().getMethod(method, javax.servlet.http.HttpServletRequest.class,
					javax.servlet.http.HttpServletResponse.class,Page.class);
			String redirect = m.invoke(this,request, response,page).toString();//?、方法名称参数化
			
			/*根据方法的返回值，进行相应的客户端跳转，服务端跳转，或者仅仅是输出字符串*/
			if(redirect.startsWith("@"))
				response.sendRedirect(redirect.substring(1));
			else if(redirect.startsWith("%"))
				response.getWriter().print(redirect.substring(1));
			else
				request.getRequestDispatcher(redirect).forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	//文件上传方法
	public InputStream parseUpload(HttpServletRequest request, Map<String, String> params) {
			InputStream is =null;
			try {
	            DiskFileItemFactory factory = new DiskFileItemFactory();//设置临时上传的路径
	            ServletFileUpload upload = new ServletFileUpload(factory);//声明upload对象
	            // 设置上传文件的大小限制为10M
	            factory.setSizeThreshold(1024 * 10240);
	             
	            List items = upload.parseRequest(request);//解析request对象
	            Iterator iter = items.iterator();//迭代循环
	            while (iter.hasNext()) {
	                FileItem item = (FileItem) iter.next();
	                //判断是否为为普通的表单类型
	                if (!item.isFormField()) {
	                    // item.getInputStream() 获取上传文件的输入流
	                    is = item.getInputStream();
	                } else {
	                	String paramName = item.getFieldName();//返回表单标签的name属性的值。
	                	String paramValue = item.getString();//将FileItem对象中保存的数据流内容以一个字符串返回
						//格式化paramValue
	                	paramValue = new String(paramValue.getBytes("ISO-8859-1"), "UTF-8");
	                	params.put(paramName, paramValue);
	                }
	            }
	             
	
	             
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return is;
		}
	
	 
	

}


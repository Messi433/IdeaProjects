package sch.ck.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//过滤所有信息
@WebFilter(value = {"/*"},initParams = {@WebInitParam(name = "nofilter",value = "login.jsp,fail.jsp,doLogin.java")})
public class LoginFilter implements Filter {
    private FilterConfig config;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        config = filterConfig;
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();

        String noLoginPath=config.getInitParameter("nofilter");
        if (noLoginPath!=null){
            String[] strArrays = noLoginPath.split(";");
            for (int i =0;i<strArrays.length;i++){
                if (strArrays[i]==null||"".equals(strArrays[i]))
                    continue;
                if (request.getRequestURI().contains(strArrays[i])){
                    //如果包含如下则放行
                    filterChain.doFilter(request,response);
                }
            }

        }
        if (session.getAttribute("user")!=null){

            response.sendRedirect("sucessful.jsp");
            filterChain.doFilter(request,response);//得到session，放行
            System.out.println(session);
        }else{
            //若session为空返回登录界面
            response.sendRedirect("login.jsp");
        }

    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }
}

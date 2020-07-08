package sch.ck.filterdemo;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName ="FilterDemo",value = "/index.jsp",dispatcherTypes = {DispatcherType.REQUEST },asyncSupported = true)
public class FilterDemo implements Filter{


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter--start");
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        filterChain.doFilter(request,response);
        System.out.println("filter--end");
    }

    @Override
    public void init(FilterConfig filterConfig) {

        System.out.println("初始化过滤器");

    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器");
    }
}

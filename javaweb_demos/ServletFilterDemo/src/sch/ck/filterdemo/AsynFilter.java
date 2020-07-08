package sch.ck.filterdemo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName ="AsynFilter",value = {"/asynfilter"},asyncSupported = true,dispatcherTypes = {DispatcherType.REQUEST})
public class AsynFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("destory");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("start--filter");
        HttpServletResponse response =(HttpServletResponse) servletResponse;
        HttpServletRequest  request =(HttpServletRequest) servletRequest;

        filterChain.doFilter(request,response);
        System.out.println("end--filter");


    }

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("init");
    }
}

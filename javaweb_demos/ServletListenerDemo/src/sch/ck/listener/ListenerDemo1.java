package sch.ck.listener;





import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;


@WebListener("sch.ck.listener.ListenerDemo1")


public class ListenerDemo1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        String param = sce.getServletContext().getInitParameter("InitParam");
        System.out.println(param);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destoryed");
    }
}

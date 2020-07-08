package sch.ck.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextAttributeListener implements ServletContextAttributeListener{
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("CAttributeAdd:"+scae.getName());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("CAttributeRemove:"+scae.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("CAttributeReplace:"+scae.getName());
    }
}

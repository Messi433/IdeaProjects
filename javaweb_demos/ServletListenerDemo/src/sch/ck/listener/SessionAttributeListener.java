package sch.ck.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        //获取操作该方法的监听对象名
        System.out.println("SessionAttributeAdd:"+se.getName());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("SessionAttributeRemove:"+se.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("SessionAttributeReplace:"+se.getName());
    }
}

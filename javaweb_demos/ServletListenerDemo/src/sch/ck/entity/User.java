package sch.ck.entity;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class User implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable{
    //实现活化钝化要实现序列化接口
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void valueBound(HttpSessionBindingEvent event) {
        String eventname = event.getName();
        System.out.println(eventname);
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        String eventname = event.getName();
        System.out.println(eventname);

    }

    //钝化
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("sessionWillPassivate"+se.getSource());
    }
    //活化


    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("sessionDidActivate"+se.getSource());
    }

}

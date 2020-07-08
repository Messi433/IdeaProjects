package sch.ck.listener;

import sch.ck.entity.User;
import sch.ck.util.SessionUtil;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayList;

@WebListener
public class SessionListener implements HttpSessionListener {

    private int userNumber=0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        userNumber++;
        se.getSession().getServletContext().setAttribute("userNumber",userNumber);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        userNumber--;
        se.getSession().getServletContext().setAttribute("userNumber",userNumber);
        ArrayList<User> userlist=null;
        //获得userlist
        userlist =(ArrayList<User>) se.getSession().getAttribute("userlist");
        if (SessionUtil.getUserBySessionId(userlist,se.getSession().getId())!=null){
            userlist.remove(SessionUtil.getUserBySessionId(userlist,se.getSession().getId()));
        }
    }
}

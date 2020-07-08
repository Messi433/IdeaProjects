package sch.ck.listener;



import sch.ck.entity.User;
import sch.ck.util.SessionUtil;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebListener
public class RequestListener implements ServletRequestListener {


    private ArrayList<User> userlist;
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        userlist =(ArrayList<User>) sre.getServletContext().getAttribute("userlist");
        if (userlist==null){
            userlist = new ArrayList<User>();
        }
      //获得request对象
      HttpServletRequest request=(HttpServletRequest) sre.getServletRequest();
      //获得sessionID
      String sessionId=request.getSession().getId();
      //判断userlist是否存在sessionid，若无则创建一个user放入userlist
      if (SessionUtil.getUserBySessionId(userlist,sessionId)==null){
          User user = new User();
          //user对象设置值
          user.setSessionId(sessionId);
          user.setIP(request.getRemoteUser());
          user.setFirstTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
          userlist.add(user);
      }
      sre.getServletContext().setAttribute("userlist",userlist);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }
}

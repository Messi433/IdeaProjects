package sch.ck.util;
import sch.ck.entity.User;

import java.util.ArrayList;

//判断sessionId
public class SessionUtil {

    public static Object getUserBySessionId(ArrayList<User> userlist,String sessionId){

        //若存在sessionID则返回user对象
        for (int i =0;i<userlist.size();i++){
            User user = userlist.get(i);
            if (user.getSessionId().equals(sessionId)){
                return user;
            }
        }
        return null;//则创建user对象
    }

}

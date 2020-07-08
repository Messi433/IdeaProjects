package sch.ck.entity;

public class User {
    //User实体，存放sessionID,个人IP，访问时间。
    private String sessionId;
    private String IP;
    private String FirstTime;

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setFirstTime(String firstTime) {
        FirstTime = firstTime;
    }

    public String getFirstTime() {
        return FirstTime;
    }

    public String getSessionId() {
        return sessionId;
    }

    public String getIP() {
        return IP;
    }

}

package com.mybatis.entity;

import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/30 10:40
 * @Description:订单关联用户的pojo
 */
public class OrderUser extends Order {
    private int id;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Override
    public User getUser() {
        return super.getUser();
    }

    @Override
    public void setUser(User user) {
        super.setUser(user);
    }

    @Override
    public Integer getUser_id() {
        return super.getUser_id();
    }

    @Override
    public void setUser_id(Integer user_id) {
        super.setUser_id(user_id);
    }

    @Override
    public String getOrder_number() {
        return super.getOrder_number();
    }

    @Override
    public void setOrder_number(String order_number) {
        super.setOrder_number(order_number);
    }

    @Override
    public String getNote() {
        return super.getNote();
    }

    @Override
    public void setNote(String note) {
        super.setNote(note);
    }

    @Override
    public List<Integer> getIds() {
        return super.getIds();
    }

    @Override
    public void setIds(List<Integer> ids) {
        super.setIds(ids);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                "} " + super.toString();
    }
}

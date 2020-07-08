package com.mybatis.entity;

import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/28 16:38
 * @Description:
 * 测试pojo与sqk字段不相同映射
 * 测试order与user的关联关系
 */
public class Order {
    private User user;
    private int id;
    private Integer user_id;
    private String order_number;
    private String note;
    private List<Integer> ids;

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", id=" + id +
                ", user_id=" + user_id +
                ", order_number='" + order_number + '\'' +
                ", note='" + note + '\'' +
                ", ids=" + ids +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

}

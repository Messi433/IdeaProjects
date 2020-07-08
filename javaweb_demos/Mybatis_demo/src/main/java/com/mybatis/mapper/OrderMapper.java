package com.mybatis.mapper;

import com.mybatis.entity.Order;
import com.mybatis.entity.OrderUser;
import com.mybatis.entity.User;

import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/28 18:30
 * @Description:测试pojo与sql字段不一致的映射方法(ResultMap)
 */
public interface OrderMapper {
    public List<Order> queryOrderAll();
    /*
        方法描述:一对一关联resultType
    */
    public List<OrderUser> queryOrderUser();
    /*
        方法描述:order->user 一对一关联resultMap
     */
    public List<Order> queryOrderUserByResultMap();
    /*
        方法描述:user->order 一对多关联resultMap
    */
    public List<User> queryUserOrderByResultMap();
}

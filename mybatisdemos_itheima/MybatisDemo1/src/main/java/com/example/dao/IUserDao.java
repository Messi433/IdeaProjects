package com.example.dao;

import com.example.domain.QueryVo;
import com.example.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    public List<User> findAllUser();
    public User findUserById(int id);
    public List<User> findUserByName(String username);
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(int userId);
    public int totalCount();
    public List<User> findByVo(QueryVo vo);

    /**
     * 根据查询条件查询用户，查询条件有实体类的各种属性值
     * @param user
     * @return
     */
    public List<User> findUserByCondition(User user);

    /**
     * 通过<foreach><foreach/>实现子查询
     * @param vo
     * @return
     */
    List<User> findUserInIds(QueryVo vo);

}

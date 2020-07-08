package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    @Results(id = "userMap",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "address",property = "address"),
            @Result(column = "sex",property = "sex"),
            @Result(column = "birthday",property = "birthday"),
            @Result(column = "id",property = "accounts",
                    many = @Many(select = "com.example.dao.IAccountDao.findByUid",fetchType = FetchType.LAZY))

    })
    public List<User> findAll();

    @Select("select * from user where id = #{uid}")
    @ResultMap(value = {"userMap"}) //@ResultMap("userMap")
    public User findById(int id);

    @Insert("insert into user(username,sex,birthday,address)values(#{username},#{sex},#{birthday},#{address})")
    @SelectKey(keyColumn = "id", keyProperty = "id", resultType = Integer.class, before = false, statement = {"select last_insert_id()"})
    public int saveUser(User user);

    @Update("update user set username=#{username}, address =#{address}, sex =#{sex}, birthday =#{birthday}where id =#{id}")
    public int updateUser(User user);

    @Delete("delete from user where id = #{uid}")
    public int deleteUser(Integer userId);

    @Select("select count(*) from user ")
    public int findTotal();

    @Select("select * from user where username like #{username}")
    List<User> findByName(String name);
}

package com.example.mapper;

import com.example.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface AccountMapper {
    public List<Account> findAll();
}

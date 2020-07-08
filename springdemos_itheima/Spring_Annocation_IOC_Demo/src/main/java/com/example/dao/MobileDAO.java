package com.example.dao;


import com.example.entity.Mobile;

import java.util.List;


public interface MobileDAO {
    public Mobile get(int id);
    public List<Mobile> getAll();
    public void save(Mobile mobile);
    public void update(Mobile mobile);
    public void delete(int id);
}

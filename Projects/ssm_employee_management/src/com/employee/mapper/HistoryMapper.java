package com.employee.mapper;

import java.util.List;

import com.employee.po.History;

public interface HistoryMapper {
	public int addHistory(History history);
    public int updateHistory(History history);
    public int leave(History history);
    public int awary(History history);
    public List<History> findAll(String key);
 
}

package com.employee.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.employee.mapper.HistoryMapper;
import com.employee.po.History;
@Service
public class HistoryService {
	@Resource
	private HistoryMapper historyMapper;
public List<History> findAll(String key){
	return historyMapper.findAll(key);
	
}


}

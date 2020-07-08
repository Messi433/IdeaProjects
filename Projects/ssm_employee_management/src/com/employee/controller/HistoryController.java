package com.employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.po.History;
import com.employee.service.HistoryService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/historyController")
public class HistoryController {
@Resource
private HistoryService historyService;
@RequestMapping("/findAll")
public String findAll(String key,HttpServletRequest request) {
	if(key ==null) {
		key ="";
	}
	List<History> history = historyService.findAll(key);
	request.setAttribute("history", history);
	return "pages/history/history";
}
}

package com.employee.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.support.incrementer.SqlServerMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.po.Dept;

import com.employee.service.DeptService;

@Controller
@RequestMapping("/deptController")
public class DeptController {
	@Resource
	private DeptService deptService;
@RequestMapping("/findAll")
public String findAll(HttpServletRequest request) {
	List<Dept> list = deptService.findAll();
	request.setAttribute("list",list);
	return "pages/dept/deptList";
}
@RequestMapping("/addDept")
public String addDept(Dept dept) {
	int u = deptService.addDept(dept);
	if(u != 0) {
		return "redirect:findAll";
	}
	return null;
}
@RequestMapping("/delDept")
public String delDept(int deptno,HttpServletRequest request) {
List<Dept> dept = deptService.getDept(deptno);
System.out.println(dept);
if(dept.size()== 0) {
	int u = deptService.delDept(deptno); 
	if(u > 0) {
		request.setAttribute("msg", "É¾³ý³É¹¦£¡£¡");
		return findAll(request);	
	}else {
		request.setAttribute("msg", "É¾³ýÊ§°Ü!!!");
		return findAll(request);
	}	
}else {
	request.setAttribute("msg", "É¾³ýÊ§°Ü!!!");
	return findAll(request);
}
}
@RequestMapping("/updateDept")
public String updateDept(Dept dept,HttpServletRequest request) {
	int u = deptService.updateDept(dept);
	if(u > 0) {
		request.setAttribute("msg", "ÐÞ¸Ä³É¹¦£¡£¡");
		return findAll(request);
	}else {
		request.setAttribute("msg", "ÐÞ¸ÄÊ§°Ü£¡£¡");
		return findAll(request);
	}
}
@RequestMapping("/findDept")
public String findDept(int deptno,HttpServletRequest request) {
	Dept dept = deptService.findDept(deptno);
	request.setAttribute("dept", dept);
	return "pages/dept/updateDept";
}
}

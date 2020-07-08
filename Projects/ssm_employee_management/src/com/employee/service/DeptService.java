package com.employee.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.employee.mapper.DeptMapper;
import com.employee.po.Dept;

@Service
public class DeptService {
@Resource
private DeptMapper deptMapper;
public List<Dept> findAll() {
	return deptMapper.findAll();
}
public int addDept(Dept dept) {
	return deptMapper.addDept(dept);
}
public int delDept(int deptno) {
	return deptMapper.delDept(deptno);
	
}
public List<Dept> getDept(int deptno) {
	return deptMapper.getDept(deptno);
}
public int updateDept(Dept dept) {
	return deptMapper.updateDept(dept);
}
public Dept findDept(int deptno) {
	return deptMapper.findDept(deptno);
}
}

package com.employee.mapper;

import java.util.List;

import com.employee.po.Dept;
import com.employee.po.Employee;

public interface DeptMapper {
public List<Dept> findAll();
public int addDept(Dept dept);
public List<Dept> getDept(int deptno);
public int delDept(int deptno);
public int updateDept(Dept dept);
public Dept findDept(int deptno);
public List<Employee> getDeptno(int deptno);
}

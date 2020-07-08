package com.employee.mapper;

import java.util.List;

import com.employee.po.Employee;

public interface EmployeeMapper {
public List<Employee> getDeptno(int deptno);
public List<Employee> findAll();
public int addEmployee(Employee employee);
public Employee getEmpno();
public Employee getEmployee(String empno);
public int updateEmployee(Employee employee);
public Employee leaveEmployee(String empno);
public int leave(String empno);
public int awary(String empno);
}

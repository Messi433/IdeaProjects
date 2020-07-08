package com.employee.service;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.employee.mapper.EmployeeMapper;
import com.employee.mapper.HistoryMapper;
import com.employee.po.Employee;
import com.employee.po.History;
import com.employee.util.DateUtil;

@Service
public class EmployeeService {
@Resource
private EmployeeMapper employeeMapper;
@Resource
private HistoryMapper historyMapper;

public List<Employee> findAll(){
	return employeeMapper.findAll();
}
public Employee getEmpno() {
	return employeeMapper.getEmpno();
}
@Transactional(isolation=Isolation.READ_COMMITTED,propagation =Propagation.REQUIRED ,rollbackFor = RuntimeException.class)
public int addEmployee(Employee employee) {
	try {
		int e = employeeMapper.addEmployee(employee);
		History history =new History();
		history.setEmpno(employee.getEmpno());
		history.setDeptno(employee.getDeptno());
		history.setSalary(employee.getSalary());
		history.setChangedate(employee.getEntrydate());
		history.setChangereason("ÈëÖ°");
		int h = historyMapper.addHistory(history);
		if(e > 0 && h > 0) {
	//		System.out.println("000000000000"+(e+h));
			return e+h;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
	}
		return 0;
}
public Employee getEmployee(String empno) {
	return employeeMapper.getEmployee(empno);
	
}
@Transactional(isolation=Isolation.READ_COMMITTED,propagation =Propagation.REQUIRED ,rollbackFor = RuntimeException.class)
public int updateEmployee(Employee employee,String changereason) {
	try {
		//System.out.println("111111111111"+employee);
		int e = employeeMapper.updateEmployee(employee);
		
		History history = new History();
		Date changedate =DateUtil.getNow();
		history.setEmpno(employee.getEmpno());
		history.setDeptno(employee.getDeptno());
		history.setSalary(employee.getSalary());
		history.setChangedate(changedate);
		history.setChangereason(changereason);
		int h = historyMapper.updateHistory(history);
		if(e>0&&h>0) {
			return e+h;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
	}
	return 0;	
}
public Employee leaveEmployee(String empno) {
	return employeeMapper.leaveEmployee(empno);
}
@Transactional(rollbackFor = RuntimeException.class)
public int leave(String empno,History history) {
	try {
		int e  = employeeMapper.leave(empno);
		int h = historyMapper.leave(history);
		if(e > 0 && h >0) {
			return e+h;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
	}
	return 0;
}
@Transactional(rollbackFor = RuntimeException.class)
public int awary(String empno,History history) {
	try {
		int e = employeeMapper.awary(empno);
		int h = historyMapper.awary(history);
		if(e > 0 && h >0) {
			return e+h;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
	}
	return 0;
}
}

package com.employee.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.po.Dept;
import com.employee.po.Employee;
import com.employee.po.History;
import com.employee.service.DeptService;
import com.employee.service.EmployeeService;
import com.employee.util.EmpnoUtil;

@Controller
@RequestMapping("/employeeController")
public class EmployeeController {
@Resource
private EmployeeService employeeService;
@Resource
private DeptService deptService;
@RequestMapping("/findAll")
public String findAll(HttpServletRequest request) {
	List<Employee> list = employeeService.findAll();
	if(list.size() > 0) {
		request.setAttribute("list", list);
		return "pages/emp/employeeList";
	}
	return "pages/emp/employeeList";
}
@RequestMapping("/getDeptname")
public String getDeptname(HttpServletRequest request) {
	List<Dept> list = deptService.findAll();
	request.setAttribute("deptlist", list);
	return "pages/emp/addemployee";
}
@RequestMapping("/addEmployee")
public String addEmployee(Employee employee,HttpServletRequest request) {
//	System.out.println("1111111111111"+employee);
	 String empno;
	if(employeeService.getEmpno() ==null) {
	  empno="000";
	}else {
		Employee employee3 = employeeService.getEmpno();
		empno = employeeService.getEmpno().getEmpno();
	}
	empno=EmpnoUtil.createEmpno(empno);
	Employee employee2 = new Employee();
	employee2.setEmpno(empno);
	employee2.setDeptno(employee.getDeptno());
	employee2.setEmpname(employee.getEmpname());
	employee2.setEmpsex(employee.getEmpsex());
	employee2.setEntrydate(employee.getEntrydate());
	employee2.setEmpphone(employee.getEmpphone());
	employee2.setEmpaddr(employee.getEmpaddr());
	employee2.setSalary(employee.getSalary());
//	System.out.println(employee2);
	int u = employeeService.addEmployee(employee2);
	if(u > 0) {
		request.setAttribute("msg", "添加成功！！");
		return findAll(request);
	}else {
	request.setAttribute("msg", "添加失败");
	return findAll(request);
	}
}
@RequestMapping("/getEmployee")
public String getEmployee(String empno,HttpServletRequest request) {
	List<Dept> list = deptService.findAll();
	request.setAttribute("deptlist", list);
	Employee employee = employeeService.getEmployee(empno);
	request.setAttribute("emp", employee);
	return "pages/emp/updateEmployee";
	
}
@RequestMapping("/updateEmployee")
public String updateEmployee(Employee employee,String changereason,HttpServletRequest request) {
	System.out.println(employee+"000000000000000");
	int u = employeeService.updateEmployee(employee, changereason);
	if(u>0) {
		request.setAttribute("msg", "修改成功！！");
		return findAll(request);
	}else {
		request.setAttribute("msg", "修改失败！！");
		return findAll(request);	
	}
	
}
@RequestMapping("/leaveEmployee")
public String leaveEmployee(String empno,HttpServletRequest request) {
	Employee emp = employeeService.leaveEmployee(empno);
	request.setAttribute("emp", emp);
	return "pages/emp/leaveEmployee";
	
}
@RequestMapping("/leave")
public String leave(Employee employee,HttpServletRequest request) {
	String empno = employee.getEmpno();
	History history = new History();
	history.setEmpno(employee.getEmpno());
	history.setDeptno(employee.getDeptno());
	history.setSalary(employee.getSalary());
	history.setChangereason("离职");
	history.setDimissionreason(request.getParameter("dimissionreason"));
	int u = employeeService.leave(empno, history);
	if(u>0) {
		request.setAttribute("msg", "离职成功！！");
		return findAll(request);
	}else {
		request.setAttribute("msg", "离职失败！！");
		return findAll(request);
	}	
}
@RequestMapping("/awary")
public String awary(String empno,HttpServletRequest request) {
	Employee emp = employeeService.leaveEmployee(empno);
	History history = new History();
	history.setEmpno(emp.getEmpno());
	history.setDeptno(emp.getDeptno());
	history.setSalary(emp.getSalary());
	history.setChangereason("减员离开！");
	int u = employeeService.awary(empno, history);
	if(u > 0) {
		request.setAttribute("msg", "离职成功！！");
		return findAll(request);
	}else {
		request.setAttribute("msg", "离职失败！！");
		return findAll(request);	
	}

	
}
}

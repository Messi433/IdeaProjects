package com.employee.po;

import java.sql.Date;

public class Employee {
	private String empno;
	private int deptno;
	private String deptname;
	private String empname;
	private String empsex;
	private Date entrydate;
	private String empphone;
	private String empaddr;
	private int salary;
	private String levelname;
	private Date leavedate;
	private int state;
	private int GetCount;
	public Employee() {
		super();
	}
	//查询的
	public Employee(String empno, int deptno, String deptname, String empname, String empsex, Date entrydate,
			String empphone, String empaddr, int salary, String levelname, Date leavedate, int state) {
		super();
		this.empno = empno;
		this.deptno = deptno;
		this.deptname = deptname;
		this.empname = empname;
		this.empsex = empsex;
		this.entrydate = entrydate;
		this.empphone = empphone;
		this.empaddr = empaddr;
		this.salary = salary;
		this.levelname = levelname;
		this.leavedate = leavedate;
		this.state = state;
		this.GetCount = GetCount;
	}
	//增加的
	public Employee(int deptno, String empname, String empsex, Date entrydate, String empphone, String empaddr,
			int salary, int state) {
		super();
		this.deptno = deptno;
		this.empname = empname;
		this.empsex = empsex;
		this.entrydate = entrydate;
		this.empphone = empphone;
		this.empaddr = empaddr;
		this.salary = salary;
		this.state = state;
	}
	//修改的
	public Employee(String empno, int deptno, String empphone, String empaddr, int salary) {
		super();
		this.empno = empno;
		this.deptno = deptno;
		this.empphone = empphone;
		this.empaddr = empaddr;
		this.salary = salary;
	}
	//离职的
	public Employee(String empno, int deptno, String empname, String empsex, Date entrydate, String empphone,
			String empaddr, int salary, int state) {
		super();
		this.empno = empno;
		this.deptno = deptno;
		this.empname = empname;
		this.empsex = empsex;
		this.entrydate = entrydate;
		this.empphone = empphone;
		this.empaddr = empaddr;
		this.salary = salary;
		this.state = state;
	}
	public String getEmpno() {
		return empno;
	}
	public int getDeptno() {
		return deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public String getEmpname() {
		return empname;
	}
	public String getEmpsex() {
		return empsex;
	}
	public Date getEntrydate() {
		return entrydate;
	}
	public String getEmpphone() {
		return empphone;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public int getSalary() {
		return salary;
	}
	public String getLevelname() {
		return levelname;
	}
	public Date getLeavedate() {
		return leavedate;
	}
	public int getState() {
		return state;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setEmpsex(String empsex) {
		this.empsex = empsex;
	}
	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}
	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}
	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setLevelname(String levelname) {
		this.levelname = levelname;
	}
	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getGetCount() {
		return GetCount;
	}
	public void setGetCount(int getCount) {
		GetCount = getCount;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", deptno=" + deptno + ", deptname=" + deptname + ", empname=" + empname
				+ ", empsex=" + empsex + ", entrydate=" + entrydate + ", empphone=" + empphone + ", empaddr=" + empaddr
				+ ", salary=" + salary + ", levelname=" + levelname + ", leavedate=" + leavedate + ", state=" + state
				+ ", GetCount=" + GetCount + ", getEmpno()=" + getEmpno() + ", getDeptno()=" + getDeptno()
				+ ", getDeptname()=" + getDeptname() + ", getEmpname()=" + getEmpname() + ", getEmpsex()=" + getEmpsex()
				+ ", getEntrydate()=" + getEntrydate() + ", getEmpphone()=" + getEmpphone() + ", getEmpaddr()="
				+ getEmpaddr() + ", getSalary()=" + getSalary() + ", getLevelname()=" + getLevelname()
				+ ", getLeavedate()=" + getLeavedate() + ", getState()=" + getState() + ", getGetCount()="
				+ getGetCount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}

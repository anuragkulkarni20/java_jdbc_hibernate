package com.yash.model;

public class Employee {
  int empid;
  String ename;
  String eadd;
  float salary;
  
  public Employee() {
		super();
	}

	public Employee(int empid, String ename, String eadd, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.eadd = eadd;
		this.salary = salary;
	}
	
public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public String getEadd() {
	return eadd;
}

public void setEadd(String eadd) {
	this.eadd = eadd;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}


  
}

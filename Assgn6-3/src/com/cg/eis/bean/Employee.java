/* 5.1: Refer the case study 2 in page no: 5 and create an application for that requirement 
   by creating packages and classes as given below:
a) com.cg.eis.bean
	In this package, create “Employee” class with different attributes such as id, name,
	salary, designation, insuranceScheme.
b) com.cg.eis.service
	This package will contain code for services offered in Employee Insurance System. 
	The service class will have one EmployeeService Interface and its corresponding 
	implementation class.
c) com.cg.eis.pl
	This package will contain code for getting input from user, produce expected output to 
	the user and invoke services offered by the system.
	The services offered by this application currently are:
i)  Get employee details from user.
ii) Find the insurance scheme for an employee based on salary and designation.
iii) Display all the details of an employee. */

package com.cg.eis.bean;

import com.cg.eis.service.EmployeeService;

public class Employee extends EmployeeService{
	int empId;
	String empName;
	float empSal;
	String empDesign;
	
	public Employee() 
	{
		super();
	}

	public Employee(int empId, String empName, float empSal, String empDesign) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesign = empDesign;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesign() {
		return empDesign;
	}

	public void setEmpDesign(String empDesign) {
		this.empDesign = empDesign;
	}

	public String dispInfo() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + ", empDesign=" + empDesign + "]";
	}
}
		
	



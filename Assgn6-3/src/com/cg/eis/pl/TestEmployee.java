package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.ValidateSalaryImpl;

public class TestEmployee
{
	
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Employee ID: ");
	int eId=scan.nextInt();
	System.out.println("Enter the Employee Name: ");
	String eName=scan.next();
	System.out.println("Enter the Employee's Salary: ");
	float eSal=scan.nextFloat();
	System.out.println("Enter the Employee Design: ");
	String eDesign=scan.next();

	Employee io=new Employee(eId,eName,eSal,eDesign); 
	
	try 
	{
		ValidateSalaryImpl v= new ValidateSalaryImpl();
		if(v.ValidSalary(eSal))
		{
			System.out.println(io.dispInfo());
			io.findInsuranceScheme(eSal, eDesign);
		}
	}
	catch (EmployeeException e) 
	{
		System.out.println(e);
		e.printStackTrace();
	}
	scan.close();
}
}
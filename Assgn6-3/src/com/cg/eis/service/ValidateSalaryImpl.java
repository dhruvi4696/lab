package com.cg.eis.service;

import com.cg.eis.exception.EmployeeException;

public class ValidateSalaryImpl implements ValidateSalary
{
	public boolean ValidSalary(double salary) throws EmployeeException 
	{
		boolean bln =true;
		try
		{
			if(salary>3000)
			{
				bln =true;
			}
			else
			{
				throw new EmployeeException("Salary should be > 3000!");
			}
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
			bln=false;
		}
		return bln;
	}
}

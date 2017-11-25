package com.cg.eis.service;

import com.cg.eis.exception.EmployeeException;



public interface ValidateSalary
{
	public boolean ValidSalary(double salary) throws EmployeeException;
}

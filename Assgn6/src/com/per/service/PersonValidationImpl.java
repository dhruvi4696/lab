package com.per.service;

import com.per.exception.PersonException;

public class PersonValidationImpl implements PersonValidation 
{

	@Override
	public boolean ValidateAge(int age) throws PersonException 
	{
		boolean bln = false;
		try {
			if(age>15)
			{
				bln= true;
			}
			else
			{
				throw new PersonException("Person age must be >0 !");
			}
		} 
		catch (PersonException e) 
		{	
			System.out.println(e.getMessage());
		}	
		return bln;
	}
	
}

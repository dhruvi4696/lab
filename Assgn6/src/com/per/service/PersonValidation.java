package com.per.service;

import com.per.exception.PersonException;

public interface PersonValidation  
{
	public boolean ValidateAge(int age) throws PersonException; 
}

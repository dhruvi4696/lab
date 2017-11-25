package com.per.service;

import com.per.bean.AccountBean;

public class CurrentAccountService extends AccountBean
{
	final double minBalance =500;
	double updatedBal=0;
	
	public void withdraw(double withdrawAmt, double balance)
	{
		
		if(( balance>minBalance) && (withdrawAmt<balance ))
		{
			updatedBal=balance- withdrawAmt; 	
			System.out.println("your updated balance is :"+ updatedBal+"\n");
		}
		else
        {
			System.out.println("You have insufficient balance!");
		}
	}
	
}

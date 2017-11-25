package com.per.service;

import com.per.bean.AccountBean;

public class SavingAccountService extends AccountBean
{
	final double overdraftLimit= 20000;

	public void withdraw(double withdrawAmt, double balance)
	{
		if( (balance-withdrawAmt)<-20000)
		{
			System.out.println("You have reached overdraft limit!");
		}
		else
        {
			double updatedBal=balance-withdrawAmt ;
			System.out.println("Your updated balance is :"+ updatedBal+"\n");
		}
	}

}

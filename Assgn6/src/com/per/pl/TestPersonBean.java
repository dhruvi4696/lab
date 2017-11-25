package com.per.pl;

import java.util.Scanner;
import com.per.bean.AccountBean;
import com.per.exception.PersonException;
import com.per.service.CurrentAccountService;
import com.per.service.PersonValidation;
import com.per.service.PersonValidationImpl;
import com.per.service.SavingAccountService;

public class TestPersonBean 
{
	public static void main(String[] args) 
	{
		AccountBean dhruvi = new AccountBean();
		CurrentAccountService c = new CurrentAccountService();
		SavingAccountService s= new SavingAccountService();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter person name: ");
		String name = sc.next();
		System.out.print("Enter person age: ");
		int age= sc.nextInt();
		System.out.print("Enter account num: ");
		int accnum = sc.nextInt();
		System.out.print("Enter balance: ");
		double balance = sc.nextDouble();
		
		dhruvi.setPerName(name);
		dhruvi.setPerAge(age);
		dhruvi.setAccNum(accnum);
		dhruvi.setBalance(balance);
	
		PersonValidation p = new PersonValidationImpl();
		try {
			if(p.ValidateAge(age))
			{
				System.out.println(dhruvi.dispInfo());
				System.out.println("1. check withdraw 2.check overdraft : ");
				int n= sc.nextInt();
				
				switch (n)
				{
				case 1:
				{
					System.out.println("Enter amount to withdraw check :");
					double amnt= sc.nextDouble();
					c.withdraw(amnt,balance);
					break;
				}
				case 2:
				{
					System.out.println("Enter amount to overdraft check :");
					double amnt= sc.nextDouble();
					s.withdraw(amnt,balance);
					break;
				}	
			}
			}
		}
		 catch (PersonException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}		
	}
}

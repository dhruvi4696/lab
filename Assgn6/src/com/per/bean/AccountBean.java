package com.per.bean;

import com.per.service.CurrentAccountService;

public class AccountBean extends PersonBean
{
	long accNum;
	double balance;
	public AccountBean()
	{
		super();
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountBean(long accNum, double balance,String perName, int perAge) 
	{
		super();
		this.accNum = accNum;
		this.balance = balance;
	}

	@Override
	public String dispInfo() {
		return super.dispInfo()+"AccountBean [accNum=" + accNum + ", balance=" + balance + "]";
	}	
	
}

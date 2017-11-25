package com.cg.eis.service;

public class EmployeeService implements Service
{

@Override
public void findInsuranceScheme(float empSal, String empDesign)
{
	String str="";
	if(empSal>5000 && empSal<20000 )
	{
		if(empDesign.equals("SystemAssociate"))
		{
			 str= "Scheme C";
		}
	}
	else if(empSal>=20000 && empSal<40000)
	{
		if(empDesign.equals("Programmer"))
		{
			 str= "Scheme B";
		}
	}
	else if(empSal>=40000)
	{
		if(empDesign.equals("Manager"))
		{
			 str= "Scheme A";
		}
	}
	else
	{
		str="No Scheme";
	}
	System.out.println(str);
}

}

	
	
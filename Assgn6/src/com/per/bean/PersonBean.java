package com.per.bean;

public class PersonBean
{
	String perName;
	int perAge;

	public PersonBean()
	{
		super();
	}

	public PersonBean(String perName, int perAge) 
	{
		this.perName = perName;
		this.perAge= perAge;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public int getPerAge() {
		return perAge;
	}

	public void setPerAge(int perAge) {
		this.perAge = perAge;
	}

	public String dispInfo() {
		return "PersonBean [perName=" + perName + ", perAge=" + perAge + "]";
	}
}

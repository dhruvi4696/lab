package com.cg.eis.lab71;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array list: ");
		int size= sc.nextInt();
		
		try 
		{
			if(size>0)
			{
				for(int len=0;len<size;len++)
				{
					System.out.print("enter string element :");
					String str = sc.next();
					String newpattern = "[A-Za-z]+";
			    	
			    	if(Pattern.matches(newpattern, str))
			    	{
			    		list.add(str);
			    	}
			    	else
			    	{
			    		throw new InvalidInputException ("Invalid input type !");
			    	}
				}
				System.out.println("before sorting the list is : "+list);
				Collections.sort(list);
				System.out.println("after sorting the list is : "+list);
			}
			else
			{
				throw new InvalidSizeException("size can not be 0 or negative !");
			}
		} 
		catch (InvalidSizeException e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		catch(InvalidInputException ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
		}
	}
}

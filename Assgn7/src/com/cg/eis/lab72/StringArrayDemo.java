package com.cg.eis.lab72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringArrayDemo 
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
			    		throw new InvalidInputExceptionDemo ("Invalid input type !");
			    	}
				}
				for(String temp:list)
				{
					System.out.println(temp);
				}

				Collections.sort(list);
				System.out.println("\nafter sorting:");
				for(String temp:list)
				{
					System.out.println(temp);
				}
			}
			else
			{
				throw new InvalidSizeExceptionDemo("size can not be 0 or negative !");
			}
		} 
		catch (InvalidSizeExceptionDemo e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		catch(InvalidInputExceptionDemo ae)
		{
			System.out.println(ae);
			ae.printStackTrace();
		}
	}
}

package com.hanum;

public class Palindrome {

	public static void main(String [] args)
	{
		String str="Gadag";
		str=str.toLowerCase();
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		if(str.equals(rev))
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrome");
		}
	}
}

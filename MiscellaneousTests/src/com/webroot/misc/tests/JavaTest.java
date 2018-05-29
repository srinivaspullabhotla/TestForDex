package com.webroot.misc.tests;


public class JavaTest {
	
/*	public static void main(String[] args) {
		
		long val = Test.main("55");
		System.out.println(val);
		
		Test.main("100");
		
	}*/
	
	public static long main(String str) {
		
		long val;
		
		try {
			
			val = Long.parseLong(str);
			
		} catch(NumberFormatException e)
		
		{
			
			val = -1L;
			
		}
		return val;
	}
	
	public static void main(String[] args) {
		
		//Console should print -1 - per what is defined in catch exception. 
		// In this case, console won't print the exception but as defined prints -1.
		System.out.println(JavaTest.main("@#$%"));
	}

}


package com.webroot.misc.tests;

import java.io.*;

//example for public static void main(String[] args)

public class JavaPractice {

	// example for constructor and also example for constructor overloading.

	//Example for default constructor (w/o arguments)
		int num;
		int id;
		String name;
		
		JavaPractice() {
			
			System.out.println("Constructor Called");
		}
		
		JavaPractice(String name, int id) {
			
			this.name = name;
			this.id = id;
			
		}
 
	
		
	
	final static synchronized strictfp public void main(String... sri) {
		
		JavaPractice jp = new JavaPractice("Sri", 9);
		System.out.println(jp.num);
		System.out.println(jp.name);
		System.out.println("valid main");
		System.out.println("Developer Name : " + jp.name + " Developer ID : " + jp.id);
		
		
	}
	
	

	
	
}



package com.webroot.misc1.tests;

import com.webroot.misc.tests.*;

public class ExampleDefaultClassTest {
	
	public static void main(String[] args) {
		
		//The following will throw a compile time error due to default class cannot be access by another package.
		//ExampleDefaultClass default = new ExampleDefaultClass();
		//default.msg();
		
	}

}

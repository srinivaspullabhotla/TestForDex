package com.webroot.misc.tests;

public class MethodHiding {
	
	 static void display() {
		
		System.out.println("Static or class method from Base.");
		
	}
	
	public void print() {
		
		System.out.println("Non-static or instance method from Base");
		
	}

}

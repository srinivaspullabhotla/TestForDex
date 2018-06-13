package com.webroot.misc.tests;

import com.webroot.misc.tests.MethodHiding;


	public class Derived extends MethodHiding {
		
		static void display() {
			
			System.out.println("Static or class method from Derived");
		}
		
		public void print() {
			
			System.out.print("Non-static or instance method from Derived");
			
		}
		
	public static void main(String[] args) {
			
				MethodHiding mh1 = new Derived();
				mh1.display();
				mh1.print();
			
		}
		
	}

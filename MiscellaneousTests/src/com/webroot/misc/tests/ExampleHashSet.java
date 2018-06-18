package com.webroot.misc.tests;

import java.util.HashSet;

public class ExampleHashSet {
	
	public static void main(String[] args) {
		
		//HashSet does not allow duplicate values.
		//It provides add method rather put method.
		//We can also use contain method to check whether the object is already available in HashSet. 
		//HashSet can be used where we want to maintain a unique list.
		
		//create a HashSet
//		HashSet<String> hset = new HashSet<String>();
		
		//add elements to HashSet
	/*	hset.add("AA");
		hset.add("BB");
		hset.add("CC");
		hset.add("DD");
*/		
		//Displaying HashSet elements
		/*System.out.println("HashSet contains: ");
		for(String temp : hset) {
			
			System.out.println(temp);*/
			
		
		HashSet<String> mySet = new HashSet<String>();
		mySet.add("First");
		mySet.add("Second");
		mySet.add("Third");
		mySet.add("Third"); //This is a duplicate entry and the HashSet showed only the unique values.
		
		System.out.println(mySet);
		
		if (mySet.contains("First")) {
			
			System.out.println("I know it - you know.");
			
			}
			
		}
		
	}

//}

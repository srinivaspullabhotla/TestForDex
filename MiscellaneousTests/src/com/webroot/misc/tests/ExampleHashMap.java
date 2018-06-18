package com.webroot.misc.tests;

import java.util.Collections;
import java.util.HashMap;

public class ExampleHashMap {
	
	public static void main(String[] args) {
		
		//create a HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//add elements to HashMap
		hmap.put(1, "AA");
		hmap.put(2, "BB");
		hmap.put(3, "CC");
		hmap.put(4, "DD");
		hmap.put(5, "AA");
		
		
		//display HashMap elements
		System.out.println("HashMap Elements: " + hmap);
		
	}

}

//To synchronize the HashSet and HashMap

//Set s = Collections.synchronizedSet(new HashSet(  ))

//Map m = Collections.synchronizedMap(new HashMap(...));

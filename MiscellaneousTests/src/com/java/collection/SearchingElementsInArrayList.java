package com.java.collection;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class SearchingElementsInArrayList {
	
	public static void main(String[] args) {
		
		List<String> searchNamesList = new ArrayList<>();
		searchNamesList.add("Mihir");
		searchNamesList.add("Sapna");
		searchNamesList.add("Srinivas");
		searchNamesList.add("Nayanamma");
		searchNamesList.add("Tatagaru");
		searchNamesList.add("Babai");
		searchNamesList.add("Pinni");
		searchNamesList.add("Karthikeya");
		searchNamesList.add("Srinidhi");
		searchNamesList.add("Nana");
		searchNamesList.add("Nani");
		searchNamesList.add("Maasi");
		
		
		System.out.println(searchNamesList);
		
		//Search using contains() method.
		System.out.println("Does the name in the list contains \"Srinivas\" ? " + searchNamesList.contains("Srinivas"));
		
		//Search using indexOf() method.
		System.out.println("Index of \"Sapna\" is " + searchNamesList.indexOf("Sapna"));
		System.out.println("Index of \"Sapna\" is " + searchNamesList.indexOf("Sandhya"));
		
		//Search using lastIndexOf() method.
		System.out.println("Last index of \" Satish \" is : " + searchNamesList.lastIndexOf("Garigipati"));
		System.out.println("Last index of \" Satish \" is : " + searchNamesList.lastIndexOf("Babai"));
		
		
	}

}

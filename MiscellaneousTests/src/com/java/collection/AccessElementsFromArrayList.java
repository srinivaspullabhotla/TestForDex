package com.java.collection;

import java.util.*;
import java.util.List;

public class AccessElementsFromArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> topCompanies = new ArrayList<>();
		
		//check if an ArrayList is empty
		System.out.println("Is topCompanies list empty? :" + topCompanies.isEmpty());
		
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");
		
		//Find the size of an ArrayList
		System.out.println("Here are the top " + topCompanies.size() + " companies in the world.");
		System.out.println(topCompanies);
		
		//Retrieve the element at a given index
		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size() - 1);
		
		System.out.println("Best Company: " + bestCompany);
		System.out.println(secondBestCompany);
		System.out.println(lastCompany);
		
		//modify elements at a given index
		topCompanies.set(4, "Walmart");
		System.out.println("New list of Top Companies " + topCompanies);
		
		//Verify if the top companies list is empty
		System.out.println("Is the topCompanies list empty : " + topCompanies.isEmpty());
		
	}
	
}

package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArray {

	public static void main(String[] args) {
		
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		
		System.out.println("Initial List:" + programmingLanguages);
		
		//Remove the element at index '5'
		programmingLanguages.remove(5);
		System.out.println("After remove(5): " + programmingLanguages);
		
		
		
	}
	
}

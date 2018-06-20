package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArray {

	public static void main(String[] args) {
		
		List<String> programmingLanguages = new ArrayList<>();
		//or we can declare the following way
		//ArrayList<String> programmingLanguages = new ArrayList<String>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		
		System.out.println("Initial List:" + programmingLanguages);
		
		//Remove the element at index '5'
		/*programmingLanguages.remove(5);
		System.out.println("After remove(5): " + programmingLanguages);*/
		
		//Remove the first occurrence of the given element from the ArrayList
		//The Remove returns false if the element does not exist.
		boolean isRemoved = programmingLanguages.remove("Ruby");
		System.out.println(programmingLanguages);
		
		List<String> scriptingLanguages = new ArrayList<>();
		scriptingLanguages.add("JavaScript");
		scriptingLanguages.add("VB Script");
		scriptingLanguages.add("Python");
		scriptingLanguages.add("TypeScript");
		
		System.out.println(scriptingLanguages);
		
		programmingLanguages.removeAll(scriptingLanguages);
		System.out.println(programmingLanguages);
		
		//Remove all elements that satisfy a given predicate.
		programmingLanguages.removeIf(new Predicate<String>() {
			
			@Override
			public boolean test(String s) {
				
				return s.startsWith("p");
			//The above can also be implemented using Lambda as below :
				//programmingLanguages.removeIf(s -> s.startsWith("C"));
				
			}
			
		});
		
		//Remove all elements from the ArrayList
		programmingLanguages.clear();
		System.out.println(programmingLanguages);
		
	}
	
}
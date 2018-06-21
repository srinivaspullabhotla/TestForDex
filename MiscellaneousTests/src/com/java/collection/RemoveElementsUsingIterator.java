package com.java.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class RemoveElementsUsingIterator {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(9);
		numbers.add(18);
		numbers.add(27);
		numbers.add(36);
		numbers.add(45);
		
		System.out.println(numbers);
		
		Iterator<Integer> numbersIterator = numbers.iterator();
		while (numbersIterator.hasNext()) {
			
			Integer num = numbersIterator.next();
			if(num % 2 != 0) {
				
				numbersIterator.remove();
				
			}
			
		}
		
		System.out.println(numbers);
	}
	
}

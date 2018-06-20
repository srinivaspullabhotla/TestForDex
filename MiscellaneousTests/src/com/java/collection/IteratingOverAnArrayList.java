package com.java.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingOverAnArrayList {

	public static void main(String[] args) {
		
		List<String> tvShows = new ArrayList<>();
		tvShows.add("Breaking Bad");
		tvShows.add("Homeland");
		tvShows.add("BlindSpot");
		tvShows.add("Game Of Thrones");
		tvShows.add("Friends");
		tvShows.add("Prison Break");
		
		System.out.println(tvShows);
		System.out.println( );
		
		System.out.println("=== Iterate using Java 8 forEach and lambda ===");
		tvShows.forEach(tvShow -> { 
			
			System.out.println(tvShow + "\n");
			
		});
		
		System.out.println("\n=== Iterate using an iterator() ===");
		Iterator<String> tvShowIterator = tvShows.iterator();
		while(tvShowIterator.hasNext()) {
			
			String tvShow = tvShowIterator.next();
			System.out.println(tvShow);
		}
		
		System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
	        tvShowIterator = tvShows.iterator();
	        tvShowIterator.forEachRemaining(tvShow -> {
	            System.out.println(tvShow);
	        });
		
	    System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
	        // Here, we start from the end of the list and traverse backwards.
		ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
		while(tvShowListIterator.hasPrevious()) {
			
			String tvShow = tvShowListIterator.previous();
			System.out.println(tvShow);
		}
		
		System.out.println("\n=== Iterate using simple for-each loop ===");
				for(String tvShow: tvShows) {
					
					System.out.println(tvShow);
				
			}
				
		System.out.println("\n=== Iterate using for loop with index ===");
				for(int i=0; i < tvShows.size(); i++) {
					
					System.out.println(tvShows.get(i));
					
				}
		
			}
		
}

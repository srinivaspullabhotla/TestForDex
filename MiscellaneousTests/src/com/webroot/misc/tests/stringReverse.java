package com.webroot.misc.tests;

import java.lang.*;
import java.io.*;
import java.util.*;

public class stringReverse {
	
	public static void main(String[] args) {
		
		String input = "Srinivas Pullabhotla";
	
		//Method # 1
/*		byte[] strAsByteArray = input.getBytes();
		byte[] result = new byte [strAsByteArray.length];
		
		for (int i=0; i<strAsByteArray.length; i++) {
			
			result[i] = strAsByteArray[strAsByteArray.length-i-1];
			
			System.out.println(new String(result));*/
	
			//Method # 2
/*			StringBuilder input1 = new StringBuilder();
			input1.append(input);
			input1 = input1.reverse();
			
			for(int i=0; i<input1.length(); i++) {
				
				System.out.println(input1.charAt(i));
			}*/
			
		//Method # 3
		char[] try1 = input.toCharArray();
		for (int i=try1.length-1; i>=0; i--) {
			
			System.out.print(try1[i]);
		
		//method # 4
		 /*char[] temparray = input.toCharArray();
	        int left, right=0;
	        right = temparray.length-1;
	 
	        for (left=0; left < right ; left++ ,right--)
	        {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right]=temp;
	        }
	 
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();*/
		
		
		//method # 5
/*			char[] hello = input.toCharArray();
	        List<Character> trial1 = new ArrayList<>();
	 
	        for (char c: hello)
	            trial1.add(c);
	 
	        Collections.reverse(trial1);
	        ListIterator li = trial1.listIterator();
	        while (li.hasNext())
	            System.out.print(li.next());*/
				
		}
		
		
	}
		

	
}

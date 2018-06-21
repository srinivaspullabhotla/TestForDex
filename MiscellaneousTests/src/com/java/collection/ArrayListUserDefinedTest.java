package com.java.collection;

import java.util.List;
import java.util.ArrayList;

public class ArrayListUserDefinedTest {

	public static void main(String[] args) {
		
		List<UserDefinedArrayList> userDefAl = new ArrayList<>();
		userDefAl.add(new UserDefinedArrayList("Mihir", 7));
		userDefAl.add(new UserDefinedArrayList("Sapna", 38));
		userDefAl.add(new UserDefinedArrayList("Srinivas", 41));
		
		userDefAl.forEach(user -> {
			
			System.out.println("Name : " + user.getName() + ", Age : " + user.getage());
			
		});
		
	}
	
}

package com.java.collection;

import java.util.*;

public class ArrayListDemo {
	
	public void ArrayListAddRemove() {
		
		ArrayList list = new ArrayList();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.add(2, "M");
		System.out.println(list);
		
		list.add("N");
		System.out.println(list);
		
	}
	
	public void miscList() {
	
	ArrayList al = new ArrayList();
	LinkedList ll = new LinkedList();
	System.out.println("al instanceOf Serializable"); //True
	System.out.println("ll instanceOf Clonable"); //True
	System.out.println("al instanceOf RandomAccess"); //True
	System.out.println("ll instanceOf RandomAccess"); //False

	}
}
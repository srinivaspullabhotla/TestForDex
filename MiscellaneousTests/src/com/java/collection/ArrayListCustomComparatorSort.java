package com.java.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ArrayListCustomComparatorSort {
	
	private String name;
	private Integer age;
	
	public void Person(String name, Integer age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public Integer getAge() {
		
		return age;
		
	}
	
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setAge(Integer age) {
		
		this.age = age;
		
	}
	
	@Override 
	public String toString() {
		
		return "{" + 
				
				"Name='" + name + '\'' + 
				", Age=" + age +
				'}';
	}
	
	
	
}

package com.java.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionSort {
	
	private String Name;
	private int Age;
	
	public static void main(String[] args) {
		
		List<Integer> pmsDeploymentClusters = new ArrayList<>();
		pmsDeploymentClusters.add(27);
		pmsDeploymentClusters.add(18);
		pmsDeploymentClusters.add(9);
		pmsDeploymentClusters.add(36);
		pmsDeploymentClusters.add(54);
		
		System.out.println("Before sorting : " + pmsDeploymentClusters);
		
		//Sort the clusters using Collections.sort() method
		Collections.sort(pmsDeploymentClusters);
		
		System.out.println("After sorting : " + pmsDeploymentClusters);
		
	}

}


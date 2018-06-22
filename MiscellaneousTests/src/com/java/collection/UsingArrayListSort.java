package com.java.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class UsingArrayListSort {
	
	public static void main(String[] args){
		
		List<String> pmsClusterNames = new ArrayList<>();
		pmsClusterNames.add("Continuous (general)");
		pmsClusterNames.add("Continuous - Japanese");
		pmsClusterNames.add("Continuous - Au, Nz, Za");
		pmsClusterNames.add("CherryBlossom Scanner");
		pmsClusterNames.add("DeepCrawler");
		pmsClusterNames.add("Enzo");
		pmsClusterNames.add("DNS-P Suspicious");
		pmsClusterNames.add("DAC-uncat");
		pmsClusterNames.add("WA");
		pmsClusterNames.add("Reclassifier");
		pmsClusterNames.add("Domain Tracker");
		pmsClusterNames.add("RTAP");
		pmsClusterNames.add("Script Threat Scan");
		pmsClusterNames.add("CC Refresh");
		pmsClusterNames.add("Classifier-V3 URL Crawler");
		pmsClusterNames.add("Domain Tools Import");
		pmsClusterNames.add("URL Shortners");
		pmsClusterNames.add("Threat Accuracy");
		pmsClusterNames.add("JavaScript Scanner");
		
		System.out.println(pmsClusterNames);
		
		//Sort the ArrayList using it's sort(). We need to pass the Comparator to the ArrayList.sort() method
		pmsClusterNames.sort(new Comparator<String>() {
			
			@Override
			public int compare(String pmsClusterName1, String pmsClusterName2) {
				
				return pmsClusterName1.compareTo(pmsClusterName2);
				
			}
			
		});
		
		pmsClusterNames.sort((pmsClusterName1, pmsClusterName2) -> pmsClusterName1.compareTo((pmsClusterName2)));
		
		//more concise solution
		pmsClusterNames.sort(Comparator.naturalOrder());
		
		System.out.println("Sorted Names : " + pmsClusterNames);
	}

}
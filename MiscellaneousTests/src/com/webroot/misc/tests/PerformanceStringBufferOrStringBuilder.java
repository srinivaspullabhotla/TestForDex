package com.webroot.misc.tests;

public class PerformanceStringBufferOrStringBuilder {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuffer buff = new StringBuffer("Mihir");
		for(int i = 0; i <10000; i++) {
			
			buff.append(" Pullabhotla");
		
		}
		
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		long beginTime = System.currentTimeMillis();
		StringBuilder sbuild = new StringBuilder("Mihir Pullabhotla");
		for (int i = 0; i <10000; i++) {
			
			sbuild.append(" Pullabhotla");
			
		}
		
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - beginTime)  + "ms");
		
		
	}

}

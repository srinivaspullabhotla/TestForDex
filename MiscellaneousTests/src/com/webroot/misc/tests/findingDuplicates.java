package com.webroot.misc.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class findingDuplicates {

	private static final String INPUT_FILE = "C:\\PowerShell Automation\\JSOutputUrls.txt";
    private static final String OUTPUT_FILE = "C:\\PowerShell Automation\\dataoutput.txt";

	    public static void main (String[] args) throws IOException {
		
	    try(BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(INPUT_FILE))));
	    	PrintWriter pw = new PrintWriter(new FileWriter(OUTPUT_FILE, true)))
	    {
	    String line;
		
		boolean hasDuplicate = false;
		Set<String> lines = new HashSet<String>();
		while ( (line = br.readLine()) != null && !hasDuplicate )
		    {
		        if (lines.contains(line)) {
		            hasDuplicate = true;
		        }
		        lines.add(line);
		    }
	
		    if (hasDuplicate){
		        System.out.print("NOT UNIQUE");
		    } else {
		        System.out.print("UNIQUE");
		    }
		    br.close();
	    	}
		}
}

package com.webroot.misc.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;

/*
 * URL Shortener
 */
public class URLShortener {
	// declaring input and output files
	private static final String INPUT_FILE = "C:\\PowerShell Automation\\data.txt";
    private static final String OUTPUT_FILE = "C:\\PowerShell Automation\\dataoutput.txt";
	
	// storage for generated keys
	private HashMap<String, String> keyMap; // key-url map
	private HashMap<String, String> valueMap;// url-key map to quickly check
												// whether an url is
	// already entered in our system
	private String domain; // Use this attribute to generate urls for a custom
							// domain name defaults to http://fkt.in
	private char myChars[]; // This array is used for character to number
							// mapping
	private Random myRand; // Random object used to generate random integers
	private int keyLength; // the key length in URL defaults to 8

	// Default Constructor
	URLShortener() {
		keyMap = new HashMap<String, String>();
		valueMap = new HashMap<String, String>();
		myRand = new Random();
		keyLength = 8;
		myChars = new char[62];
		for (int i = 0; i < 62; i++) {
			int j = 0;
			if (i < 10) {
				j = i + 48;
			} else if (i > 9 && i <= 35) {
				j = i + 55;
			} else {
				j = i + 61;
			}
			myChars[i] = (char) j;
		}
		domain = "http://fkt.in";
	}

	// Constructor which enables you to define tiny URL key length and base URL
	// name
	URLShortener(int length, String newDomain) {
		this();
		this.keyLength = length;
		if (!newDomain.isEmpty()) {
			newDomain = sanitizeURL(newDomain);
			domain = newDomain;
		}
	}

	// shortenURL
	// the public method which can be called to shorten a given URL
	public String shortenURL(String longURL) {
		String shortURL = "";
		if (validateURL(longURL)) {
			longURL = sanitizeURL(longURL);
			if (valueMap.containsKey(longURL)) {
				shortURL = domain + "/" + valueMap.get(longURL);
			} else {
				
				shortURL = domain + "/" + getKey(longURL);
			}
		}
		// add http part
		return shortURL;
	}

	// expandURL
	// public method which returns back the original URL given the shortened url
	public String expandURL(String shortURL) {
		String longURL = "";
		String key = shortURL.substring(domain.length() + 1);
		longURL = keyMap.get(key);
		return longURL;
	}

	// Validate URL
	// not implemented, but should be implemented to check whether the given URL
	// is valid or not
	boolean validateURL(String url) {
		return true;
	}

	// sanitizeURL
	// This method should take care various issues with a valid url
	// e.g. www.google.com,www.google.com/, http://www.google.com,
	// http://www.google.com/
	// all the above URL should point to same shortened URL
	// There could be several other cases like these.
	/*String sanitizeURL(String url) {
		if (url.substring(0, 10).equals("http://"))
			url = url.substring(7);

		if (url.substring(0, 8).equals("https://"))
			url = url.substring(8);

		if (url.charAt(url.length() - 1) == '/')
			url = url.substring(0, url.length() - 1);
		return url;
	}*/
	
	String sanitizeURL(String url) {
		if (url.startsWith("http://"))
			url = url.substring(7);

		if (url.startsWith("https://"))
			url = url.substring(8);

		if (url.endsWith("/"))
			url = url.substring(0, url.length() - 1);
		
		return url;
	}

	/*
	 * Get Key method
	 */
	private String getKey(String longURL) {
		String key;
		key = generateKey();
		keyMap.put(key, longURL);
		valueMap.put(longURL, key);
		return key;
	}

	// generateKey
	private String generateKey() {
		String key = "";
		boolean flag = true;
		while (flag) {
			key = "";
			for (int i = 0; i <= keyLength; i++) {
				key += myChars[myRand.nextInt(62)];
			}
			// System.out.println("Iteration: "+ counter + "Key: "+ key);
			if (!keyMap.containsKey(key)) {
				flag = false;
			}
		}
		return key;
	}

	// test the code
	public static void main(String args[]) throws IOException {
		URLShortener u = new URLShortener(100, "https://is.gd/");
		/* "C:\\PowerShell Automation\\dataoutput.txt")); */
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File(INPUT_FILE))));
				 // *** open for append
				PrintWriter pw = new PrintWriter(new FileWriter(OUTPUT_FILE, true)))
				
				{
			String line;
			while ((line = br.readLine()) != null) {
				String shortenedUrl = u.shortenURL(line);
				System.out.println(new String(
						"URL:" + line + "\t" + shortenedUrl + "\tExpanded: " + u.expandURL(shortenedUrl)));
				
				pw.println(shortenedUrl);
				
				
			}
		}
	}

}

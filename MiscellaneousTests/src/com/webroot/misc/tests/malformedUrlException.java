package com.webroot.misc.tests;

import java.net.MalformedURLException;
import java.net.URL;

public class malformedUrlException {
	
	   public static void main(String[] args)
		         throws MalformedURLException{

		      URL url=new URL("http://www.developer.com" + "/java/data/working-with-javafx-chart-apis.html");

		      System.out.println(url.getProtocol());
		      System.out.println(url.getHost());
		      System.out.println(url.getFile());
		      System.out.println(url.toExternalForm());
		   }

}
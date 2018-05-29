package com.webroot.misc.tests;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class knowLoopback {
	
	/**
	 * @param args
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress address1 = InetAddress.getLocalHost();
		System.out.println(address1);
		
		InetAddress address2 = InetAddress.getLoopbackAddress();
		System.out.println(address2);
		
		InetAddress address3=InetAddress.getByName("www.twitter.com");
		System.out.println(address3);
		
		InetAddress[] arr=InetAddress.getAllByName("www.google.com");
		for(InetAddress a: arr) {
		System.out.println(a);
		}
				
	}
	
}

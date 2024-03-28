package com.java.problems;

public class Problem_38 {

	public static void main(String[] args) {
		/*
		 * Given a vaild(IPv4) Ip address, return a defanged version of that IP address.
		 * A defagned IP address replaces every period "." with "[.]". 
		 * Example 1: 
		 * Input: address = "1.1.1.1" 
		 * Output: "1[.]1[.]1[.]1"
		 * Example 2:
		 * Input: address = "255.100.50.0"
		 * Output: "255[.]100[.]50[.]0"
		 */
		
		// In the example above where the dot will present replace with [.] this
		String address = "1.1.1.1";
		replaceDot(address);
	}
	
	private static void replaceDot(String input) {
		String output = input.replace(".", "[.]");
		System.out.println(output);
	}

}

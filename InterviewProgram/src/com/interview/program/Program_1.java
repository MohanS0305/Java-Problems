package com.interview.program;

public class Program_1 {

	public static void main(String[] args) {
		/*
		 * 1. Write a program to print the reverse of the given string. 
		 * Input codecode
		 * Output edocedoc 
		 * Input Constraints 
		 * 1<=Length of string<=100 
		 * Input string contains only lowercase characters ['a' to 'z'].
		 */

		System.out.println(reverseString("codecode"));
	}

	private static String reverseString(String inputString) {
		// get the inputString length
		String input = inputString.toLowerCase();
		int len = input.length();
		// empty string
		String reverse = "";
		// based on string length iterate the for loop
		for (int i = len - 1; i >= 0; i--) {
			// take each each character in the string
			// and store it in the reverse variable
			reverse += input.charAt(i);
		}

		return reverse;
	}

}

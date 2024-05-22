package com.java.problems.firstjava;

import java.util.Scanner;

public class Problem_08 {

	public static void main(String[] args) {
		// To find out whether the given String is Palindrome or not.

		/*
		 * palindrome means given string and reverse string both are same it's a
		 * palindrome otherwise not. for example mom dad
		 */
		
		// ask the user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some name :");
		// take the input from user
		String userInput = input.nextLine();
		//get the length of the string
		int len = userInput.length();
		// for storing reverse String
		StringBuilder str = new StringBuilder();
		// based on length iterate the loop
		for (int i = len - 1; i >= 0; i--) {
			// take each character from original string
			// and add it in str
			str.append(userInput.charAt(i));
		}
		// check user string and str string both are matched 
		// if it is matched 
		if (userInput.equals(str.toString())) {
			System.out.println("Palindrome"); // print palindrome
		} else { // otherwise
			System.out.println("Not palindrome"); // print not palindrome
		}
		input.close();
	}

}

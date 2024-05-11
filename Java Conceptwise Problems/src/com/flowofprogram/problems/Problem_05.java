package com.flowofprogram.problems;

import java.util.Scanner;

public class Problem_05 {

	public static void main(String[] args) {
		/*
		 * Keep taking numbers as inputs till the user enters ‘x’, after that print sum
		 * of all.
		 */
		// ask input from user
		Scanner input = new Scanner(System.in);
		// declare sum
		int sum = 0;

		System.out.println("Enter numbers (enter 'x' to finish):");
		while (true) {
			// take input from user
			String user = input.nextLine();

			// remove case sensitivity from user input
			// check it's 'x' or not if it's 'x'
			if (user.equalsIgnoreCase("x")) {
				break; // exit the loop
			}

			try {
				// convert the user input String to number
				int number = Integer.parseInt(user);
				// add all the numbers
				sum += number;
			} catch (NumberFormatException e) { // it's not a number print the below message
				System.out.println("Invalid input! Please enter a number or 'x' to finish.");
			}
		}
		// print the final sum value
		System.out.println("Sum of all numbers entered: " + sum);
		input.close();
	}

}

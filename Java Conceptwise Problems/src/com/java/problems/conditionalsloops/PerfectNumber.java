package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		/*
		 * Perfect Number
		 * 
		 * A perfect number is a positive integer that is equal to the sum of its proper
		 * divisors, excluding itself. Proper divisors of a number are the divisors
		 * other than the number itself.
		 * 
		 */

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// take input from user
			System.out.println("Enter a number:");
			int n = input.nextInt();

			// check n is greater than zero
			if (n > 0) {
				// call perfect number method
				perfectNumber(n);
			} else { // otherwise print error message
				System.err.println("Invaild input pls enter positive number.");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter some number.");
		}
	}

	private static void perfectNumber(int n) {
		int sum = 0;
		// based on input iterate the loop
		for (int i = 1; i < n; i++) {
			// check the i is divisible by n
			if (n % i == 0) {
				// take that number and sum it
				sum += i;
			}
		}

		// finally check sum is equal to n that number is perfect number
		if (sum == n) {
			System.out.println(n + " is a perfect number.");
		} else { // otherwise number is not perfect number
			System.out.println(n + " is not a perfect number.");
		}
	}

}

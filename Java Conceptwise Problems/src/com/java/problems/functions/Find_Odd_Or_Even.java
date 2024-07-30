package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Find_Odd_Or_Even {

	public static void main(String[] args) {

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user
			System.out.println("Enter a number:");
			// take input from user
			int n = input.nextInt();
			// check input is greater than or equal to zero
			if (n >= 0) {
				// call findOddEven
				findOddEven(n);
			} else {
				// otherwise print error message
				System.err.println("Invaild input pls enter positive numbers.");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.err.println("Invaild input pls enter numbers.");
		}
	}

	private static void findOddEven(int n) {
		// check the number is even or odd
		if (n % 2 == 0) {
			System.out.println(n + " is a even number.");
		} else {
			System.out.println(n + " is odd number.");
		}
	}

}

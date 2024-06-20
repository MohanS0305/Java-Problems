package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Find_product_Sum_difference {

	public static void main(String[] args) {
		/*
		 * Subtract the Product and Sum of Digits of an Integer
		 * 
		 * Given an integer number n, return the difference between the product of its
		 * digits and the sum of its digits.
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: n = 234 Output: 15 Explanation: Product of digits = 2 * 3 * 4 = 24 Sum
		 * of digits = 2 + 3 + 4 = 9 Result = 24 - 9 = 15 Example 2:
		 * 
		 * Input: n = 4421 Output: 21 Explanation: Product of digits = 4 * 4 * 2 * 1 =
		 * 32 Sum of digits = 4 + 4 + 2 + 1 = 11 Result = 32 - 11 = 21
		 */

		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// ask the input from user & store it
			System.out.println("Enter a number:");
			int n = input.nextInt();

			// check input number is greater than zero
			if (n > 0) {
				// while calling the method pass the input and store the return values
				int result = subtractProductAndSum(n);

				// print it
				System.out.println("The difference between product & sum of digits is " + result);
			} else {				
				System.out.println("Invaild input pls enter some positive numbers");
			}
		} catch (InputMismatchException ime) { // handle exception
			System.out.println("Invaild input pls enter some numbers");
		}
	}

	private static int subtractProductAndSum(int n) {
		// declare variables
		int extractDigits;
		int productResult = 1;
		int sumResult = 0;
		int result = 0;

		// loop through each digits in n
		while (n > 0) {
			// extract each digit
			extractDigits = n % 10;

			// product it & store it productResult
			productResult *= extractDigits;

			// add it & store it sumResult
			sumResult += extractDigits;

			// after performed product & sum remove each digits
			n = n / 10;
		}

		// subtract product & sum Result and store it Result
		result = productResult - sumResult;
		
		// return the result
		return result;
	}

}

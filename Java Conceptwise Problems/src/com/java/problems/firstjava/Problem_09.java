package com.java.problems.firstjava;

import java.util.Scanner;

public class Problem_09 {

	public static void main(String[] args) {

		// ask the user input
		Scanner input = new Scanner(System.in);
		// take the two input from user
		System.out.println("Enter the first number :");
		int n1 = input.nextInt();
		System.out.println("Enter the second number :");
		int n2 = input.nextInt();

		System.out.println("Armstrong numbers between " + n1 + " and " + n2 + ":");

		// iterate over the range from n1 to n2
		for (int i = n1; i <= n2; i++) {
			int number = i;
			int numDigits = countDigits(number); // find the base power
			int sum = 0;
			int temp = number;

			// calculate the sum of digits raised to the power of number of digits
			while (temp != 0) {
				int digit = temp % 10; // extract each number
				sum += Math.pow(digit, numDigits); // based on power multiply base
				temp /= 10; // remove each digits
			}

			// check if the number is an Armstrong number
			if (sum == number) {
				System.out.print(number + " "); // print that number
			}
		}
		input.close();
	}

	// function to count the number of digits in a number
	private static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			number /= 10; // remove each number
			count++; // increment count by 1
		}
		return count; // return count
	}
}

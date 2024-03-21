package com.java.problems;

import java.util.Scanner;

public class Problem_29 {

	public static void main(String[] args) {
		// The sum of all the prime numbers
		// The prime number is not greater than the test case number
		// sum all the prime numbers
		// sample input 2 5 10
		// sample output 10 17

		// ask the input from user
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		// calling the method
		sumOfPrime(testCase, input);
		input.close();
	}

	private static void sumOfPrime(int t, Scanner input) {
		// based on input iterate for loop
		for (int user = 1; user <= t; user++) {
			int no = input.nextInt();
			int sumOfPrimeNo = 0;
			// based on number iterate outer loop
			for (int i = 1; i <= no; i++) {
				int count = 0;
				// based on outer loop iterate inner loop
				for (int j = 1; j <= i; j++) {
					// no is divisible by one and itself it's prime
					if (i % j == 0) {
						// if it divisible increment count by 1
						count++;
					}
				}
				// if the count is 2 it's exactly divisible by 2 times
				if (count == 2) {
					// now it is prime no

					// check if all the prime no is less than input no
					if (i <= no) {
						// sum all the prime numbers
						sumOfPrimeNo += i;
					}
				}
			}
			// print the sum of prime numbers
			System.out.println(sumOfPrimeNo);
		}
	}
}

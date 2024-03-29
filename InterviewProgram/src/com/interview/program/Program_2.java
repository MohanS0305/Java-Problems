package com.interview.program;

public class Program_2 {

	public static void main(String[] args) {
		/*
		 * 2. Given a number, check whether it is a prime number or not. 
		 * Input 1 
		 * 3
		 * Output 1 
		 * Yes 
		 * Input 2 
		 * 4 
		 * Output 2 
		 * No
		 */

		System.out.println(checkPrimeOrNot(3));
	}

	private static String checkPrimeOrNot(int input) {
		// based on input iterate the for loop
		// starting loop is 2 because prime no start with 2
		int count = 0;
		for (int i = 2; i < input; i++) {
			// input no is divisible by any other no increment the count by 1
			if (input % i == 0) {
				count++;
			}
		}

		if (count == 0) { // count is 0 it will not divisible by any other no
			return "Yes"; // so return yes
		} else {
			return "No"; // or return no
		}
	}

}

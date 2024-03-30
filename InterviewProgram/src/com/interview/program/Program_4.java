package com.interview.program;

public class Program_4 {

	public static void main(String[] args) {
		/*
		 * 4. Given a number N, print reverse of number N. 
		 * Input 988 
		 * Output 889 
		 * Note Do not print leading zeros in output. 
		 * For example N = 100 Reverse of N should be 1 not 001. 
		 * Constraints 1<=N<=10000
		 */
		reverseNo(988);
	}

	private static void reverseNo(int input) {
		// based on digits iterate the loop
		while (input > 0) {
			// input no divisible by 10 get the reminder
			// that means we are extracting the last digits and print it
			if (input % 10 != 0) {
				System.out.print(input % 10);
			}
			// after printing remove that digit
			// so we need to divide
			input = input / 10;
		}
	}
}

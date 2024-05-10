package com.flowofprogram.problems;

public class Problem_04 {

	public static void main(String[] args) {
		System.out.println(calculateLcm(12, 18));
	}
	
	private static int calculateLcm(int num1, int num2) {
		int gcd = calculateHcf(num1, num2);
		int lcm = (num1 * num2) / gcd; // multiply two numbers divided by gcd value and store the final valie in lcm
		return lcm; // finally return lcm
	}

	private static int calculateHcf(int num1, int num2) {
		// check num2 not equal to 0
		while (num2 != 0) {
			// create temp store num2 to temp
			int temp = num2;
			// divide num1 and num2 
			// get the reminder and store it in num2
			num2 = num1 % num2;
			num1 = temp; // assign temp to num1
		}
		
		return num1; // finally return num1 this gives common divisor of two number
	}

}

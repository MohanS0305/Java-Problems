package com.java.problems;

public class Problem_57 {

	public static void main(String[] args) {
		/* find the count of how many numbers are divisible by 9 in between 100 to 200 
		 * input = 100 , 200
		 * output = 11
		 * */
		System.out.println(findDivisibleCount(100, 200));
	}

	private static int findDivisibleCount(int i, int j) {
		int count = 0;
		// based on input iterate the loop
		for (int s = i; s <= j; s++) {
			// check which are all the numbers divisible by 9
			if (s % 9 == 0) {
				count++; // increment the count by 1
			}
		}
		return count; // finally return the count
	}

}

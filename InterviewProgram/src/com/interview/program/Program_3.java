package com.interview.program;

public class Program_3 {

	public static void main(String[] args) {
		/*
		 * 3. Given an array of numbers, arrange them in a way that it forms the largest
		 * value. 
		 * Input [54, 546, 548, 60] 
		 * Output 6054854654
		 * 
		 * Note The arrangement 6054854654 gives the largest value. 
		 * Constraints
		 * 1<=N<=1000 
		 * 1<=Number<=1000000
		 */
		int[] input = { 54, 546, 548, 60 };
		formLargerValue(input);
	}

	private static void formLargerValue(int[] inputArray) {
		// get the length for an inputArray
		int len = inputArray.length;
		// based on length iterate the for loop
		for (int i = len - 1; i >= 0; i--) {
			// take each each element in the array in reverse order
			System.out.print(inputArray[i]); // print the element
		}
	}
}

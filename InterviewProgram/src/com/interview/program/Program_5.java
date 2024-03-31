package com.interview.program;

public class Program_5 {

	public static void main(String[] args) {
		/*
		 * 5. Given an array of numbers, find the maximum and minimum element in the
		 * array. 
		 * Input [54, 546, 548, 60] 
		 * Output 548 54
		 */
		int[] input = { 54, 546, 548, 60 };
		findMaxMin(input);
	}

	private static void findMaxMin(int[] inputArray) {
		// get the inputArray length
		int len = inputArray.length;
		// based on length iterate the loop
		int max = 0;
		int min = inputArray[0];
		for (int i = 0; i < len; i++) {
			if (inputArray[i] > max) { // if array element is greater than max
				max = inputArray[i]; // store that element in max
			}

			if (inputArray[i] < min) { // if array element is less than min
				min = inputArray[i]; // store that element in min
			}
		}
		System.out.println(max + " " + min);
	}
}

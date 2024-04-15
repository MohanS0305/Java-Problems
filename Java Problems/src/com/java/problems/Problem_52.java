package com.java.problems;

public class Problem_52 {

	public static void main(String[] args) {
		/*
		 * Given an array of integers, find the maximal absolute difference between any
		 * two of its adjacent elements.
		 * 
		 * Example
		 * 
		 * For inputArray = [2, 4, 1, 0], the output should be solution(inputArray) = 3.
		 * [input] array.integer inputArray
		 * 
		 * Guaranteed constraints: 3 ≤ inputArray.length ≤ 10, -15 ≤ inputArray[i] ≤ 15.
		 * 
		 * [output] integer
		 * 
		 * The maximal absolute difference.
		 */
		int[] inputArray = {2, 4, 1, 0};
		System.out.println(solution(inputArray));
	}
	
	private static int solution(int[] inputArray) {
		 // get the array length 
		 int len = inputArray.length;
		 int max = Integer.MIN_VALUE;
		 // based on length iterate the loop
		 for (int i = 0; i < len - 1; i++) {
			 // subtract current element and next element
			 // find the maximum number in the subtraction
			 // use Math.abs() to convert the negative number to positive
			 max = Integer.max(max,Math.abs((inputArray[i] - inputArray[i + 1]))); 
		 }
		 
		 return max; // finally return the max no
	}

}

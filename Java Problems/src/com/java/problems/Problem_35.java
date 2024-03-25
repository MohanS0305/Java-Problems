package com.java.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_35 {

	public static void main(String[] args) {
		/*
		 * Given an array of integers, find the pair of adjacent elements that has the
		 * largest product and return that product.
		 * 
		 * Example
		 * 
		 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
		 * solution(inputArray) = 21.
		 * 
		 * 7 and 3 produce the largest product.
		 * 
		 * [input] array.integer inputArray
		 * 
		 * An array of integers containing at least two elements.
		 * 
		 * Guaranteed constraints: 2 ≤ inputArray.length ≤ 10, -1000 ≤ inputArray[i] ≤
		 * 1000.
		 * 
		 * [output] integer
		 * 
		 * The largest product of adjacent elements.
		 */

		/*
		 * 3 * 6 = 18 
		 * 6 * -2 = -12 
		 * -2 * -5 = 10 
		 * -5 * 7 = -35 
		 * 7 * 3 = 21
		 */
		
		int[] inputArray = { 3, 6, -2, -5, 7, 3 };
		System.out.println(solution(inputArray));

	}

	private static int solution(int[] inputArray) {
		// get the array length
		int len = inputArray.length;
		List<Integer> productArray = new ArrayList<>();
		// based on array length iterate the for loop
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j <= i + 1; j++) {
				// first loop take first element in the array
				// second loop take second element in the array
				// multiply first element and second element
				// store the multiply element in one array list
				productArray.add(inputArray[i] * inputArray[j]);
			}

		}

		// find the max element in the product array
		int pLen = productArray.size();
		int maxProduct = productArray.get(0);
		for (int i = 0; i < pLen; i++) {
			if (productArray.get(i) > maxProduct) { // productArray element is greater than max
				maxProduct = productArray.get(i); // store the productArray element in max
			}
		}
		return maxProduct; // return max product element
	}
}

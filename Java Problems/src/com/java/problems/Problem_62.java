package com.java.problems;

import java.util.Arrays;

public class Problem_62 {

	public static void main(String[] args) {
		/*
		 * Shuffle the Array
		 * 
		 * Given the array nums consisting of 2n elements in the form
		 * [x1,x2,...,xn,y1,y2,...,yn].
		 * 
		 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [2,5,1,3,4,7], n = 3 Output: [2,3,5,4,1,7] Explanation: Since
		 * x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7]. Example
		 * 2:
		 * 
		 * Input: nums = [1,2,3,4,4,3,2,1], n = 4 Output: [1,4,2,3,3,2,4,1] Example 3:
		 * 
		 * Input: nums = [1,1,2,2], n = 2 Output: [1,2,1,2]
		 * 
		 * Constraints: 1 <= n <= 500 nums.length == 2n 1 <= nums[i] <= 10^3
		 */
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		System.out.println(Arrays.toString(shuffle(nums, n)));
	}

	private static int[] shuffle(int[] nums, int n) {
		// create one new array size of nums size
		int[] shuffledArray = new int[nums.length];
		// store n in k
		int k = n;
		// get the input array length
		int len = nums.length;
		// based on length iterate the loop
		for (int i = 0, j = 0; i < len; i++) {
			// take first half of element one by one store it in shuffled array
			// based on even index
			if (i % 2 == 0) { // check the index is even or not
				shuffledArray[i] = nums[j];
				j++;
			} else {
				// take second half of element one by one store it in shuffled array
				// based on odd index
				while (k > 0) {
					shuffledArray[i] = nums[k];
					k++; // increment k by 1
					break; // manually exit the loop
				}
			}
		}
		return shuffledArray;
	}
}

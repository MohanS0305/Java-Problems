package com.java.problems;

import java.util.Arrays;

public class Problem_60 {

	public static void main(String[] args) {
		/*
		 * Given an array nums. We define a running sum of an array as runningSum[i] =
		 * sum(nums[0]…nums[i]).
		 * 
		 * Return the running sum of nums.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running sum is
		 * obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. Example 2:
		 * 
		 * Input: nums = [1,1,1,1,1] Output: [1,2,3,4,5] Explanation: Running sum is
		 * obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]. Example 3:
		 * 
		 * Input: nums = [3,1,2,10,1] Output: [3,4,6,16,17]
		 * 
		 * 
		 * Constraints:
		 * 
		 * 1 <= nums.length <= 1000 -10^6 <= nums[i] <= 10^6
		 */
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(runningSum(nums)));
	}

	private static int[] runningSum(int[] nums) {
		// get the array length
		int len = nums.length;
		// create one new array size of input array size
		int[] result = new int[len];
		int sum = 0;
		// based on input array length iterate
		for (int i = 0; i < len; i++) { // pointer one
			for (int j = 0; j <= i; j++) { // pointer two
				sum += nums[j]; // take the element and sum it store it to sum
			}
			result[i] = sum; // store the sum into result
			sum = 0; // reset the sum
		}
		return result; // finally return the result
	}
}

package com.java.problems;

import java.util.Arrays;

public class Problem_59 {

	public static void main(String[] args) {
		/*
		 * Concatenation of Array
		 * 
		 * Given an integer array nums of length n, you want to create an array ans of
		 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
		 * (0-indexed).
		 * 
		 * Specifically, ans is the concatenation of two nums arrays.
		 * 
		 * Return the array ans.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [1,2,1] Output: [1,2,1,1,2,1] Explanation: The array ans is
		 * formed as follows: - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
		 * - ans = [1,2,1,1,2,1] Example 2:
		 * 
		 * Input: nums = [1,3,2,1] Output: [1,3,2,1,1,3,2,1] Explanation: The array ans
		 * is formed as follows: - ans =
		 * [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]] - ans =
		 * [1,3,2,1,1,3,2,1]
		 * 
		 * 
		 * Constraints:
		 * 
		 * n == nums.length 1 <= n <= 1000 1 <= nums[i] <= 1000
		 */
		int[] a = {1,3,2,1};
		System.out.println(Arrays.toString(concatenation(a)));
	}
	
	private static int[] concatenation(int[] a) {
		// get the length of input array
		int len = a.length;
		// create one new array size of input array size
		int[] b = new int[len];
		// create one new array size of double the size of inputarray
		int[] result = new int[len + len];
		// get result length
		int rLen = result.length;
		// based on input array length iterate the loop
		for (int i = 0; i < len; i++) {
			b[i] = a[i];
		}
		// based on a length iterate the loop
		for (int i = 0; i < len; i++) {
			// based on i itearte
			for (int j = 0; j <= i; j++) {
				result[i] = a[j]; // inserting a into result
			}
		}
		// after insert the first half array into result
		// we can insert the second half array into result
		int j = 0;
		for (int i = len; i < rLen; i++) {
			// based on j iterate
			while (j >= 0) {
				result[i] = b[j]; // inserting b into result
				break;
			}
			j++;
		}
		
		return result;
	}
}

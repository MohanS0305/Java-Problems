package com.java.problems.arrays;

import java.util.Arrays;

public class Shuffle_Array {

	public static void main(String[] args) {

		// take the input
		int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int n = 4;

		// call shuffleArray() and print it
		System.out.println(Arrays.toString(shuffleArray(nums, n)));
	}

	private static int[] shuffleArray(int[] nums, int n) {
		// get the nums length
		int len = nums.length;

		// create one new array length of nums
		int[] ans = new int[len];

		int firstHalf = 0;

		// based on the nums length iterate the loop
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				ans[i] = nums[firstHalf];
				firstHalf++;
			} else {
				ans[i] = nums[n++];
			}
		}
		// return ans
		return ans;
	}

}

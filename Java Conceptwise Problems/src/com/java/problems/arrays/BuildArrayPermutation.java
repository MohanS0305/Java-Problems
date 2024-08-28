package com.java.problems.arrays;

import java.util.Arrays;

public class BuildArrayPermutation {

	public static void main(String[] args) {

		// take the input
		int[] nums = { 5, 0, 1, 2, 3, 4 };

		// call buildArray()
		int[] ans = buildArray(nums);

		// print it
		System.out.println(Arrays.toString(ans));
	}

	private static int[] buildArray(int[] nums) {
		// get nums array length
		int len = nums.length;

		// based on the nums length create ans array
		int[] ans = new int[len];

		// based on the length iterate the loop
		for (int i = 0; i < len; i++) {
			// take each element in nums array
			// pass it to nums index and store it in ans array
			ans[i] = nums[nums[i]];
		}

		// return ans
		return ans;
	}

}

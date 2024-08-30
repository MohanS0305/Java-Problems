package com.java.problems.arrays;

import java.util.Arrays;

public class RunningSum {

	public static void main(String[] args) {

		// take the input
		int[] nums = { 1, 2, 3, 4 };

		// call runningSum() and print it
		System.out.println(Arrays.toString(runningSum(nums)));
	}

	private static int[] runningSum(int[] nums) {
		// get the nums array length
		int len = nums.length;

		// create new array based on nums array size
		int[] runningSum = new int[len];

		// initialize the first element
		runningSum[0] = nums[0];

		// iterate through the array starting from the second element
		for (int i = 1; i < len; i++) {
			// calculate the running sum
			runningSum[i] = runningSum[i - 1] + nums[i];
		}

		// return runningSum
		return runningSum;
	}

}

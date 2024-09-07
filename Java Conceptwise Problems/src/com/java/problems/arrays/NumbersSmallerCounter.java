package com.java.problems.arrays;


import java.util.Arrays;

public class NumbersSmallerCounter {

	public static void main(String[] args) {

		// take input
		int[] nums = { 7, 7, 7, 7 };

		// call findSmallerNo() and print it
		System.out.println(Arrays.toString(findSmallerNo(nums)));
	}

	private static int[] findSmallerNo(int[] nums) {

		// get the nums length
		int numsL = nums.length;

		// create new array based on nums size
		int[] result = new int[numsL];

		// based on nums length iterate the outer loop
		for (int i = 0; i < numsL; i++) {
			int smallerNoCount = 0;
			// based on nums length iterate the inner loop
			for (int j = 0; j < numsL; j++) {
				// check current number not equal to other number
				// and other number less than current number
				if (j != i && nums[j] < nums[i]) {
					// count the smaller number
					smallerNoCount++;
				}
			}
			// add that count into result array
			result[i] = smallerNoCount;
		}

		// return result
		return result;
	}
}

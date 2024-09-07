package com.java.problems.arrays;


public class NumberOfGoodPairs {

	public static void main(String[] args) {

		// take input
		int[] nums = { 1, 2, 3, 1, 1, 3 };

		// call numIdenticalPairs() and print it
		System.out.println(numIdenticalPairs(nums));
	}

	private static int numIdenticalPairs(int[] nums) {
		int count = 0;
		// based on nums length iterate the loop
		for (int i = 0; i < nums.length; i++) {
			// based on nums length iterate the inner loop
			for (int j = 0; j < nums.length; j++) {
				// check in nums both element is pair and i index less than j index
				if (nums[i] == nums[j] && i < j) {
					// increase the count
					count++;
				}
			}
		}

		// return count
		return count;
	}

}

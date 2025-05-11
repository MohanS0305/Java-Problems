package com.java.leetcode.problems;

public class RemoveElements {

	/*
	 * Example 1:
	 * 
	 * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_] Explanation:
	 * Your function should return k = 2, with the first two elements of nums being
	 * 2. It does not matter what you leave beyond the returned k (hence they are
	 * underscores).
	 */

	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

		int newLength = removeElement(nums, 2);

		System.out.println("New length: " + newLength);

		// Print modified array up to new length
		System.out.print("Modified array: ");
		for (int i = 0; i < newLength; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int removeElement(int[] nums, int val) {
		int k = 0; // Index for the next position to place a non-val element

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i]; // Overwrite element at index k
				k++;
			}
		}

		return k;
	}
}
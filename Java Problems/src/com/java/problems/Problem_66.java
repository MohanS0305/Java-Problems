package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_66 {

	public static void main(String[] args) {
		/*
		 * Create target array in the given order
		 * 
		 * Given two arrays of integers nums and index. Your task is to create target
		 * array under the following rules:
		 * 
		 * Initially target array is empty. From left to right read nums[i] and
		 * index[i], insert at index index[i] the value nums[i] in target array. Repeat
		 * the previous step until there are no elements to read in nums and index.
		 * Return the target array.
		 * 
		 * It is guaranteed that the insertion operations will be valid.
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1] Output: [0,4,1,3,2]
		 * Explanation: nums index target 0 0 [0] 1 1 [0,1] 2 2 [0,1,2] 3 2 [0,1,3,2] 4
		 * 1 [0,4,1,3,2] Example 2:
		 * 
		 * Input: nums = [1,2,3,4,0], index = [0,1,2,3,0] Output: [0,1,2,3,4]
		 * Explanation: nums index target 1 0 [1] 2 1 [1,2] 3 2 [1,2,3] 4 3 [1,2,3,4] 0
		 * 0 [0,1,2,3,4] Example 3:
		 * 
		 * Input: nums = [1], index = [0] Output: [1]
		 * 
		 * Constraints:
		 * 
		 * 1 <= nums.length, index.length <= 100 nums.length == index.length 0 <=
		 * nums[i] <= 100 0 <= index[i] <= i
		 */
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

	private static int[] createTargetArray(int[] nums, int[] index) {
		// create one arrayList to store the result
		List<Integer> result = new ArrayList<>();
		// get nums array length
		int len = nums.length;
		// based on length iterate the loop
		for (int i = 0; i < len; i++) {
			// take nums array element and store it based on index array element in result
			// array
			result.add(index[i], nums[i]);
		}

		// create one new array to store arrayList element
		int[] target = new int[len];
		// get target array length
		int tLen = target.length;
		// based on tLen iterate the loop
		for (int i = 0; i < tLen; i++) {
			// take each element in result arrayList
			// store that element in target array
			target[i] = result.get(i);
		}
		return target;
	}
}

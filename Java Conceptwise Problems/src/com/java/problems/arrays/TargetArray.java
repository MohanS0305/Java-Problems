package com.java.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {

	public static void main(String[] args) {
		// take the input
		int[] nums = { 0, 1, 2, 3, 4 };
		int[] index = { 0, 1, 2, 2, 1 };

		// call createTargetArray()
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}

	private static int[] createTargetArray(int[] nums, int[] index) {
		// create result arrayList
		List<Integer> result = new ArrayList<>();

		// based on nums length iterate through loop
		for (int i = 0; i < nums.length; i++) {
			// pass index element as index of result and store nums element into that result
			result.add(index[i], nums[i]);
		}

		// convert arrayList into array and return result
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}

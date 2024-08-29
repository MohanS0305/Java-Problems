package com.java.problems.arrays;

import java.util.Arrays;

public class ConcatentationArray {

	public static void main(String[] args) {

		// take input
		int[] nums = { 1, 3, 2, 1 };

		// call concatArray()
		int[] ans = concatArray(nums);

		// print it
		System.out.println(Arrays.toString(ans));
	}

	private static int[] concatArray(int[] nums) {
		// get the nums array length
        int numsLen = nums.length;
        // double the nums length and create ans array
        int[] ans = new int[numsLen * 2];
        
        for (int i = 0; i < numsLen; i++) {
            // take each element in nums array
			// and store it in ans array
            ans[i] = nums[i];
            // based on nums array length + i
            ans[i + numsLen] = nums[i];
        }

        // return ans
        return ans;
	}

}

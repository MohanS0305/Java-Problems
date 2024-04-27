package com.java.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_63 {

	public static void main(String[] args) {
		/*
		 * There are n kids with candies. You are given an integer array candies, where
		 * each candies[i] represents the number of candies the ith kid has, and an
		 * integer extraCandies, denoting the number of extra candies that you have.
		 * 
		 * Return a boolean array result of length n, where result[i] is true if, after
		 * giving the ith kid all the extraCandies, they will have the greatest number
		 * of candies among all the kids, or false otherwise.
		 * 
		 * Note that multiple kids can have the greatest number of candies.
		 * 
		 * Example 1:
		 * 
		 * Input: candies = [2,3,5,1,3], extraCandies = 3 Output:
		 * [true,true,true,false,true] Explanation: If you give all extraCandies to: -
		 * Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the
		 * kids. - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among
		 * the kids. - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest
		 * among the kids. - Kid 4, they will have 1 + 3 = 4 candies, which is not the
		 * greatest among the kids. - Kid 5, they will have 3 + 3 = 6 candies, which is
		 * the greatest among the kids. Example 2:
		 * 
		 * Input: candies = [4,2,1,1,2], extraCandies = 1 Output:
		 * [true,false,false,false,false] Explanation: There is only 1 extra candy. Kid
		 * 1 will always have the greatest number of candies, even if a different kid is
		 * given the extra candy. Example 3:
		 * 
		 * Input: candies = [12,1,12], extraCandies = 10 Output: [true,false,true]
		 * 
		 * Constraints:
		 * 
		 * n == candies.length 
		 * 2 <= n <= 100 
		 * 1 <= candies[i] <= 100 
		 * 1 <= extraCandies <=50
		 */
		int[] candies = { 2, 3, 5, 1, 3 };
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies, extraCandies));
	}

	private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		// get the candies array length
		int len = candies.length;
		// take first element in candies array store it in max
		int max = candies[0];
		// find the max element in a candies array
		for (int i = 0; i < len; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		// create one temporary variable
		int temp = 0;
		// create on array list to store the current and extraCandies boolean value
		List<Boolean> result = new ArrayList<>();
		// based on length iterate the loop
		for (int i = 0; i < len; i++) {
			// take each element in candies array and add it with extra candies
			// store that values in temp
			temp = candies[i] + extraCandies;
			// check the temp value is greater than or equal to max value
			// if it true or false store that value in result array
			result.add(temp >= max);
		}
		return result; // finally return the result
	}

}

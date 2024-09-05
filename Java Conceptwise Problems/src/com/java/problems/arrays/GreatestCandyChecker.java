package com.java.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_Greatest_No_Of_Candies {

	public static void main(String[] args) {

		// take input
		int[] candies = { 12, 1, 12 };
		int extraCandies = 10;

		// call the kidsWithCandies() and print it
		System.out.println(kidsWithCandies(candies, extraCandies));
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		// call findMaxCandies() and get max in a single pass
		int max = findMaxCandies(candies);

		// create the result list
		List<Boolean> result = new ArrayList<>(candies.length);

		// iterate over candies and add boolean result directly
		for (int candy : candies) {
			result.add(candy + extraCandies >= max);
		}

		return result;
	}

	// find maximum no in candies array
	private static int findMaxCandies(int[] candies) {
		// initialize max with the first candy count
		int max = candies[0];

		// iterate through the candies array to find the maximum
		for (int candy : candies) {
			if (candy > max) {
				max = candy;
			}
		}

		// return the max candy count
		return max;
	}
}

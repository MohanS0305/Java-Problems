package com.java.problems;

public class Problem_69 {

	public static void main(String[] args) {
		/*
		 * Find the highest altitude
		 * 
		 * There is a biker going on a road trip. The road trip consists of n + 1 points
		 * at different altitudes. The biker starts his trip on point 0 with altitude
		 * equal 0.
		 * 
		 * You are given an integer array gain of length n where gain[i] is the net gain
		 * in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the
		 * highest altitude of a point.
		 * 
		 * Example 1:
		 * 
		 * Input: gain = [-5,1,5,0,-7] Output: 1 Explanation: The altitudes are
		 * [0,-5,-4,1,1,-6]. The highest is 1. Example 2:
		 * 
		 * Input: gain = [-4,-3,-2,-1,4,3,2] Output: 0 Explanation: The altitudes are
		 * [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
		 * 
		 * Constraints:
		 * 
		 * n == gain.length 1 <= n <= 100 -100 <= gain[i] <= 100
		 */
		int[] gain = { -5, 1, 5, 0, -7 };
		System.out.println(largestAltitude(gain));
	}

	private static int largestAltitude(int[] gain) {
		// get the length of gain array
		int len = gain.length;
		// create one new array size of gain size + 1
		int[] altitude = new int[len + 1];
		// get the length of altitude array
		int aLen = altitude.length;
		// bike point start with 0. So add altitude[0] = 0;
		altitude[0] = 0;
		// manually set gain first element into altitude
		altitude[1] = gain[0];
		// declare sum
		int sum = gain[0];
		// based on gain length iterate the loop
		for (int i = 1; i < len; i++) {
			sum += gain[i];
			// store the sum in altitude
			altitude[i + 1] = sum;
		}
		// find the highest in the altitude array
		int highest = altitude[0];
		// based on altitude length iterate the loop
		for (int i = 0; i < aLen; i++) {
			if (altitude[i] > highest) { // check altitude element is greater than highest
				highest = altitude[i]; // store that element into highest
			}
		}
		return highest; // finally return highest
	}
}

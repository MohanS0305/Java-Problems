package com.java.problems;

public class Problem_55 {

	public static void main(String[] args) {
		/*
		 * You are given an array of integers representing coordinates of obstacles
		 * situated on a straight line.
		 * 
		 * Assume that you are jumping from the point with coordinate 0 to the right.
		 * You are allowed only to make jumps of the same length represented by some
		 * integer.
		 * 
		 * Find the minimal length of the jump enough to avoid all the obstacles.
		 * 
		 * Example
		 * 
		 * For inputArray = [5, 3, 6, 7, 9], the output should be solution(inputArray) =
		 * 4.
		 */
		int[] inputArray = {5, 3, 6, 7, 9};
		System.out.println(solution(inputArray));
	}
	
	private static int solution(int[] inputArray) {
		// get the length of an array
		int len = inputArray.length;
		// start reminder = 2
		int rem = 2; 
		// iterate the loop based on length
		for (int i = 0; i < len; i++) {
			// take each element in an array
			// and divide by rem find the reminder 
			// if reminder equal to 0 
			if (inputArray[i] % rem == 0) {
				// again restart the loop at 0 index
				i = -1; // i = -1 (because i is increment by 1 so, -1 + 1 is 0)
				rem++; // increment the reminder by 1
			}
		}
		return rem; // finally return reminder (in this case reminder means jumping element)
	}
}

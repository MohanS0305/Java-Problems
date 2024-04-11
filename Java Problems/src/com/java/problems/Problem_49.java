package com.java.problems;

public class Problem_49 {

	public static void main(String[] args) {
		/*
		 * You are given an array of integers. On each move you are allowed to increase
		 * exactly one of its element by one. Find the minimal number of moves required
		 * to obtain a strictly increasing sequence from the input.
		 * 
		 * Example
		 * 
		 * For inputArray = [1, 1, 1], the output should be solution(inputArray) = 3.
		 * [input] array.integer inputArray
		 * 
		 * Guaranteed constraints: 3 ≤ inputArray.length ≤ 105, -105 ≤ inputArray[i] ≤
		 * 105.
		 * 
		 * [output] integer
		 * 
		 * The minimal number of moves needed to obtain a strictly increasing sequence
		 * from inputArray. It's guaranteed that for the given test cases the answer
		 * always fits signed 32-bit integer type.
		 */
		int[] inputArray = { 1, 1, 1 };
		System.out.println(solution(inputArray));
	}

	private static int solution(int[] inputArray) {
		// get input array length
		int len = inputArray.length;
		int count = 0;
		// based on length iterate the loop
		for (int i = 0; i < len - 1; i++) {
			// current index value is greater than next index value 
			if (inputArray[i] >= inputArray[i + 1]) {
				// current index value - next index value + 1 
				// store that above value in diff
				int diff = inputArray[i] - inputArray[i + 1] + 1;
				count += diff; // add the diff in count
				// next element add with diff
				inputArray[i + 1] += diff;
			}
		}
		return count; // finally return count
	}
}

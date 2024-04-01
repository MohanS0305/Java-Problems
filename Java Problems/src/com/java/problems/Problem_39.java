package com.java.problems;

public class Problem_39 {

	public static void main(String[] args) {
		/*
		 * Given a sequence of integers as an array, determine whether it is possible to
		 * obtain a strictly increasing sequence by removing no more than one element
		 * from the array.
		 * 
		 * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if
		 * a0 < a1 < ... < an. Sequence containing only one element is also considered
		 * to be strictly increasing.
		 * 
		 * Example
		 * 
		 * For sequence = [1, 3, 2, 1], the output should be solution(sequence) = false.
		 * 
		 * There is no one element in this array that can be removed in order to get a
		 * strictly increasing sequence.
		 * 
		 * For sequence = [1, 3, 2], the output should be solution(sequence) = true.
		 * 
		 * You can remove 3 from the array to get the strictly increasing sequence [1,
		 * 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1,
		 * 3].
		 * 
		 * [input] array.integer sequence
		 * 
		 * Guaranteed constraints: 2 ≤ sequence.length ≤ 105, -105 ≤ sequence[i] ≤ 105.
		 * 
		 * [output] boolean
		 * 
		 * Return true if it is possible to remove one element from the array in order
		 * to get a strictly increasing sequence, otherwise return false.
		 */
		int[] sequence = {1, 3, 2, 1};
		System.out.println(solution(sequence));
	}
	
	private static boolean solution(int[] sequence) {
		// get the length of the array
		int len = sequence.length;
		int count = 0;
		// based on length iterate the loop
		for(int i = 0; i < len - 1; i++) {
			if (sequence[i] - sequence[i + 1] >= 0) { // current element - next element is greater than or equal to 0
				count++; // increase the count by 1
				// if previous index greater than or equal to 0
				// and current index to next 2nd index is greater than or equal to length - 1
				// and current element subtract next 2nd element is greater than or equal to 0
				// and previous element subtract next element is greater than or equal to 0
				if (i - 1 >= 0 && i + 2 <= len - 1 && sequence[i] - sequence[i + 2] >= 0 && sequence[i - 1] - sequence[i + 1] >= 0) {
					return false; // return false
				}
			}
		}
		return count <= 1; // count is less than or equal to 1 return true
	}

}

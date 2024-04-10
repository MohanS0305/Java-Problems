package com.java.problems;

import java.util.Arrays;

public class Problem_48 {

	public static void main(String[] args) {
		/*
		 * Two arrays are called similar if one can be obtained from another by swapping
		 * at most one pair of elements in one of the arrays.
		 * 
		 * Given two arrays a and b, check whether they are similar.
		 * 
		 * Example
		 * 
		 * For a = [1, 2, 3] and b = [1, 2, 3], the output should be solution(a, b) =
		 * true.
		 * 
		 * The arrays are equal, no need to swap any elements.
		 * 
		 * For a = [1, 2, 3] and b = [2, 1, 3], the output should be solution(a, b) =
		 * true.
		 * 
		 * We can obtain b from a by swapping 2 and 1 in b.
		 * 
		 * For a = [1, 2, 2] and b = [2, 1, 1], the output should be solution(a, b) =
		 * false.
		 * 
		 * Any swap of any two elements either in a or in b won't make a and b equal.
		 * 
		 * [input] array.integer a
		 * 
		 * Array of integers.
		 * 
		 * Guaranteed constraints: 3 ≤ a.length ≤ 105, 1 ≤ a[i] ≤ 1000.
		 * 
		 * [input] array.integer b
		 * 
		 * Array of integers of the same length as a.
		 * 
		 * Guaranteed constraints: b.length = a.length, 1 ≤ b[i] ≤ 1000.
		 * 
		 * [output] boolean
		 * 
		 * true if a and b are similar, false otherwise.
		 */
		int[] a = {1, 1, 4}, b = {1, 2, 3};
		System.out.println(solution(a, b));
	}
	
	private static boolean solution(int[] a, int[] b) {
		// get length of a and b array
		int aLen = a.length, bLen = b.length;
		// check both length are same or not
		if (aLen == bLen) { // if same
			// sort both the array
			Arrays.sort(a); 
			Arrays.sort(b);
			// based on length iterate the loop
			for(int i = 0; i < aLen; i++) {
				// both array element is not same
				if (a[i] != b[i]) {
					return false; // return false
				}
			}
			return true; // return true
		}
		return false; // return false
	}

}

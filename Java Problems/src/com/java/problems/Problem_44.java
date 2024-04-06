package com.java.problems;

import java.util.Arrays;

public class Problem_44 {

	public static void main(String[] args) {
		/*
		 * Some people are standing in a row in a park. There are trees between them
		 * which cannot be moved. Your task is to rearrange the people by their heights
		 * in a non-descending order without moving the trees. People can be very tall!
		 * 
		 * Example
		 * 
		 * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
		 * solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
		 * 
		 * [input] array.integer a
		 * 
		 * If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is
		 * the height of a person standing in the ith position.
		 * 
		 * Guaranteed constraints: 1 ≤ a.length ≤ 1000, -1 ≤ a[i] ≤ 1000.
		 * 
		 * [output] array.integer
		 * 
		 * Sorted array a with all the trees untouched.
		 */
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
		System.out.println(Arrays.toString(solution(a)));
	}
	
	private static int[] solution(int[] a) {
		// get the array length
		int len = a.length;
		// based on length iterate the loop
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				// take each element in the array
				// if array element is greater than 0  
				if (a[i] > 0 && a[j] > 0) {
					// if before element is less then next element just swap the position
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		
		return a; // finally return the sorted a array
	}
}

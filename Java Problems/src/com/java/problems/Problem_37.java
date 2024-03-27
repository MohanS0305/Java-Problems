package com.java.problems;

import java.util.Arrays;

public class Problem_37 {

	public static void main(String[] args) {
		/*
		 * Ratiorg got statues of different sizes as a present from CodeMaster for his
		 * birthday, each statue having an non-negative integer size. Since he likes to
		 * make things perfect, he wants to arrange them from smallest to largest so
		 * that each statue will be bigger than the previous one exactly by 1. He may
		 * need some additional statues to be able to accomplish that. Help him figure
		 * out the minimum number of additional statues needed. 
		 * 
		 * Example
		 * For statues = [6, 2, 3, 8], the output should be solution(statues) = 3.
		 * 
		 * Ratiorg needs statues of sizes 4, 5 and 7.
		 * 
		 * [input] array.integer statues
		 * 
		 * An array of distinct non-negative integers.
		 * 
		 * Guaranteed constraints: 1 ≤ statues.length ≤ 10, 0 ≤ statues[i] ≤ 20.
		 * 
		 * [output] integer
		 * 
		 * The minimal number of statues that need to be added to existing statues such
		 * that it contains every integer size from an interval [L, R] (for some L, R)
		 * and no other sizes.
		 */
		int[] statues = {6, 2, 3, 8};
		System.out.println(solution(statues));
	}
	
	/*
	 * input array 6 2 3 8 
	 * sorted array 2 3 6 8
	 * 
	 * subtract next statues and previous statues 
	 * after store the missing statues
	 * sum all the missing statues 
	 * we are getting additional statues 
	 * 3 - 2 = 1 - 1 = 0
	 * 6 - 3 = 3 - 1 = 2 
	 * 8 - 6 = 2 - 1 = 1 
	 * 0 + 2 + 1 
	 * 3
	 */
	
	private static int solution(int[] statues) {
		// take the input array length
		int len = statues.length;
		// sort the array
		Arrays.sort(statues);
		// based on length iterate the loop
		int additionalStatues = 0, missingStatues = 0;
		for (int i = 0; i < len - 1; i++) {
			// subtract next statues and previous statues
			// each statue will be bigger than the previous one exactly by 1
			// subtract by 1
			missingStatues = statues[i + 1] - statues[i] - 1; // 3 - 2 = 1 - 1 = 0
			// count the missingStatues store it in additionalStatues
			additionalStatues += missingStatues;
		}
		return additionalStatues; // return the additional Statues
	}
}

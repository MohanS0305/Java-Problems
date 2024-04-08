package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_46 {

	public static void main(String[] args) {
		/*
		 * Several people are standing in a row and need to be divided into two teams.
		 * The first person goes into team 1, the second goes into team 2, the third
		 * goes into team 1 again, the fourth into team 2, and so on.
		 * 
		 * You are given an array of positive integers - the weights of the people.
		 * Return an array of two integers, where the first element is the total weight
		 * of team 1, and the second element is the total weight of team 2 after the
		 * division is complete.
		 * 
		 * Example
		 * 
		 * For a = [50, 60, 60, 45, 70], the output should be solution(a) = [180, 105].
		 * 
		 * [input] array.integer a
		 * 
		 * Guaranteed constraints: 1 ≤ a.length ≤ 105, 45 ≤ a[i] ≤ 100.
		 * 
		 * [output] array.integer
		 */
		int[] a = { 100, 51, 50, 100 };
		System.out.println(Arrays.toString(solution(a)));
	}

	private static int[] solution(int[] a) {
		// get a length of that array
		int len = a.length;
		// create team1 array
		List<Integer> team1 = new ArrayList<>();
		// create team2 array
		List<Integer> team2 = new ArrayList<>();
		// based on length iterate the loop
		for (int i = 0; i < len; i++) {
			// take one element after element store it in team1
			if (i % 2 == 0) {
				team1.add(a[i]);
			} else {
				// take next element store it in team2
				team2.add(a[i]);
			}
		}
		// create new array size of 2
		int[] finalResult = new int[2];
		// sum of team1 weight and team2 weight
		int sumOfTeam1 = 0, sumOfTeam2 = 0;
		for (Integer t1 : team1) {
			sumOfTeam1 += t1; // sum of team1 weight
		}
		for (Integer t2 : team2) {
			sumOfTeam2 += t2; // sum of team2 weight
		}

		// store the sum of both team 1 and team 2 weight in finalResult array
		finalResult[0] = sumOfTeam1;
		finalResult[1] = sumOfTeam2;

		return finalResult;
	}

}

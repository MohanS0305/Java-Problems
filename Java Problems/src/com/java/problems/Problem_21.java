package com.java.problems;

import java.util.Scanner;

public class Problem_21 {

	public static void main(String[] args) {

		/*
		 * Alice has scored X marks in her test and Bob has scored Y marks in the same
		 * test. Alice is happy if she scored at least twice the marks of Bob’s score.
		 * Determine whether she is happy or not.
		 * 
		 * Input Format The first and only line of input contains two space-separated
		 * integers X,Y — the marks of Alice and Bob respectively. Output Format For
		 * each testcase, print Yes if Alice is happy and No if she is not, according to
		 * the problem statement.
		 * 
		 * The judge is case insensitive so you may output the answer in any case. In
		 * particular YES, yes, yEsare all considered equivalent toYes.
		 * 
		 * Constraints 1≤X,Y≤100 sample input 2 1 sample output Yes
		 */

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		// alice scored x is atleast twice greater than are equal to bob's mark
		if (x >= y * 2) {
			System.out.println("yes"); // print yes
		} else { // or
			System.out.println("no"); // print no
		}
		sc.close();
	}
}

package com.java.problems;

import java.util.Scanner;

public class Problem_23 {

	public static void main(String[] args) {

		/*
		 * Good Turn Chef and Chefina are playing with dice. In one turn, both of them
		 * roll their dice at once.
		 * 
		 * They consider a turn to be good if the sum of the numbers on their dice is
		 * greater than 6. Given that in a particular turn Chef and Chefina got X and Y
		 * on their respective dice, find whether the turn was good.
		 * 
		 * Input Format The first line of input will contain a single integer T,
		 * denoting the number of test cases. Each test case contains two
		 * space-separated integers X and Y — the numbers Chef and Chefina got on their
		 * respective dice. Output Format For each test case, output on a new line, YES,
		 * if the turn was good and NO otherwise.
		 * 
		 * Each character of the output may be printed in either uppercase or lowercase.
		 * That is, the strings NO, no, nO, and No will be treated as equivalent.
		 * 
		 * Constraints 1≤T≤100 1≤X,Y≤6 
		 * sample input 4 1 4 3 4 4 2 2 6 
		 * sample output NO YES NO YES
		 */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			// if chef x and chefina y both dice sum is greater than 6
			int sum = x + y;
			if (sum > 6) {
				System.out.println("yes"); // print yes
			} else { // or
				System.out.println("no"); // print no
			}
			t--;
		}
		sc.close();
	}
}

package com.java.problems;

import java.util.Scanner;

public class Problem_24 {

	public static void main(String[] args) {
		/*
		 * Water Consumption Recently, Chef visited his doctor. The doctor advised Chef
		 * to drink at least 2000 ml of water each day.
		 * 
		 * Chef drank X ml of water today. Determine if Chef followed the doctor's
		 * advice or not.
		 * 
		 * Input Format The first line contains a single integer T — the number of test
		 * cases. Then the test cases follow. The first and only line of each test case
		 * contains one integer X — the amount of water Chef drank today. Output Format
		 * For each test case, output YES if Chef followed the doctor's advice of
		 * drinking at least 2000 ml of water. Otherwise, output NO.
		 * 
		 * You may print each character of the string in uppercase or lowercase (for
		 * example, the strings YES, yEs, yes, and yeS will all be treated as
		 * identical).
		 * 
		 * Constraints 1≤T≤2000 1≤X≤4000 sample input 3 2999 1450 2000 sample output YES
		 * NO YES
		 */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int x = sc.nextInt();

			if (x >= 2000) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			t--;
		}
		sc.close();
	}
}

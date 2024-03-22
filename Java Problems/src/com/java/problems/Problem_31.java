package com.java.problems;

import java.util.Scanner;

public class Problem_31 {

	public static void main(String[] args) {
		/*
		 * Chef On Date Chef and his girlfriend go on a date. Chef took X dollars with
		 * him, and was quite sure that this would be enough to pay the bill. At the
		 * end, the waiter brought a bill of Y dollars. Print "YES" if Chef has enough
		 * money to pay the bill, or "NO" if he has to borrow from his girlfriend and
		 * leave a bad impression on her.
		 * 
		 * Input Format The first line of input will contain a single integer T,
		 * denoting the number of test cases. Each test case consists of a single line
		 * of input, containing two space-separated integers X and Y. Output Format For
		 * each test case, output on a new line "YES" if Chef has enough money to pay
		 * the bill and "NO" otherwise.
		 * 
		 * You may print each character of the string in either uppercase or lowercase
		 * (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated
		 * as identical).
		 * 
		 * Constraints 1≤T≤100 1≤X,Y≤100 sample input 4 1 1 1 2 2 1 50 100 sample output
		 * YES NO YES NO
		 */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x >= y)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
		sc.close();
	}

}

package com.java.problems;

import java.util.Scanner;

public class Problem_22 {

	public static void main(String[] args) {
		/*
		 * Oneful Pairs Chef defines a pair of positive integers (a,b) to be a Oneful
		 * Pair Oneful Pair, if a+b+(a⋅b)=111
		 * 
		 * For example, (1,55) is a Oneful Pair Oneful Pair, since
		 * 1+55+(1⋅55)=56+55=111. But (1,56) is not a Oneful Pair Oneful Pair, since
		 * 1+56+(1⋅56)=57+56=113=111.
		 * 
		 * Given two positive integers a and b, output Yes if they are a Oneful Pair
		 * Oneful Pair. And No otherwise.
		 * 
		 * Input Format The only line of input contains two space-separated integers a
		 * and b.
		 * 
		 * Output Format Output Yes, if (a,b) form a Oneful Pair. Output No if they do
		 * not. You may print each character of Yes and No in uppercase or lowercase
		 * (for example, yes, yEs, Yes will be considered identical).
		 * 
		 * Constraints 1≤a,b≤1000 sample input 1 55 sample output yes
		 */

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = oneFulPair(a, b);

		if (result == 111) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}

	private static int oneFulPair(int a, int b) {
		// a = 1 , b = 55
		// 1 + 55 + (1 * 55)
		// 56 + 55 = 111
		return a + b + (a * b);
	}
}

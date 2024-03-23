package com.java.problems;

import java.util.Scanner;

public class Problem_32 {

	public static void main(String[] args) {
		/*
		 * Counting Words Harsh was recently gifted a book consisting of N pages. Each
		 * page contains exactly M words printed on it. As he was bored, he decided to
		 * count the number of words in the book.
		 * 
		 * Help Harsh find the total number of words in the book.
		 * 
		 * Input Format The first line of input will contain a single integer T,
		 * denoting the number of test cases. Each test case consists of two
		 * space-separated integers on a single line, N and M — the number of pages and
		 * the number of words on each page, respectively. Output Format For each test
		 * case, output on a new line, the total number of words in the book.
		 * 
		 * Constraints 1≤T≤100 1≤N≤100 1≤M≤100 sample input 4 1 1 4 2 2 4 95 42 sample
		 * output 1 8 8 3990
		 */

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			System.out.println(N * M);
			T--;
		}
		sc.close();
	}

}

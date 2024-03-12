package com.java.problems;

import java.util.Scanner;

public class Problem_12 {

	public static void main(String[] args) {

		/*
		 * In a coding contest, there are prizes for the top rankers. The prize scheme
		 * is as follows:
		 * 
		 * Top 10 participants receive rupees X each. Participants with rank 11 to 100
		 * (both inclusive) receive rupees Y each. Find the total prize money over all
		 * the participants.
		 * 
		 * Input Format First line will contain T, number of test cases. Then the test
		 * cases follow. Each test case contains of a single line of input, two integers
		 * X and Y - the prize for top 10 rankers and the prize for ranks 11 to 100
		 * respectively. Output Format For each test case, output the total prize money
		 * over all the contestants. 
		 * input 2 80 1 400 30 
		 * output 890 6700
		 */

		Scanner read = new Scanner(System.in);

		int t = read.nextInt();
		for (int i = 0; i < t; i++) {
			int x = read.nextInt();
			int y = read.nextInt();

			int prize_top10 = 10 * x;

			int prize_11to100 = 90 * y;
			System.out.println(prize_top10 + prize_11to100);
		}
		read.close();
	}

}

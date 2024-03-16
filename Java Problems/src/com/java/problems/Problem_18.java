package com.java.problems;

import java.util.Scanner;

public class Problem_18 {

	public static void main(String[] args) {
		/*
		 * Chef has invented 1-minute Instant Noodles. As the name suggests, each packet
		 * takes exactly 1 minute to cook. Chef's restaurant has X stoves and only 1
		 * packet can be cooked in a single stove at any minute. How many customers can
		 * Chef serve in Y minutes if each customer orders exactly 1 packet of noodles?
		 * Input Format The first and only line of input contains two space-separated
		 * integers X and Y — the number of stoves and the number of minutes,
		 * respectively. Output Format Print a single integer, the maximum number of
		 * customers Chef can serve in Y minutes Constraints 1≤X,Y≤1000 sample input 3 7
		 * sample output 21
		 */
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(); // x - means number of stoves
		int y = input.nextInt(); // y - means number of minutes
		System.out.println(x * y); // no of stoves * no of minutes = total customers to serve
		input.close();
	}
}

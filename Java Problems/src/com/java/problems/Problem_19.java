package com.java.problems;

import java.util.Scanner;

public class Problem_19 {

	public static void main(String[] args) {
		/*
		 * In the new CodeChef Learn module, under the "Learn Problem Solving" section,
		 * there are two courses for each language. For eg. "Python Beginner - Part 1"
		 * and "Python Beginner - Part 2". These courses help you get started with
		 * CodeChef contests.
		 * 
		 * Currently there are courses for 4 languages, and hence there are 8 courses in
		 * this section. But suppose there are courses for N languages, what will be the
		 * total number of courses in this section?
		 * 
		 * Input Format The only line of input will contain a single integer N, denoting
		 * the number of languages for which there are courses.
		 * 
		 * Output Format Output on a single line the total number of courses in the
		 * section.
		 * 
		 * Constraints 1≤N≤100 sample input 4 sample output 8
		 */
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // no of languages
		// each language there are two courses
		// language multiply by two courses and display output
		System.out.println(n * 2); 
		input.close();
	}
}

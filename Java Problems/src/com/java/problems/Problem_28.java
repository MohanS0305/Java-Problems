package com.java.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_28 {

	public static void main(String[] args) {
		/*
		 * My very 1st contest! Each contest - there are approximately 1500 - 2000 users
		 * who participate for the 1st time and get rated.
		 * 
		 * The Chef wanted to tell new users some tricks for their 1st contest:
		 * 
		 * Before the contest - you don’t have any rating. So even if you make a single
		 * submission - you will become part of the contest rank list and you will get a
		 * rating. If you want your rating to increase - give the entire 2 hours to the
		 * contest & don’t quit! If you keep trying till the end, and the more time you
		 * get, the more problems you can solve. That means larger rating increases! Do
		 * not ask your friends for their code. If you copy paste their code, you will
		 * get caught during plagiarism checks and your rating will be reduced by 275
		 * points, along with a permanent black mark on your profile. Now to the
		 * problem:
		 * 
		 * In a contest where N new users visited the contest,
		 * 
		 * A users just saw the problems and didn’t make any submissions and hence won’t
		 * get any rating. B users who made a submission but could not solve any problem
		 * correctly. Thus, after the contest, they will get a rating in the range
		 * 800−1000. Everyone else could correctly solve at least 1 problem. Thus, they
		 * will get a rating strictly greater than 1000 after the contest. You need to
		 * output the number of new users in the contest who, after the contest, will
		 * get a rating and also the number of new users who will get a rating strictly
		 * greater than 1000.
		 * 
		 * Input Format Each input file contains of a single line, with three integers
		 * N,A and B - the number of new users, the number of users who just saw the
		 * problem and didn't make any submission, and the number of users who made a
		 * submission but could not solve any problem correctly. Output Format Output
		 * two integers separated by a space in a single line - the number of new users
		 * who will get a rating at the end of the contest and the number of new users
		 * who will get a rating higher than 1000.
		 * 
		 * Constraints 2≤N≤1000 1≤A≤1000 1≤B≤1000 A+B≤N sample input 10 3 2 sample
		 * output 7 5
		 */

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String arr[] = new String[3];
		try {
			arr = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int N = Integer.parseInt(arr[0]);
		int A = Integer.parseInt(arr[1]);
		int B = Integer.parseInt(arr[2]);

		// new users subtract didn't submission a problem
		int submittedUsers = N - A;
		// submitted users subtract submit the problem but,
		// not solving problem correctly
		int correctlySolvedUsers = submittedUsers - B;
		System.out.println(submittedUsers + " " + correctlySolvedUsers);
	}
}

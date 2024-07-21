package com.java.problems.conditionalsloops;

public class Problem_Statement_01 {

	public static void main(String[] args) {
		/*
		 * Kunal is allowed to go out with his friends only on the even days of a given
		 * month. Write a program to count the number of days he can go out in the month
		 * of August.
		 */

		// In August month there are 31days
		// There are 15 even days in August month

		// declare count
		int count = 0;
		// based on Aug month iterate the loop
		for (int day = 1; day <= 31; day++) {
			// check the day is even are not
			// if it's even count it.
			if (day % 2 == 0) {
				count++;
			}
		}

		// And finally print the count
		System.out.println("Kunal goes " + count + " days in Aug month.");
	}

}

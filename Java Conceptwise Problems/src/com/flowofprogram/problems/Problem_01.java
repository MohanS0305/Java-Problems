package com.flowofprogram.problems;

public class Problem_01 {

	public static void main(String[] args) {
		/*
		 * find weather the year is leap year or not
		 * 
		 * A leap year is a year that contains an additional day, February 29th, making
		 * it 366 days long instead of the usual 365. This extra day is added to keep
		 * the calendar year synchronized with the astronomical year, which is
		 * approximately 365.2425 days long. Leap years occur every four years, except
		 * for years that are divisible by 100 but not divisible by 400. For example,
		 * 2000 and 2400 are leap years, while 1800 and 1900 are not. Leap years help
		 * ensure that our calendar remains aligned with the Earth's revolutions around
		 * the Sun.
		 */

		System.out.println(leapYear(1997));
	}
	
	private static String leapYear(int year) {
		// check the year divisible by 4
		if (year % 4 == 0) {
			// check year is century
			if (year % 100 == 0) {
				if (year % 400 == 0) { // check the year is divisible by 400
					return year + " is a leap year"; // it's leap year
				}
				return year + " is not a leap year";
			}
			// if year is not century
			return year + " is a leap year";
		}
		return year + " is not a leap year"; // otherwise it's not a leap year
	}
}

package com.java.problems;

public class Problem_36 {

	public static void main(String[] args) {
		/*
		 * Below we will define an n-interesting polygon. Your task is to find the area
		 * of a polygon for a given n.
		 * 
		 * A 1-interesting polygon is just a square with a side of length 1. An
		 * n-interesting polygon is obtained by taking the n - 1-interesting polygon and
		 * appending 1-interesting polygons to its rim, side by side. You can see the
		 * 1-, 2-, 3- and 4-interesting polygons in the picture below.
		 * 
		 * Example [input] integer 
		 * For n = 2, the output should be solution(n) = 5; For
		 * n = 3, the output should be solution(n) = 13.
		 * 
		 * [output] integer
		 * 
		 * The area of the n-interesting polygon.
		 */
		System.out.println(solution(4));
	}
	// formula for area of interesting polygon (n * 4) - 4 = output + area | area is 1
	// example n = 2 | (2 * 4) - 4 = 8 - 4 = 4 + 1 = 5
	private static int solution(int n) {
		// area is 1
		int area = 1;
		if (n == 0) 
			return 0;
		if (n == 1) 
			return 1;
		// based on n times iterate for loop
		for (int i = 1; i <= n; i++) {
			int calcPoly = (i * 4) - 4;
			area += calcPoly;
		}
		return area;
	}

}

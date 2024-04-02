package com.java.problems;

public class Problem_40 {

	public static void main(String[] args) {
		/*
		 * After becoming famous, the CodeBots decided to move into a new building
		 * together. Each of the rooms has a different cost, and some of them are free,
		 * but there's a rumour that all the free rooms are haunted! Since the CodeBots
		 * are quite superstitious, they refuse to stay in any of the free rooms, or any
		 * of the rooms below any of the free rooms.
		 * 
		 * Given matrix, a rectangular matrix of integers, where each value represents
		 * the cost of the room, your task is to return the total sum of all rooms that
		 * are suitable for the CodeBots (ie: add up all the values that don't appear
		 * below a 0). Example
		 * 
		 * For
		 * 
		 * matrix = [[0, 1, 1, 2], [0, 5, 0, 0], [2, 0, 3, 3]] the output should be
		 * solution(matrix) = 9.
		 * 
		 * There are several haunted rooms, so we'll disregard them as well as any rooms
		 * beneath them. Thus, the answer is 1 + 5 + 1 + 2 = 9.
		 * 
		 * For
		 * 
		 * matrix = [[1, 1, 1, 0], [0, 5, 0, 1], [2, 1, 3, 10]] the output should be
		 * solution(matrix) = 9.
		 * 
		 * Note that the free room in the final column makes the full column unsuitable
		 * for bots (not just the room directly beneath it). Thus, the answer is 1 + 1 +
		 * 1 + 5 + 1 = 9.
		 * 
		 * Input/Output A 2-dimensional array of integers representing the cost of each
		 * room in the building. A value of 0 indicates that the room is haunted.
		 * 
		 * Guaranteed constraints: 1 ≤ matrix.length ≤ 5, 1 ≤ matrix[i].length ≤ 5, 0 ≤
		 * matrix[i][j] ≤ 10.
		 * 
		 * [output] integer
		 * 
		 * The total price of all the rooms that are suitable for the CodeBots to live
		 * in.
		 */

		int[][] matrix = { { 0, 1, 1, 2 }, { 0, 5, 0, 0 }, { 2, 0, 3, 3 } };
		System.out.println(solution(matrix));
	}

	private static int solution(int[][] matrix) {
		// get 2d array row and column length
		int rowLen = matrix.length;
		int colLen = matrix[0].length;
		int sum = 0;
		// skip all the empty elements (skip all the free rooms)
		for (int i = 0; i < colLen; i++) { // column iterate
			for (int j = 0; j < rowLen; j++) { // row iterate
				if (matrix[j][i] == 0) { // if the current element is 0 (if it's free rooms)
					break; // exit the loop (ignore the rooms because it's hunted)
				}
				sum += matrix[j][i]; // other elements add it in the sum (cost of the rooms added to sum)
			}
		}
		return sum; // finally return the total cost of the rooms that is sum
	}
}

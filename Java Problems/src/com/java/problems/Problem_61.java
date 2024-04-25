package com.java.problems;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Problem_61 {

	public static void main(String[] args) {
		/*
		 * You are given an m x n integer grid accounts where accounts[i][j] is the
		 * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
		 * bank. Return the wealth that the richest customer has.
		 * 
		 * A customer's wealth is the amount of money they have in all their bank
		 * accounts. The richest customer is the customer that has the maximum wealth.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: accounts = [[1,2,3],[3,2,1]] Output: 6 Explanation: 1st customer has
		 * wealth = 1 + 2 + 3 = 6 2nd customer has wealth = 3 + 2 + 1 = 6 Both customers
		 * are considered the richest with a wealth of 6 each, so return 6. Example 2:
		 * 
		 * Input: accounts = [[1,5],[7,3],[3,5]] Output: 10 Explanation: 1st customer
		 * has wealth = 6 2nd customer has wealth = 10 3rd customer has wealth = 8 The
		 * 2nd customer is the richest with a wealth of 10. Example 3:
		 * 
		 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]] Output: 17
		 * 
		 * 
		 * Constraints:
		 * 
		 * m == accounts.length n == accounts[i].length 1 <= m, n <= 50 1 <=
		 * accounts[i][j] <= 100
		 */
		int[][] accounts = {{1,5},{7,3},{3,5}};
		System.out.println(maximumWealth(accounts));
	}
	
	private static int maximumWealth(int[][] accounts) {
		// get the array row length
		int rLen = accounts.length;
		// get the array column length
		int cLen = accounts[0].length;
		// create one new array list that hold customer wealth
		List<Integer> customerWealth = new ArrayList<>();
		// based on row length iterate
		for (int r = 0; r < rLen; r++) {
			int sum = 0;
			// based on column length iterate
			for (int c = 0; c < cLen; c++) {
				// take each customer element and sum
				sum += accounts[r][c];
			}
			customerWealth.add(sum); // add the sum of customer array element into customerWealth
		}
		
		return Collections.max(customerWealth); // finally return the maximum element in the customerWealth
	}

}

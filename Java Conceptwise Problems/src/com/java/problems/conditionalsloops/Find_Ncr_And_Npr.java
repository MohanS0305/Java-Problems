package com.java.problems.conditionalsloops;

import java.util.Scanner;

public class Find_Ncr_And_Npr {

    public static void main(String[] args) {
        /*
         * Find Ncr (combinations)and Npr (permutations)
         * In combinatorics, NC r (combination) and NP r (permutation) refer to
         * two different ways of selecting and arranging items from a set
         * 
         * Formula for Ncr = n! / r!(n - r)!
         * Formula for Npr = n! / (n - r)!
         */

        try (Scanner input = new Scanner(System.in)) {
            // ask input from user
            // 1st input as n
            System.out.println("Enter the n:");
            int n = input.nextInt();
            
            // 2nd input as r
            System.out.println("Enter the r:");
            int r = input.nextInt();
            
            // check input is greater than zero and r is less than or equal to n
            if (n >= 0 && r >= 0 && r <= n) {
                // call findCombination() (combinations)
                long ncr = findCombination(n, r);
                
                // call findPermutation() (permutations)
                long npr = findPermutation(n, r);
                
                // print ncr & npr
                System.out.println("n: " + n + " || r: " + r
                        + " || Ncr (combination) is " + ncr
                        + " || Npr (permutation) is " + npr);
            } else { // otherwise print error message
                System.err.println("Invalid input. Please enter non-negative numbers where r is less than or equal to n.");
            }
        } catch (Exception e) { // handle exception
            System.err.println("Invalid input. Please enter some numbers.");
        }
    }

    private static long factorial(int n) {
        long fact = 1;
        // based on n iterate the loop
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static long findCombination(int n, int r) {
        // apply formula for combination
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static long findPermutation(int n, int r) {
        // apply formula for permutation
        return factorial(n) / factorial(n - r);
    }
}

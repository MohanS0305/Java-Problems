package com.java.problems.functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Find_Max_And_Min_Numbers {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Take 3 inputs from the user
            System.out.println("Enter the first number:");
            int first = input.nextInt();

            System.out.println("Enter the second number:");
            int second = input.nextInt();

            System.out.println("Enter the third number:");
            int third = input.nextInt();

            // Check if all inputs are non-negative
            if (first >= 0 && second >= 0 && third >= 0) {
                // Find the largest and smallest numbers
                int largest = largestNumber(first, second, third);
                int smallest = smallestNumber(first, second, third);

                // Print the results
                System.out.println("The largest number among " + first + ", " + second + ", and " + third + " is " + largest);
                System.out.println("The smallest number among " + first + ", " + second + ", and " + third + " is " + smallest);
            } else {
                // Print error message for invalid input
                System.err.println("Invalid input. Please enter positive numbers only.");
            }
        } catch (InputMismatchException ime) {
            // Handle exception for non-integer input
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }

    private static int largestNumber(int first, int second, int third) {
        int max = first;

        // Check if the second number is greater than max
        if (second > max) {
            max = second;
        }
        // Check if the third number is greater than max
        if (third > max) {
            max = third;
        }

        return max;
    }

    private static int smallestNumber(int first, int second, int third) {
        int min = first;

        // Check if the second number is less than min
        if (second < min) {
            min = second;
        }
        // Check if the third number is less than min
        if (third < min) {
            min = third;
        }

        return min;
    }
}

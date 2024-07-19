package com.java.problems.conditionalsloops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Future_Interest_Value {

    public static void main(String[] args) {
        /*
         * Future Investment Value (FIV) typically refers to the projected value of an
         * investment at a future point in time, assuming certain growth rates or
         * returns. It's calculated based on factors like the initial investment amount,
         * the rate of return (interest or growth rate), and the time period over which
         * the investment grows. This value helps investors estimate how much their
         * investment will be worth in the future, considering the effects of
         * compounding and interest accrual.
         * 
         * Formula FV = P x ((1+r)^n - 1) / r 
         * FV = Future Value of the annuity 
         * P = Payment amount per period 
         * r = interest rate per period 
         * n = total number of payments
         */

        // create scanner object
        try (Scanner input = new Scanner(System.in)) {
            // take 3 inputs from user
            // 1st input as p(payment per period)
            System.out.println("Enter a payment per period:");
            int p = input.nextInt();

            // 2nd input as r(interest rate per period)
            System.out.println("Enter an interest rate per period:");
            double r = input.nextDouble();

            // 3rd input as n(total number of payments)
            System.out.println("Enter the total number of payments:");
            int n = input.nextInt();

            // Check for zero interest rate
            if (r == 0) {
                // If the interest rate is zero, future value is simply P * n
                double futureValue = p * n;
                System.out.println("Future Value: " + futureValue);
            } else {
                // apply formula for future interest value
                double futureValue = p * (Math.pow((1 + r), n) - 1) / r;
                // print the futureValue
                System.out.println("Future Value: " + String.format("%.2f", futureValue));
            }
        } catch (InputMismatchException ime) {
            // handle exception
            System.err.println("Invalid input, please enter a valid number.");
        }
    }
}

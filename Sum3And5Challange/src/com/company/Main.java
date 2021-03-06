package com.company;

// Sum 3 and 5 Challenge
//
// Create a statement using a range of numbers form 1 to 1000 inclusive
// Sum all the numbers that can be divided with both 3 and also with 5
// For those numbers that met the above conditions, pint out the number
// break out the loop once you find 5 numbers that met the above conditions
// After breaking out of the loop print the sum of the numbers that met the above conditions
// Note: Type all code in the main method


public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i; // sum the value where condition is true
                System.out.println(i + " can be divided by 3 and 5");
            } if (count == 5 ) {
                break;
            }
        }
        System.out.println("sum = " + sum);
    }
}

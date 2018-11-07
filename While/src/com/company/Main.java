package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("*******************");


	    //for loop solution (identical)
        for(count = 1; count != 6; count ++) {
            System.out.println("Count value is " + count);
        }
        System.out.println("*******************");

                                     
        // Another way to do the while loop
        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("*******************");


        // Challenge
        // Create a method called isEven number that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false

    }

    public static boolean isEven (int number) {
        if (number % 2 == 0) {
            return true;
        } return false;
    }
}

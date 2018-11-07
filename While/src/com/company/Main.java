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
        for (count = 1; count != 6; count++) {
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


//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEven(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }


        // Modify the while code above
        // Make it also record the total number of evens number it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEven(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("Total even number found = " + evenCount);
    }


    // CHALLENGE:
    // Create a method called isEven number that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false
    // return true if an even number, otherwise return false

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

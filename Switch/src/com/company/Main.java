package com.company;

public class Main {


    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("it was " + switchValue);
                break;

            default:
                System.out.println("was not between 1 and 5, values included");
                break;
        }

        char charValue = 'H';
        switch (charValue) {
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Value was " + charValue);
                break;

            default:
                System.out.println("Value was not A, B, C, D or E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Value was january");
                break;

            case "june":
                System.out.println("Value was june");
                break;

            case "july": case "august" : case "may":
                System.out.println("Value was " + month);
                break;

            default:
                System.out.println("Value was not january, june, july, august or may");
                break;
        }
    }
}

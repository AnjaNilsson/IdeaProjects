package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;      //the complete line is a statement
        myVariable++;           //the complete line is a statement
        System.out.println();   //the complete line is a statement

        System.out.println("This is" +
                " another" +
                " still more"); //Line 10,11,12 is also a complete statement

        int anotherVariable = 50;myVariable--;System.out.println("This is another one");
        // more than one statement on the same line. but not recommended!!

        //Java ignores whitespace
        //Indenting makes the code more readable
    }
}

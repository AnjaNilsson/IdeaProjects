package com.company;

/* Integers: This group includes byte, short, int, and long, which are for wholevalued
signed numbers.*/


public class Main {

    public static void main(String[] args) {

        int intMinValue = -2147483648;
        int intMaxValue = 2147483647;

        byte byteMinValue = -128;
        byte byteMaxValue = 127;
        byte byteNewValue = (byte) (byteMinValue/2);

        short shortMinValue =-32768;
        short shortMaxValue =32767;
        short shortNewValue = (short) (shortMinValue/2);

        long longMinValue = -9223372036854775808L;
        long longMaxValue = -9223372036854775807L;


/*The most commonly used integer type is int. It is a signed 32-bit type that has a
range from –2,147,483,648 to 2,147,483,647.*/

/*The smallest integer type is byte. This is a signed 8-bit type that has a range from
128 to 127.*/

/*short is a signed 16-bit type. It has a range from –32,768 to 32,767. It is probably
the least-used Java type. Here are some examples of short variable declarations:*/

/*long is a signed 64-bit type and is useful for those occasions where an int type is not
large enough to hold the desired value. It has a range from-9,223,372,036,854,775,808
to 9,223,372,036,854,775,807*/

/* NEW TASK!*/

        //1. Create a byte variable and set it to any valid byte number.
        //2. Create a short variable and set it to any valid short number.
        //3. Create a int variable and set it to any valid int number.
        //4. Create a variable of type long, and make it equal to
        //   5000 + 10 times the sum of the byte, plus the short plus the int


        byte myByteValue = 25;
        short myShortValue = 99;
        int myIntValue = 186;
        long myLongValue = 5000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println("Total = " + myLongValue);


    }
}

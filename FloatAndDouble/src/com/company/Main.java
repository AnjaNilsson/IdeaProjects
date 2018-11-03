package com.company;

/*Floating-point numbers, also known as real numbers, are used when evaluating
expressions that require fractional precision. For example, calculations such as
square root, or transcendentals such as sine and cosine, result in a value whose
precision requires a floating-point type. Java implements the standard (IEEE–754)
set of floating-point types and operators. There are two kinds of floating-point types,
float and double, which represent single- and double-precision numbers,
respectively. Their width and ranges are shown here:*/


public class Main {

    public static void main(String[] args) {

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

/*The type float specifies a single-precision value that uses 32 bits of storage.*/
/*Double precision, as denoted by the double keyword, uses 64 bits to store a value.*/

        /*TASK!*/
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the numbers of Kilograms for the number above and store in a variable
        //3. Print out the result
        //
        // NOTES: 1 pound is equal to 0.45359237

        double numPound = 200d;
        double convertToKilo = 0.45359237d;
        double totalOfKilo = numPound * convertToKilo;

        System.out.println(numPound +" pound is = " + totalOfKilo + "kg");



    }
}

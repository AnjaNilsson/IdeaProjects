package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1+2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++; // adds 1 to the result
        System.out.println("Result is now " + result);
        result--; //subtract one from the previous result
        System.out.println("Result is now " + result);

        result += 2; //adds 2 the previous result
        System.out.println("Result is now " + result);

        result *= 10; //multiply 10 with the previous result
        System.out.println("Result is now " + result);

        result -= 10; //subtract 10 from the previous result
        System.out.println("Result is now " + result);

        result /= 10; //subtract 10 from the previous result
        System.out.println("Result is now " + result);

        boolean isAlien  = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100!");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        //CHALLENGE
        //1. Create a double variable with the value 20
        //2. Create a second variable of the type double with the value 80
        //3. Add both numbers up and multiply with by 25
        //4. Use the remainder operator to figure out the remainder from the #3 divided by 40
        //5. Write an "if" statement that displays a message "Total was over the limit"
        //   if the remaining total #4 is equal to 20 or less

        double myVariable = 20;
        double mySecondVariable = 80;
        double myVariableSum = (myVariable + mySecondVariable) * 25;
        System.out.println("myVariableSum = " + myVariableSum);
        double myRemainder = myVariableSum % 40;
        System.out.println("myRemainder = " + myRemainder);

        if (myRemainder <= 20)
            System.out.println("Total was over the limit");


    }
}

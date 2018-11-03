package com.company;

/* CHALLENGE
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds
You should validate that the first parameter minutes is >= 0
You should validate that the second parameter seconds is >= 0 and <= 59
The method should return "Invalid value" in the method if either of above are not true

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed
to this methods and return that value as a string in format "XXh YYm ZZs" where XX represents a number of hours, YY
the minutes and ZZ the seconds


Create a second method of the same name but only with one parameters second
Validate that it is >= 0, and return "Invalid value" if it is not true

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method
passing the correct minutes and seconds calculated so that it can calculate correctly

call both methods to print values to the console

TIPS:
- use int or long for your number data types is probably a good idea
- 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds
- methods should be static as we have used previously

BONUS:
- For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (tip: use id-else)
- Create a new console project and call it SecondsAndMinutesChallenge
*/


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(9500));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";

        }
        return "Invalid Value";
    }

    private static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return "Invalid Value";
        }

    }
}

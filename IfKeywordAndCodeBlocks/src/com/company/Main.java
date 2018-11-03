package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 4000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score is less than 100");
//        } else {
//            System.out.println("Got here");
//        } //A code block is whatever there is in between the curly brackets

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // CHALLENGE
        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // Make sure the first printout above still displays as well

        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your new final score is " + finalScore);
        }


    }
}

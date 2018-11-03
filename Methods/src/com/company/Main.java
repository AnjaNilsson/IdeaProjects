package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int playerScore = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, playerScore, levelCompleted, bonus);
        System.out.println("Your final score is = " + highScore);


        gameOver = true;
        playerScore = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, playerScore, levelCompleted, bonus);
        System.out.println("Your final score is = " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and
        // the position they got and a further message " on the high score table
        //
        // Create a second method called calculateHighScorePosition
        // It should send one argument only, the player score
        // the return data should be
        // 1 if the score is >1000
        // 2 if the score is >500 and <1000
        // 3 if the score >100 and <500
        // 4 in all other cases
        // call both methods and display the result of the following
        // a score of 1500, 900, 400, and 50



        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Kim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Samantha", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jill", highScorePosition);

    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition);
    }

    public static int calculateHighScorePosition(int playerScore) {


        // FIRST SOLUTION!!!
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        //ALTERNATIVE SOLUTION!!
        int position = 4; //assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        }else if (playerScore >= 500) {
            position = 2;
        }else if (playerScore >=100); {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

}

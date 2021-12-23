package com.vishnu.udemy;

public class HighScoreCalculatorChallenge {

    public static void main(String[] args) {
        int score1 = 1500, score2 = 900, score3 = 400, score4 = 50;
        int result = calculateHighScorePosition(score4);
        displayHighScorePosition("Player", result);
    }

    //High Score Challenge
    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position : " + position +
                " on the highscore table.");
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if (score >= 1000)
            position = 1;
        else if (score >= 500)
            position = 2;
        else if (score >= 100)
            position = 3;
        return position;
    }
}

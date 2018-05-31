package com.ianl;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if (score < 5000 && score >1000) {
//            System.out.println("Your score was less than 5000, but greater than 1000!");
//        } else if ( score < 1000 ) {
//			System.out.println("Score was less than 1000");
//		} else {
//			System.out.println("Got here!");
//		}

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		//You can't access variables created in a code block outside of the block
		//int finalScore = finalScore;

		//Print out a second score on the screen with the following:
		//score set to 10000
		//level completed set to 8
		//bonus set to 200
		//but the first print out has to display as well
//		if (gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			System.out.println("Your final score was " + finalScore);
//		}
//
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		//Can also write if(gameOver)
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		}
		//will only be reached if the previous block's return wasn't hit
		//we return -1 because it represents an error or an invalid value/value not found
		return -1;
	}
}

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

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
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

		//This works but is it good?? Should we determine returned variables based off of in-laid methods?
		displayHighScorePosition("Sam", calculateHighScorePosition(1500));
		displayHighScorePosition("Taylor", calculateHighScorePosition(900));
		displayHighScorePosition("Jane", calculateHighScorePosition(400));
		displayHighScorePosition("Janet", calculateHighScorePosition(50));
		displayHighScorePosition("Mary", calculateHighScorePosition(1000));
		displayHighScorePosition("Martin", calculateHighScorePosition(500));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		//Can also write if(gameOver){...}
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		}
		//will only be reached if the previous block's return wasn't hit
		//we return -1 because it represents an error or an invalid value/value not found
		return -1;
	}

	//void functions/methods are called procedures (functions that dont return anything)
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName+" managed to get into position "+highScorePosition+" on the highscore table.");
	}

	public static int calculateHighScorePosition(int playerHighScore) {
//		if(playerHighScore >= 1000) {
//			return 1;
//		} else if (playerHighScore >= 500) {
//			return 2;
//		} else if (playerHighScore >= 100) {
//			return 3;
//		}
//		//if all conditions above are false, this return is hit
//		return 4;

		//Rewrote above function to have only 1 return for absolute clarity.
		int position = 4; //Assuming position four will always be returned
		//Checks players high score and changes position variable inside function/method
		if (playerHighScore >= 1000) {
			position = 1;
		} else if (playerHighScore >= 500) {
			position = 2;
		} else if (playerHighScore >= 100) {
			position = 3;
		}
		return position;
	}
}

/**
 * This program simulates a simple dice game
 */
package chapter4;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * 4.21 Dice Game
 * 
 * Write a program that plays a simple dice game between the computer and the
 * user. When the program runs, a loop should repeat 10 times. Each iteration of
 * the loop should do the following: Generate a random integer in the range of 1
 * through 6. This is the value of the computer’s die. Generate another random
 * integer in the range of 1 through 6. This is the value of the user’s die. The
 * die with the highest value wins. (In case of a tie, there is no winner for
 * that particular roll of the dice.) As the loop iterates, the program should
 * keep count of the number of times the computer wins, and the number of times
 * that the user wins. After the loop performs all of its iterations, the
 * program should display who was the grand winner, the computer or the user.
 * 
 * @author Nikolay Stoyanov Oct 15, 2022
 */

public class DiceGame
{

	// Main method gets input, plays game and displays results
	public static void main(String[] args)
	{

		// Declare and initiate variables
		Integer userDieRoll = 0;
		Integer computerDieRoll = 0;
		Integer userWins = 0;
		Integer computerWins = 0;
		Integer numberOfPlays = 10;
		Integer draws = 0;

		// Assign random numbers
		Random computerRanNum = new Random();
		Random userRanNum = new Random();

		// Keep loop running
		Boolean keepGoing = true;

		// Play game and keep score
		while (keepGoing)
		{
			for (int i = 1; i <= numberOfPlays; i++)
			{
				userDieRoll = userRanNum.nextInt(6) + 1;
				computerDieRoll = computerRanNum.nextInt(6) + 1;

				if (userDieRoll < computerDieRoll)
				{
					computerWins += 1;
				} else if (userDieRoll > computerDieRoll)
				{
					userWins += 1;
				} else
				{
					draws += 1;
				}

			}

			// Calculate who's the winner
			StringBuilder winner = new StringBuilder();
			if (userWins > computerWins)
			{
				winner.append("--->You are the grand winner!<---");
			} else if (userWins < computerWins)
			{
				winner.append("--->Computer is the grand winner!<---");
			} else
			{
				winner.append("--->No grand winners! It's a draw!<---");
			}

			// print results and ask if user wants to play again
			String tryAgainInput = JOptionPane
					.showInputDialog("Final Score\n" + "You: " + userWins + "\nComputer: " + computerWins + "\nDraws: "
							+ draws + "\n" + winner + "\nEnter 1 to play, anything else to exit. ");
			Integer tryAgain = Integer.parseInt(tryAgainInput);

			// Loop incase user does not want to play again
			if (tryAgain != 1)
			{
				keepGoing = false;
				JOptionPane.showMessageDialog(null, "Game over. Thanks for playing!");

			}
		} // Close while loop

	}// Close main

}// Close class

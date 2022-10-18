/**
 * Program to simulate a slot machine
 */
package chapter4;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * 4.21 Slot Machine Simulator
 * 
 * A slot machine is a gambling device that the user inserts money into and then
 * pulls a lever (or presses a button). The slot machine then displays a set of
 * random images. If two or more of the images match, the user wins an amount of
 * money that the slot machine dispenses back to the user. Create a program that
 * simulates a slot machine. When the program runs, it should do the following:
 * Asks the user to enter the amount of money he or she wants to enter into the
 * slot machine. Instead of displaying images, the program will randomly select
 * a word from the following list: Cherries, Oranges, Plums, Bells, Melons, Bars
 * To select a word, the program can generate a random number in the range of 0
 * through 5. If the number is 0, the selected word is Cherries; if the number
 * is 1, the selected word is Oranges; and so forth. The program should randomly
 * select a word from this list three times and display all three of the words.
 * If none of the randomly selected words match, the program will inform the
 * user that he or she has won $0. If two of the words match, the program will
 * inform the user that he or she has won two times the amount entered. If three
 * of the words match, the program will inform the user that he or she has won
 * three times the amount entered. The program will ask whether the user wants
 * to play again. If so, these steps are repeated. If not, the program displays
 * the total amount of money entered into the slot machine and the total amount
 * won. Decision Structures
 * 
 * 
 * 
 * @author Nikolay Stoyanov Oct 15, 2022
 */

public class SlotMachineSimulation
{
	// Main method get input assigns random numbers and displays results

	public static void main(String[] args)
	{
		// Print greeting message and initiate globa variables
		JOptionPane.showMessageDialog(null, "--->Welcome to the Slot Machine<---");
		Boolean keepGoing = true;
		Integer totalWinnings = 0;
		Integer totalBet = 0;

		// Loop to run until user decides to quit
		while (keepGoing)
		{
			// Get input and initiate variables
			String betAmountInput = JOptionPane.showInputDialog("Enter amount $ you want to bet: ");
			Integer betAmount = Integer.parseInt(betAmountInput);
			Integer betMultiplier = 0;
			Integer winnings = 0;

			// validate that be amount is a positive number
			while (betAmount <= 0)
			{
				betAmountInput = JOptionPane.showInputDialog("You can't bet less than $1.\nTry again: ");
				betAmount = Integer.parseInt(betAmountInput);
			}

			// Assign random numbers to variables
			Random image = new Random();
			int firstNumber = image.nextInt(6);
			int secondNumber = image.nextInt(6);
			int thirdNumber = image.nextInt(6);

			// Initiate string variables to hold image rolled
			String firstImage = "";
			String secondImage = "";
			String thirdImage = "";

			// Assign variable for first image
			switch (firstNumber)
			{
				case 0:
					firstImage = "Cherries";
					break;
				case 1:
					firstImage = "Oranges";
					break;
				case 2:
					firstImage = "Plums";
					break;
				case 3:
					firstImage = "Bells";
					break;
				case 4:
					firstImage = "Melons";
					break;
				case 5:
					firstImage = "Bars";
					break;

			}
			// Assign variable for second image
			switch (secondNumber)
			{
				case 0:
					secondImage = "Cherries";
					break;
				case 1:
					secondImage = "Oranges";
					break;
				case 2:
					secondImage = "Plums";
					break;
				case 3:
					secondImage = "Bells";
					break;
				case 4:
					secondImage = "Melons";
					break;
				case 5:
					secondImage = "Bars";
					break;

			}
			// Assign variable for third image
			switch (thirdNumber)
			{
				case 0:
					thirdImage = "Cherries";
					break;
				case 1:
					thirdImage = "Oranges";
					break;
				case 2:
					thirdImage = "Plums";
					break;
				case 3:
					thirdImage = "Bells";
					break;
				case 4:
					thirdImage = "Melons";
					break;
				case 5:
					thirdImage = "Bars";
					break;

			}
			// Display results of the roll
			JOptionPane.showMessageDialog(null, firstImage + "\n" + secondImage + "\n" + thirdImage);

			// Assign bet multiplier based on how many image are the same
			if (firstImage.equals(secondImage) || firstImage.equals(thirdImage) || secondImage.equals(thirdImage))
			{
				betMultiplier = 2;
				winnings = betMultiplier * betAmount;
				JOptionPane.showMessageDialog(null, "Two matches! You win :$" + winnings);
			} else if (firstImage.endsWith(secondImage) && secondImage.equals(thirdImage))
			{
				betMultiplier = 3;
				winnings = betMultiplier * betAmount;
				JOptionPane.showMessageDialog(null, "Three! You win :$" + winnings);
			} else
			{
				winnings = betMultiplier * betAmount;
				JOptionPane.showMessageDialog(null, "No matches. Sorry, you lose.");

			}
			// Keep running total
			totalWinnings += winnings;
			totalBet += betAmount;

			// See if user wants to play again
			String keepGoingInput = JOptionPane
					.showInputDialog("Game over.\nWant to try again?\nEnter 1 to play, anything else to exit. ");
			Integer tryAgain = Integer.parseInt(keepGoingInput);

			// Loop incase user does not want to play again. Display results in a window.
			if (tryAgain != 1)
			{

				keepGoing = false;
				JOptionPane.showMessageDialog(null, "Game over. Thanks for playing!");
				JOptionPane.showMessageDialog(null, "Total bet: $" + totalBet + "\nTotal winnings: $" + totalWinnings);
			}
		} // Close while loop

	}// Close main

}// Close class

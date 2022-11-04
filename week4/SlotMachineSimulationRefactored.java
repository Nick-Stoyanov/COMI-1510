/**
 * Program to simulate a slot machine
 */
package chapter5;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * Slot Machine Simulator Refactored
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
 * @author Nikolay Stoyanov Oct 26, 2022
 */
public class SlotMachineSimulationRefactored
{
	/**
	 * Default constructor a
	 */
	public SlotMachineSimulationRefactored()
	{
		super();
	}

	/**
	 * Main method assigns variables and calls functions to execute program
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{

		// While loop to restart the program
		Boolean runAgain = true;
		while (runAgain)
		{
			// Print greeting message and initiate variables
			JOptionPane.showMessageDialog(null, "--->Welcome to the Slot Machine<---");
			Integer betAmount = 0;
			Integer firstNumber = 0;
			Integer secondNumber = 0;
			Integer thirdNumber = 0;

			// Create stringbuilder objects to hold image
			StringBuilder firstImage = new StringBuilder();
			StringBuilder secondImage = new StringBuilder();
			StringBuilder thirdImage = new StringBuilder();

			// get bet amount
			betAmount = getBetAmount();

			// get three random numbers
			firstNumber = getFirstNumber();
			secondNumber = getSecondNumber();
			thirdNumber = getThirdNumber();

			// assign a picture to each stringbuilder based on random number generated
			firstImage.append(assignFirstPicture(firstNumber));
			secondImage.append(assignSecondPicture(secondNumber));
			thirdImage.append(assignThirdPicture(thirdNumber));

			// check results and display results
			checkRollResults(firstImage, secondImage, thirdImage, betAmount);
			// Check if user wants to restart program
			runAgain = runAgain();

		}

	}

	/**
	 * get and validate user input for bet amount
	 * 
	 * @return bet amount
	 */

	public static Integer getBetAmount()
	{
		// Get input and initiate variables
		String betAmountInput = JOptionPane.showInputDialog("Enter amount $ you want to bet: ");
		Integer betAmount = Integer.parseInt(betAmountInput);
		while (betAmount <= 0)
		{
			betAmountInput = JOptionPane.showInputDialog("You can't bet less than $1.\nTry again: ");
			betAmount = Integer.parseInt(betAmountInput);
		}
		return betAmount;

	}

	/**
	 * Get first random int
	 * 
	 * @return first randmon int
	 */
	public static Integer getFirstNumber()

	{
		Random image = new Random();
		int firstNumber = image.nextInt(6);
		return firstNumber;
	}

	/**
	 * Get second random int
	 * 
	 * @return second random int
	 */
	public static Integer getSecondNumber()
	{
		Random image = new Random();
		int secondNumber = image.nextInt(6);
		return secondNumber;
	}

	/**
	 * Get third random int
	 * 
	 * @return third random int
	 */
	public static Integer getThirdNumber()
	{
		Random image = new Random();
		int thirdNumber = image.nextInt(6);
		return thirdNumber;
	}

	/**
	 * assign an image based on random number input
	 * 
	 * @param firstNumber first random int
	 * 
	 * @return first image
	 */
	public static StringBuilder assignFirstPicture(Integer firstNumber)
	{
		StringBuilder firstImage = new StringBuilder();

		switch (firstNumber)
		{
			case 0:
				firstImage.append("Cherries");
				break;
			case 1:
				firstImage.append("Oranges");
				break;
			case 2:
				firstImage.append("Plums");
				break;
			case 3:
				firstImage.append("Bells");
				break;
			case 4:
				firstImage.append("Melons");
				break;
			case 5:
				firstImage.append("Bars");
				break;

		}
		return firstImage;
	}

	/**
	 * assign an image based on random number
	 * 
	 * @param secondNumber second randon int
	 * 
	 * @return second image
	 */
	public static StringBuilder assignSecondPicture(Integer secondNumber)
	{
		StringBuilder secondImage = new StringBuilder();

		switch (secondNumber)
		{
			case 0:
				secondImage.append("Cherries");
				break;
			case 1:
				secondImage.append("Oranges");
				break;
			case 2:
				secondImage.append("Plums");
				break;
			case 3:
				secondImage.append("Bells");
				break;
			case 4:
				secondImage.append("Melons");
				break;
			case 5:
				secondImage.append("Bars");
				break;

		}
		return secondImage;

	}

	/**
	 * assign an image based on random number
	 * 
	 * @param thirdNumber third random int
	 * 
	 * @return third image
	 */
	public static StringBuilder assignThirdPicture(Integer thirdNumber)
	{
		StringBuilder thirdImage = new StringBuilder();
		switch (thirdNumber)
		{
			case 0:
				thirdImage.append("Cherries");
				break;
			case 1:
				thirdImage.append("Oranges");
				break;
			case 2:
				thirdImage.append("Plums");
				break;
			case 3:
				thirdImage.append("Bells");
				break;
			case 4:
				thirdImage.append("Melons");
				break;
			case 5:
				thirdImage.append("Bars");
				break;

		}
		return thirdImage;
	}

	/**
	 * Compare three images and assign winnings multiplier based on result. Use
	 * multiplier to calculate winnings and display results
	 * 
	 * @param firstImage  first image
	 * @param secondImage seocnd image
	 * @param thirdImage  third image
	 * @param betAmount   bet amount
	 */
	public static void checkRollResults(StringBuilder firstImage, StringBuilder secondImage, StringBuilder thirdImage,
			Integer betAmount)
	{
		Integer betMultiplier = 0;
		Integer winnings = 0;
		Integer totalWinnings = 0;
		Integer totalBet = 0;
		JOptionPane.showMessageDialog(null, firstImage + "\n" + secondImage + "\n" + thirdImage);
		if ((firstImage.toString()).equals(secondImage.toString())
				|| (firstImage.toString()).equals(thirdImage.toString())
				|| (secondImage.toString()).equals(thirdImage.toString()))
		{

			betMultiplier = 2;
			winnings = betMultiplier * betAmount;
			JOptionPane.showMessageDialog(null, "Two matches! You win :$" + winnings);
		} else if ((firstImage.toString()).equals(secondImage.toString())
				&& (secondImage.toString()).equals(thirdImage.toString()))
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
		JOptionPane.showMessageDialog(null, "Total bet: $" + totalBet + "\nTotal winnings: $" + totalWinnings);

	}

	/**
	 * Ask user if they would like to run the program again. If no then display a
	 * goodbye message.
	 * 
	 * @return boolean to stop or continue the program
	 */
	public static Boolean runAgain()
	{
		Boolean run = true;
		int n = JOptionPane.showConfirmDialog(null, "Do you want to use the program again?", " Select an option",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.NO_OPTION)
		{
			run = false;
			JOptionPane.showMessageDialog(null, "Thanks for using the program!\nBye bye.");

		}
		return run;
	}

}// Close class

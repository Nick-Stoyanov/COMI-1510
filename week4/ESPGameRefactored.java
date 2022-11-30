/**
 * Program to test ESP refactored
 */
package chapter5;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * ESPGame Refactored
 * 
 * 
 * Write a program that tests your ESP (extrasensory perception). The program
 * should randomly select the name of a color from the following list of words:
 * Red, Green, Blue, Orange, Yellow To select a word, the program can generate a
 * random number. For example, if the number is 0, the selected word is Red, if
 * the number is 1, the selected word is Green, and so forth. Next, the program
 * should ask the user to enter the color that the computer has selected. After
 * the user has entered his or her guess, the program should display the name of
 * the randomly selected color. The program should repeat this 10 times and then
 * display the number of times the user correctly guessed the selected color.
 * 
 * @author Nikolay Stoyanov Oct 26, 2022
 */

public class ESPGameRefactored
{

	/**
	 * Default constructor
	 */
	public ESPGameRefactored()
	{
		super();
	}

	/**
	 * Main method gets input and loops through then display results
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		
		/**
		 * Set constant for program
		 */
		final Integer numberOfPlays = 10;
		
		// Initiate valiable
		Integer correctGuesses = 0;

		// While loop uset to restart game
		Boolean runAgain = true;
		while (runAgain)
		{

			// get user color input and loop 10 times
			correctGuesses = getCorrectGuesses(numberOfPlays);

			// Display number of correct guesses
			displayResults(correctGuesses);

			// Check if user wants to restart program
			runAgain = runAgain();
		}

	}

	/**
	 * Get user input for color and check if it matches the randomly generated color
	 * using a loop. Then compare both and decide if they match. Keep a running
	 * total of correct guesses.
	 * 
	 * @param numberOfPlays times the game will iterate
	 * 
	 * @return number of correct guesses
	 */
	public static Integer getCorrectGuesses(Integer numberOfPlays)
	{
		// Create a random number object
		Random rand = new Random();

		// Initialize values
		Integer guesses = 0;
		Integer colorNumber = 0;
		for (int i = 1; i <= numberOfPlays; i++)
		{
			// Get user input
			String inputColor = JOptionPane.showInputDialog("Enter color: ");
			StringBuilder color = new StringBuilder();

			// Generate random number and assign it to color variable based or random number
			colorNumber = rand.nextInt(5);
			if (colorNumber == 0)
			{
				color.append("Red");
			} else if (colorNumber == 1)
			{
				color.append("Green");
			} else if (colorNumber == 2)
			{
				color.append("Blue");
			} else if (colorNumber == 3)
			{
				color.append("Orange");
			} else
			{
				color.append("Yellow");
			}

			// Display the color selected
			JOptionPane.showMessageDialog(null, "Color selected: " + color);

			// Keep a total of correct guesses
			if (inputColor.equalsIgnoreCase(color.toString()))
			{
				guesses += 1;
			}
		}
		return guesses;
	}

	/**
	 * Dispaly correct guesses
	 * 
	 * @param correctGuesses number of correct guesses
	 */
	public static void displayResults(Integer correctGuesses)
	{
		JOptionPane.showMessageDialog(null, "Correct guesses: " + correctGuesses);
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

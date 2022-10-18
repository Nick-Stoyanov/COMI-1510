/**
 * Program to test ESP
 */
package chapter4;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * 4.19 ESP Game
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
 * display the number of times the user correctly guessed the selected color
 * 
 * @author Nikolay Stoyanov Oct 15, 2022
 */

public class ESPGame
{

	// Main method gets input and loops through then display results
	public static void main(String[] args)
	{

		// Initiate variables
		Integer colorNumber = 0;
		String color = null;
		Integer numberOfPlays = 10;
		Random rand = new Random();
		Integer correctGuesses = 0;
		boolean keepGoing = true;

		// While loop uset to restart game
		while (keepGoing)
		{
			// For loop to iterate 10 times
			for (int i = 1; i <= numberOfPlays; i++)
			{
				// Get user input
				String inputColor = JOptionPane.showInputDialog("Enter a color: ");

				// Generate random number and assign it to color variable based or random number
				colorNumber = rand.nextInt(5);
				if (colorNumber == 0)
				{
					color = "Red";
				} else if (colorNumber == 1)
				{
					color = "Green";
				} else if (colorNumber == 2)
				{
					color = "Blue";
				} else if (colorNumber == 3)
				{
					color = "Orange";
				} else
				{
					color = "Yellow";
				}

				// Display the color selected
				JOptionPane.showMessageDialog(null, "Color selected: " + color);

				// Keep a total of correct guesses
				if (inputColor.equalsIgnoreCase(color))
				{
					correctGuesses += 1;
				}
			}

			// Display results in a window
			JOptionPane.showMessageDialog(null, "Correct guesses: " + correctGuesses);

			// Check if user wantch to restart game
			String tryAgainInput = JOptionPane
					.showInputDialog("Game over.\nWant to try again?\nEnter 1 to play, anything else to exit. ");
			Integer tryAgain = Integer.parseInt(tryAgainInput);

			// Loop incase user does not want to play again
			if (tryAgain != 1)
			{

				keepGoing = false;
				JOptionPane.showMessageDialog(null, "Game over. Thanks for playing!");
			}
		}

	}// Close main

}// Close class

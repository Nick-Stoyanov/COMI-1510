/**
 * Program to count letters in a String
 */
package chapter4;

import javax.swing.JOptionPane;

/**
 * 4.5 Letter Counter
 * 
 * Write a program that asks the user to enter a string, and then asks the user
 * to enter a character. The program should count and display the number of
 * times that the specified character appears in the string.
 * 
 * @author Nikolay Stoyanov Oct 10, 2022
 */

public class LetterCounter
{
	/**
	 * Default constructor
	 */
	public LetterCounter()
	{
		super();
	}

	/**
	 * Main method prompts user for input and displays results
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{

		// Get input for string and a letter
		String inputString = JOptionPane.showInputDialog("Enter a word or sentence: ");
		String letterString = JOptionPane.showInputDialog("Enter a character: ");

		// convert to char
		char letter = letterString.charAt(0);

		// Initiate a value to use as running total
		Integer letterCount = 0;

		// For loop to loop through the entire string and add a number to letterCount if
		// condition is met
		for (int i = 0; i < inputString.length(); i++)
		{
			char checkLetter = inputString.charAt(i);

			if (checkLetter == letter)

			{
				letterCount++;
			}
		}

		// Display results
		JOptionPane.showMessageDialog(null,
				"The character " + letter + " appears " + letterCount + " times in your sentence.");

	}// Close main

}// Close class
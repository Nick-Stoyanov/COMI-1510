/**
 * Program to find the char in a word
 */
package chapter5;

import javax.swing.JOptionPane;

/**
 * 5.1 showChar Method
 * 
 * Write a method named showChar. The method should accept two arguments: a reference to
 * a String object and an integer. The integer argument is a character position within
 * the String, with the first character being at position 0. When the method executes, it should display the character
 * at that character position. Here is an example of a call to the method: showChar("New York", 2); In
 * this call, the method will display the character w because it is in position 2. Demonstrate the method in
 * a complete program.
 * 
 * 
 * @author Nikolay Stoyanov Oct 25, 2022
 */
public class ShowCharMethod
{

	/**
	 * Defaults constructor
	 */
	public ShowCharMethod()
	{
		super();
	}

	/**
	 * Main method declares variables and calls methods
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		// While loop to restart program
		Boolean runAgain = true;
		while (runAgain)
		{
			// Declare and initiate variables
			StringBuilder userString = new StringBuilder();
			Integer userNumber = 0;
			char userChar;

			// Get input for string
			userString = getString();

			// Get number and validate its smaller than the length of the string
			userNumber = getInt(userString);

			// Get the char at selected position
			userChar = getChar(userString, userNumber);

			/// Display results
			displayResults(userChar);

			// Check if user wants to restart program
			runAgain = runAgain();
		}

	}

	/**
	 * Prompts user for string input and returns is.
	 * 
	 * @return User's string input
	 */
	public static StringBuilder getString()
	{

		String inputString = JOptionPane.showInputDialog("Enter a word/sentence:");
		StringBuilder sb = new StringBuilder(inputString);
		return sb;
	}

	/**
	 * Prompts user to enter the number of the character to find in the string. Program also validates that the number
	 * does not exceed the string length, if it does it asks the user to reenter number.
	 * 
	 * @param userString user string input
	 * 
	 * @return validated number to find a character at the given position
	 */
	public static Integer getInt(StringBuilder userString)
	{

		String inputNumber = JOptionPane.showInputDialog(
				"Enter the position of the character you'd like to see.\n(1 for the first, 2 for the second etc.)");
		Integer number = Integer.parseInt(inputNumber);
		while (userString.length() < number)
		{
			inputNumber = JOptionPane.showInputDialog("Number is greater than the length. Try again: ");
			number = Integer.parseInt(inputNumber);

		}
		return number - 1;
	}

	/**
	 * Program finds the character at the indicated position
	 * 
	 * @param userString user string input
	 * @param userNumber validated number to find a character at the given position
	 * 
	 * @return character at given position
	 */
	public static char getChar(StringBuilder userString, Integer userNumber)
	{

		char userChar = userString.charAt(userNumber);
		return userChar;

	}

	/**
	 * Display results. If the results is an empty space the program display a slightly different
	 * message
	 * 
	 * @param userChar character at given position selected by user
	 */
	public static void displayResults(char userChar)
	{
		if (userChar == ' ')
		{
			JOptionPane.showMessageDialog(null, "Character at selected position is an empty space.");
		} else
		{
			JOptionPane.showMessageDialog(null, "Character at selected position: " + userChar);
		}
	}

	/**
	 * Ask user if they would like to run the program again. If no then display a goodbye message.
	 * 
	 * @return boolean to stop or continue the program
	 */
	public static Boolean runAgain()
	{
		Boolean play = true;
		int n = JOptionPane.showConfirmDialog(null, "Do you want to use the program again?", " Select an option",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.NO_OPTION)
		{
			play = false;
			JOptionPane.showMessageDialog(null, "Thanks for playing!\nBye bye.");
		}
		return play;
	}

}// close class

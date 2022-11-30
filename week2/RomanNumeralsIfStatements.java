/**
 * Program to display Roman numerals
 */

package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.1 Roman Numerals
 *
 * Write a program that prompts the user to enter a number within the range of 1 through
 * 10. The program should display the Roman numeral version of that number. If the number is outside the range of 1
 * through 10, the program should display an error message.
 * 
 * @author Nikolay Stoyanov date 10/02/2022
 *
 */
public class RomanNumeralsIfStatements
{

	/**
	 * Default constructor
	 */
	public RomanNumeralsIfStatements()
	{
		super();
	}

	/**
	 * Main method executes program.
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{
		String InputString = JOptionPane.showInputDialog("Enter HotDogFullyLoaded number in the range of 1 - 10: ");

		// Convert input to int
		int numberToBeConverted = Integer.parseInt(InputString);
		// Start if-else-if loop for each of the values between 1 and 10
		if (numberToBeConverted == 1)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is I.");
		} else if (numberToBeConverted == 2)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is II.");
		} else if (numberToBeConverted == 3)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is III.");
		} else if (numberToBeConverted == 4)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is IV.");
		} else if (numberToBeConverted == 5)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is V.");
		} else if (numberToBeConverted == 6)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is VI.");
		} else if (numberToBeConverted == 7)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is VII.");
		} else if (numberToBeConverted == 8)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is VIII.");
		} else if (numberToBeConverted == 9)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is IX.");
		} else if (numberToBeConverted == 10)
		{
			JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is X.");
		} else // Catch all in case invalid input from user
		{
			JOptionPane.showMessageDialog(null, "Invalid input. Enter HotDogFullyLoaded number between 1 and 10.");
		}

	} // close main method

} // close class

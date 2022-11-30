/**
 * Program to display largest and smallest int
 */
package chapter4;

import javax.swing.JOptionPane;

/**
 * 4.10 Largest and Smallest
 * 
 * Write a program with a loop that lets the user enter a series of integers.
 * The user should enter −99 to signal the end of the series. After all the
 * numbers have been entered, the program should display the largest and
 * smallest numbers entered.
 * 
 * @author Nikolay Stoyanov Oct 13, 2022
 */

public class LargestAndSmallest
{

	/**
	 * Default constructor
	 */
	public LargestAndSmallest()
	{
		super();
	}

	/**
	 * Main method gets input and displays results
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{

		// Initiate variables
		Integer largestNumber = 0;
		Integer smallestNumber = 0;

		// Get input and validate it (-99 exits the loop)
		String InputNumber = JOptionPane.showInputDialog("Enter a number (-99 ends the program): ");
		Integer number = Integer.parseInt(InputNumber);

		// Initialize values to input
		largestNumber = number;
		smallestNumber = number;

		// Loop and assign smallest and largest numbers
		while (number != -99)
		{

			if (number > largestNumber)
			{
				largestNumber = number;
			} else if (number < largestNumber)
			{
				smallestNumber = number;
			}
			InputNumber = JOptionPane.showInputDialog("Enter a number (-99 ends the program): ");
			number = Integer.parseInt(InputNumber);
		}

		// Display results
		JOptionPane.showMessageDialog(null,
				"Smallest number entered: " + smallestNumber + "\nLargest number entered: " + largestNumber);

	}// Close main

}// Close main

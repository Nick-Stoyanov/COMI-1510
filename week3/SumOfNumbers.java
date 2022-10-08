/**
 * Program to sum up the values form 1 up until the number entered
 */
package week3;

import javax.swing.JOptionPane;

/**
 * 4.1 Sum of Numbers
 * 
 * 
 * Write a program that asks the user for a positive nonzero integer value. The
 * program should use a loop to get the sum of all the integers from 1 up to the
 * number entered. For example, if the user enters 50, the loop will find the
 * sum of 1, 2, 3, 4, . . . 50.
 * 
 * @author Nikolay Stoyanov
 *  Oct 7, 2022
 */

public class SumOfNumbers
{
	/**
	 * 
	 * 
	 * 
	 * Main method prompts for input, calculates and displays results
	 * 
	 * @param ignored
	 */

	public static void main(String[] args)
	{

		// Get user input for number the calculation will go up to and convert to int
		String InputNumber = JOptionPane.showInputDialog(" I will calculate the sum of all integers from 1 up to: ");
		Integer selectedNumber = Integer.parseInt(InputNumber);

		// Initiate sum variable
		Integer sum = 0;

		// validate input is greater than 0
		while (selectedNumber <= 0)
		{

			InputNumber = JOptionPane.showInputDialog(" Please enter a positive non zero number: ");
			selectedNumber = Integer.parseInt(InputNumber);
		}

		// for loop to loop through and add each number to sum
		for (int count = 0; count <= selectedNumber; count++)
		{

			sum += count;
		}

		// Display results
		JOptionPane.showMessageDialog(null,
				"The sum of all the numbers from 1 up to " + selectedNumber + " is: " + sum);

	}// close main

}// close class

/**
 * This program compares names and displays the in ascending order
 * 
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 
 * 3.7 Sorted Names
 * 
 * Write HotDogFullyLoaded program that asks the user to enter three names, and then displays the names sorted in
 * ascending order. For example, if the user entered “Charlie”, “Leslie”, and “Andy”, the program would display: Andy,
 * Charlie, Leslie
 * 
 * @author Nikolay Stoyanov date 10/02/2022
 *
 */

public class SortedNames
{
	/**
	 * Default constructor
	 */
	public SortedNames()
	{
		super();
	}

	/**
	 * SquareTest methon takes three inputs then compares them and displays in alphabetical order
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{
		// Prompt user for input of three names
		String firstName = JOptionPane.showInputDialog("Enter name 1:");
		String secondName = JOptionPane.showInputDialog("Enter name 2:");
		String thirdName = JOptionPane.showInputDialog("Enter name 3:");

		// if else statement to sort and display names in alphabetical order using the ASCII system to compare

		if (firstName.compareTo(secondName) <= 0 && firstName.compareTo(thirdName) <= 0)
		{
			if (secondName.compareTo(thirdName) <= 0)
			{
				JOptionPane.showMessageDialog(null, firstName + '\n' + secondName + '\n' + thirdName);
			} else
			{
				JOptionPane.showMessageDialog(null, firstName + '\n' + thirdName + '\n' + secondName);
			}
		}

		else if (secondName.compareTo(firstName) <= 0 && secondName.compareTo(thirdName) <= 0)
		{
			if (firstName.compareTo(secondName) <= 0)
			{
				JOptionPane.showMessageDialog(null, secondName + '\n' + firstName + '\n' + thirdName);
			} else
			{
				JOptionPane.showMessageDialog(null, secondName + '\n' + thirdName + '\n' + firstName);
			}
		} else if (thirdName.compareTo(firstName) <= 0 && thirdName.compareTo(secondName) <= 0)
		{
			if (secondName.compareTo(firstName) <= 0)
			{
				JOptionPane.showMessageDialog(null, thirdName + '\n' + secondName + '\n' + firstName);
			} else
			{
				JOptionPane.showMessageDialog(null, thirdName + '\n' + firstName + '\n' + secondName);
			}
		}
	}// close main

}// close class

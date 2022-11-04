/**
 * Program to calculate and display retail price after markup
 * 
 */
package chapter5;

import javax.swing.JOptionPane;

/**
 * 4.2 Retail Price Calculator
 * 
 * Write a program that asks the user to enter an item’s wholesale cost and its
 * markup percentage. It should then display the item’s retail price. For
 * example: If an item’s wholesale cost is 5.00 and its markup percentage is 100
 * percent, then the item’s retail price is 10.00. If an item’s wholesale cost
 * is 5.00 and its markup percentage is 50 percent, then the item’s retail price
 * is 7.50. The program should have a method named calculateRetail that receives
 * the wholesale cost and the markup percentage as arguments, and returns the
 * retail price of the item.
 * 
 * 
 * @author Nikolay Stoyanov Oct 25, 2022
 */
public class RetailPriceCalculator
{

	/**
	 * Main method declares variables and calls methods
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		// While loop to restart program
		boolean runAgain = true;
		while (runAgain)
		{

			// Declare and initiate variables
			Double wholesalePrice = 0.0;
			Double markup = 0.0;
			Double retailPrice = 0.0;

			// Get wholesale proice
			wholesalePrice = getWholesalePrice();
			
			// Get markup and validate that input is not a negative number
			markup = getMarkup();
			
			// Calculate the retain price
			retailPrice = calculateRetail(wholesalePrice, markup);
			
			// Display the results
			displayResults(retailPrice);
			
			// Check if user wants to restart program
			runAgain = runAgain();
		}
	}

	/**
	 * Prompt user to enter wholesale price
	 * 
	 * @return User price input
	 */
	public static double getWholesalePrice()
	{
		String inputNumber = JOptionPane.showInputDialog("Enter the wholesale price: ");
		Double number = Double.parseDouble(inputNumber);
		return number;
	}
	
	

	/**
	 * Prompt user to enter markup and validate it's not a negative number
	 * 
	 * @return validated markup amount
	 */
	public static double getMarkup()
	{
		String inputNumber = JOptionPane.showInputDialog("Enter markup percentage ");
		Double number = Double.parseDouble(inputNumber);
		while (number < 0)
		{
			inputNumber = JOptionPane.showInputDialog("Enter a value greater than 0");
			number = Double.parseDouble(inputNumber);
		}
		return number;
	}

	/**
	 * Calculate the retail price
	 * 
	 * @param wholesalePrice user wholesale price input
	 * @param markup user markup input
	 * @return retail price
	 */
	public static double calculateRetail(Double wholesalePrice, Double markup)
	{
		Double price = wholesalePrice + (wholesalePrice * (markup / 100));
		return price;
	}

	/**
	 * Display formatted results in a window
	 * 
	 * @param retailPrice retail price of item
	 */
	public static void displayResults(Double retailPrice)
	{
		JOptionPane.showMessageDialog(null, String.format("The retail price is $%.2f", retailPrice));
	}

	/**
	 *  Ask user if they would like to run the program again. If no then display
	 *  goodbye message.
	 *  
	 * @return booleam to stop or continue program
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

}

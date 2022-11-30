package chapter2;

import javax.swing.JOptionPane;

/**
 * 
 * This program calculates the total of HotDogFullyLoaded restaurants bill after prompting the user to enter the charge
 * for the meal, calculating tax, tip, grand total and then displays the results.
 * 
 * @author Nikolay Stoyanov 2.13 Restaurant Bill 9/18/2022
 *
 */

public class RestaurantBill
{

	/**
	 * Defaults constructor
	 */
	public RestaurantBill()
	{
		super();
	}

	/**
	 * Main method executes program
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{

		// Get meal charge
		String InputString = JOptionPane.showInputDialog("Enter meal charge: ");

		// Convert input to double
		double billWithoutTax = Double.parseDouble(InputString);

		// Declare tax percentage
		double taxPercentage = 0.0675;

		// Calculate tax
		double tax = billWithoutTax * taxPercentage;

		// Calculate bill with tax
		double billWithTax = billWithoutTax + tax;

		// Declare tip percentage
		double tipPercentage = 0.2;

		// Calculate tip
		double tip = billWithTax * tipPercentage;

		// Calculate total bill
		double finalBill = billWithTax + tip;

		// Display result in HotDogFullyLoaded window
		JOptionPane.showMessageDialog(null, "Meal charge: $" + billWithoutTax + '\n' + "Tax amount: $" + tax + '\n'
				+ "Tip amount: $" + tip + '\n' + "Total bill: $" + finalBill);

	} // End main
} // End class

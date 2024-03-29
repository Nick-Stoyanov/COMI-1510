
package chapter2;

import javax.swing.JOptionPane;

/**
 * This program takes a purchase amount then calculates and displays state tax, county tax, total tax and total purchase
 * amount.
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.7 Sales Tax
 * @due: 9/18/2022
 *
 * 
 */

public class SalesTax_2_7
{
    /**
     * 
     * Main method prompts user for input, assigns variables, calculates and displays taxes
     */
    public static void main(String[] args)
    {

	// Get purchase amount
	String InputString = JOptionPane.showInputDialog("Enter the amount of your purchase: $");

	// Convert input to double
	double purchaseAmount = Double.parseDouble(InputString);

	// Declare state tax percentage
	double stateTaxPercentage = 0.04;

	// Declare county tax percentage
	double countyTaxPercentage = 0.02;

	// Calculate county tax
	double countyTaxTotal = purchaseAmount * countyTaxPercentage;

	// Calculate state tax
	double stateTaxTotal = purchaseAmount * stateTaxPercentage;

	// Calculate total tax
	double taxTotal = countyTaxTotal + stateTaxTotal;

	// calculate sale total
	double saleTotal = taxTotal + purchaseAmount;

	// Display result in a window
	JOptionPane.showMessageDialog(null,
		"Amount of purchase: $" + purchaseAmount + '\n' + "State Tax: $" + stateTaxTotal + '\n'
			+ "County Tax: $" + countyTaxTotal + '\n' + "Total Tax: $" + taxTotal + '\n' +
			"Sale Total: $" + saleTotal);
    } // End main

} // End class

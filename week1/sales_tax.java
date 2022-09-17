/**
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.7 Sales Tax
 * @due: 9/18/2022 
 * This program takes a purchase amount then calculates and displays
 * state tax, county tax, total tax and total purchase amount.
 *
 */
package week1;
import javax.swing.JOptionPane;


public class sales_tax {
	/**
	 * 
	 * Main method prompts user for input, assigns variables, calculates and displays taxes
	 */
	public static void main(String[] args) {
		
		// Get purchase amount
		String InputString = JOptionPane.showInputDialog("Enter the amount of your purchase: ");
		
		// Convert input to double 
		double purchaseAmount = Double.parseDouble(InputString);
		
		// Declare and calculate taxes
		double stateTaxPercentage = 0.04;
		
		double countyTaxPercentage = 0.02;
		
		double countyTaxTotal = purchaseAmount * countyTaxPercentage;
		
		double stateTaxTotal = purchaseAmount * stateTaxPercentage; 
		
		double taxTotal = countyTaxTotal + stateTaxTotal;
		
		double saleTotal = taxTotal + purchaseAmount;
		
		// Display result in a window
		JOptionPane.showMessageDialog(null, "Amount of purchase: $" + purchaseAmount + '\n' +
											"State Tax: $" + stateTaxTotal + '\n' +
											"County Tax: $" + countyTaxTotal + '\n' +
											"Total Tax: $" + taxTotal + '\n' +
											"Sale Total: $" + saleTotal);
	}

}

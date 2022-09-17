/**
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.13 Restaurant Bill
 * @due: 9/18/2022 
 * This program calculates the total of a restaurants bill after prompting the user to enter the charge for the meal,
 * calculating tax, tip, grand total and then displays the results.
 *
 */

package week1;
import javax.swing.JOptionPane;

public class restaurant_bill {
	 /**
	  * Main method prompts user to enter meal charge and calculates and displays tax and tip
	  * 
	  */
	public static void main(String[] args) {
		
		// Get meal charge
		String InputString = JOptionPane.showInputDialog("Enter meal charge: ");
		
		// Convert input to double 
		double billWithoutTax= Double.parseDouble(InputString);
		
		// Declare and calculate tax
		double taxPercentage = 0.0675;
		
		double tax = billWithoutTax * taxPercentage;
		
		double billWithTax = billWithoutTax + tax;
		
		
		// Declare and calculate tip
		double tipPercentage = 0.2;
		
		double tip = billWithTax * tipPercentage;
		
		// Calculate total bill
		double finalBill = billWithTax + tip;
		
		
		// Display result in a window
		JOptionPane.showMessageDialog(null, "Meal charge: $" + billWithoutTax + '\n' +
											"Tax amount: $" + tax + '\n' + 
											"Tip amount: $" + tip + '\n' +
											"Total bill: $" + finalBill);
	}
}

/**
 * Program calculates users monthly bill
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.13 Mobile Service Provider
 * 
 * A mobile phone service provider has three different subscription packages for its customers: Package A: For $39.99
 * per month, 450 minutes are provided. Additional minutes are $0.45 per minute. Package B: For $59.99 per month, 900
 * minutes are provided. Additional minutes are $0.40 per minute. Package C: For $69.99 per month, unlimited minutes are
 * provided. Write a program that calculates a customer’s monthly bill. It should ask the user to enter the letter of
 * the package the customer has purchased (A, B, or C) and the number of minutes that were used. The program should
 * display the total charges.
 * 
 * 
 * 
 * @author Nikolay Stoyanov
 * date 10/02/2022
 */

public class MobileServiceProvider
{

    /**
     * Main method to calculate and display bill
     * 
     * @param args ignored
     */
    public static void main(String[] args)
    {
	// Declare and initiate variables
	double packageARate = 39.99;
	double packageBRate = 59.99;
	double packageCRate = 69.99;

	double packageAMinutesProvided = 450;
	double packageBMinutesProvided = 900;

	double packageACostPerAdditionalMinute = 0.45;
	double packageBCostPerAdditionalMinute = 0.4;

	double additionalMinutesUsedCost = 0;
	double monthlyBill = 0;

	// Prompt user to input which subscription they have
	String subscription = JOptionPane.showInputDialog("Enter your subscription (A, B or C): ");

	// Prompt user to enter distance and convert it to a double
	String inputMinutesUsed = JOptionPane.showInputDialog("Enter minutes used: ");
	Double minutesUsed = Double.parseDouble(inputMinutesUsed);

	// if else loop to determine and calculate bill
	if (subscription.equals("A") || subscription.equals("a"))
	{
	    if (minutesUsed > packageAMinutesProvided)
	    {
		additionalMinutesUsedCost = (minutesUsed - packageAMinutesProvided) * packageACostPerAdditionalMinute;

	    }
	    monthlyBill = packageARate + additionalMinutesUsedCost;

	} else if (subscription.equals("B") || subscription.equals("b"))
	{
	    if (minutesUsed > packageBMinutesProvided)
	    {
		additionalMinutesUsedCost = (minutesUsed - packageBMinutesProvided) * packageBCostPerAdditionalMinute;

	    }
	    monthlyBill = packageBRate + additionalMinutesUsedCost;

	} else if (subscription.equals("C") || subscription.equals("c"))
	{
	    monthlyBill = packageCRate;
	}
	// Default if user enters invalid value
	else
	{
	    JOptionPane.showMessageDialog(null, "Invalid input");
	}

	// Display results
	JOptionPane.showMessageDialog(null, String.format("Your monthly bill is $%,.2f", monthlyBill));
    
    }// Close main

}// Close class

/**
 * Program to calculate how much/if any/ money a customer will save
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.14 Mobile Service Provider, Part 2
 * 
 * Modify the program you wrote for Programming Challenge 13 so it also calculates and displays the amount of money
 * Package A customers would save if they purchased Package B or C, and the amount of money Package B customers would
 * save if they purchased Package C. If there would be no savings, no message should be printed.
 * 
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 */

public class MobileServierProviderPart2
{

    /**
     * Main method to calculate and display savings
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
	double wouldHaveSaved = 0;

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

	// If loop to calculate and display if and how much user would have 
	// saved if they purchased a different package
	
	if ((subscription.equals("A") || subscription.equals("a")) & monthlyBill > packageBRate)
	{
	    wouldHaveSaved = monthlyBill - packageBRate;
	    JOptionPane.showMessageDialog(null,
		    String.format("You would have saved $%,.2f if you purchased package B.", wouldHaveSaved));

	}
	if ((subscription.equals("B") || subscription.equals("b")) & monthlyBill > packageCRate)
	{
	    wouldHaveSaved = monthlyBill - packageCRate;
	    JOptionPane.showMessageDialog(null,
		    String.format("You would have saved $%,.2f if you purchased package C.", wouldHaveSaved));

	}
    }// close main

}// close class

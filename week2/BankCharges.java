/**
 * Program to calculate and display Bank Charges
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.15 Bank Charges
 * 
 * 
 * A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account: $.10
 * each for less than 20 checks $.08 each for 20–39 checks $.06 each for 40–59 checks $.04 each for 60 or more checks
 * Write a program that asks for the number of checks written for the month. The program should then calculate and
 * display the bank’s service fees for the month.
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 * 
 */

public class BankCharges
{

    /**
     * Main method takes input from user then calculates and displays results
     * 
     * @param args ignored
     */
    public static void main(String[] args)
    {
	// Declare variables
	final double baseFee = 10;
	double feePerCheck = 0;
	double checkFeeTotal = 0;
	double monthlyServiceFee = 0;

	// Get input and convert it to an integer
	String inputNumberOfChecks = JOptionPane.showInputDialog("Number of checks: ");
	Integer numberOfChecks = Integer.parseInt(inputNumberOfChecks);

	// If else loop to determine fee per check
	if (numberOfChecks < 20)
	{
	    feePerCheck = 0.1;
	} else if (numberOfChecks >= 20 && numberOfChecks < 40)
	{
	    feePerCheck = 0.08;
	} else if (numberOfChecks >= 40 && numberOfChecks < 60)
	{
	    feePerCheck = 0.06;
	} else
	{
	    feePerCheck = 0.04;
	}

	// Calculate and display results
	
	checkFeeTotal = feePerCheck * numberOfChecks;
	monthlyServiceFee = checkFeeTotal + baseFee;
	JOptionPane.showMessageDialog(null, String.format("Your monthly service fee is: $%,.2f", monthlyServiceFee));

    }// Close main

}// Close class

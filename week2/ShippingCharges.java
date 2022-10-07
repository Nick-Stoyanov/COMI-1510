/**
 * Program to display shipping charges
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.9 Shipping Charges
 * 
 * The Fast Freight Shipping Company charges the following rates: Weight of Package Rate per 500 Miles Shipped 2 pounds
 * or less $1.10 Over 2 pounds but not more than 6 pounds $2.20 Over 6 pounds but not more than 10 pounds $3.70 Over 10
 * pounds $3.80 The shipping charges per 500 miles are not prorated. For example, if a 2-pound package is shipped 550
 * miles, the charges would be $2.20. Write a program that asks the user to enter the weight of a package and then
 * displays the shipping charges.
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 *
 */

public class ShippingCharges
{

    /**
     *  Main method takes input for weight and determines and displays shipping rate
     * @args ignored
     */
    public static void main(String[] args)
    {

	// prompt user to input weight and convert input to double
	String weightInput = JOptionPane.showInputDialog("Enter package weight in lbs: ");
	Double packageWeight = Double.parseDouble(weightInput);

	String distanceInput = JOptionPane.showInputDialog("Enter distance to ship: ");
	Double distance = Double.parseDouble(distanceInput);

	double ratePer500Miles = 0;
	double shippingCost = 0;

	// if else statements to decetrime shipping rate
	if (packageWeight <= 2)
	{
	    ratePer500Miles = 1.1;

	} else if (packageWeight <= 6)
	{
	    ratePer500Miles = 2.2;

	} else if (packageWeight <= 10)
	{
	    ratePer500Miles = 3.7;

	} else
	{
	    ratePer500Miles = 3.8;
	}
	
	// while loop to count how many times the rate applies since its not prorated
	while (distance > 0)
	{
	    shippingCost += ratePer500Miles;
	    distance -= 500;
	}
	
	// Display formatted results in a window
	JOptionPane.showMessageDialog(null,
		String.format("Shipping a %.1f lbs package costs $%.2f per 500 miles.\nThe total is: $%.2f",
			packageWeight, ratePer500Miles, shippingCost));
    }// close main

}// close class

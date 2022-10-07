/**
 *  Program to calculate BMI and display results
 */

package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.3 Body Mass Index
 * 
 * Write a program that calculates and displays a person’s body mass index (BMI). The BMI is often used to determine
 * whether a person is overweight or underweight for his or her height. A person’s BMI is calculated with the following
 * formula:( B M I = W e i g h t × 703 / H e i g h t ^ 2 ) where weight is measured in pounds and height is measured in
 * inches. The program should display a message indicating whether the person has optimal weight, is underweight, or is
 * overweight. A sedentary person’s weight is considered optimal if his or her BMI is between 18.5 and 25. If the BMI is
 * less than 18.5, the person is considered underweight. If the BMI value is greater than 25, the person is considered
 * overweight.
 * 
 * 
 * @author Nikolay Stoyanov
 *  date 10/02/2022
 */

public class BodyMassIndex
{
    /**
     * 
     * Main method prompts user for input then calculates and displays results
     */

    public static void main(String[] args)
    {
	// Get input for weight and convert it to a double
	String InputWeight = JOptionPane.showInputDialog("Enter weight in pounds: ");
	double weight = Double.parseDouble(InputWeight);

	// Get input for height and convert it to a double
	String InputHeight = JOptionPane.showInputDialog("Enter height in inches: ");
	double height = Double.parseDouble(InputHeight);

	// Declare and calculate BMI
	double BMI = weight * (703 / (height * height));

	// Declare new string to tell the user if they are over, under or optimal weight
	StringBuilder BMIResult = new StringBuilder();

	// Start if statement to append result to BMIResult
	if (BMI < 18.5)
	{
	    BMIResult.append("are underweight.");

	} else if (BMI > 25)
	{
	    BMIResult.append("are overweight.");
	} else
	{
	    BMIResult.append("have optimal BMI.");
	}

	// Display formatted result
	JOptionPane.showMessageDialog(null, String.format("Your BMI is: %.1f", BMI) + '\n' + "You " + BMIResult);

    }// close main

}// close class

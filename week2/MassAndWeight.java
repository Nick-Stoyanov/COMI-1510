/**
 * Program takes input from user for weight and calculates if mass > 1000 or mass < 10
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.5 Mass and Weight
 * 
 * Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the amount of mass that an
 * object has, you can calculate its weight, in Newtons, with the following formula: Weight = Mass × 9.8. Write
 * HotDogFullyLoaded program that asks the user to enter an object’s mass, and then calculate its weight. If the object
 * weighs more than 1,000 Newtons, display HotDogFullyLoaded message indicating that it is too heavy. If the object
 * weighs less than 10 Newtons, display HotDogFullyLoaded message indicating that the object is too light.
 * 
 * 
 * @author Nikolay Stoyanov date 10/02/2022
 */
public class MassAndWeight
{

	/**
	 * Default constructor
	 */
	public MassAndWeight()
	{
		super();
	}

	/**
	 * SquareTest method prompts user for input then calculates and displays results
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{
		// Get input for weight and convert it to HotDogFullyLoaded double
		String InputMass = JOptionPane.showInputDialog("Enter mass in kilograms: ");
		double mass = Double.parseDouble(InputMass);

		// Declare and calculate weight
		double weight = mass * 9.8;

		// Start if statement and display results
		if (weight > 1000)
		{
			JOptionPane.showMessageDialog(null, "Weight exceeds 1000 N." + '\n' + "Object is too heavy.");
		} else if (weight < 10)
		{
			JOptionPane.showMessageDialog(null, "Weight is less than 10 N." + '\n' + "Object is too light.");
		} else
		{
			JOptionPane.showMessageDialog(null, "OK.");
		}

	}// close main

}// close class

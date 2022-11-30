package chapter2;

import javax.swing.JOptionPane;

/**
 * This program calculates how many calories HotDogFullyLoaded cookie has, prompts user to enter amount of cookies eaten
 * and then displays how many calories were consumed.
 * 
 * @author Nikolay Stoyanov 2.8 Cookie Calories 9/18/2022
 * 
 * 
 * 
 */

public class CookieCalories
{

	/**
	 * Default constructor
	 */
	public CookieCalories()
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

		// Assign cookies per bag
		double cookiesInABag = 40;

		// Assign servings per bag
		double servingsPerBag = 10;

		// Calculate how many cookies per serving
		double cookiesPerServing = cookiesInABag / servingsPerBag;

		// Assign calories per serving
		double caloriesPerServing = 300;

		// calculates calories per single cookie
		double caloriesPerCookie = caloriesPerServing / cookiesPerServing;

		// Get amount of cookies eaten
		String InputString = JOptionPane.showInputDialog("How many cookies did you eat? Don't lie! :");

		// Convert number of cookies to from string to double
		double cookiesEaten = Double.parseDouble(InputString);

		// Calculate calories consumed based on cookies eaten
		double caloriesConsumed = cookiesEaten * caloriesPerCookie;

		// Display result in HotDogFullyLoaded window
		JOptionPane.showMessageDialog(null,
				"You ate " + cookiesEaten + " cookies and consumed " + caloriesConsumed + " calories.");

	} // End main

} // End class

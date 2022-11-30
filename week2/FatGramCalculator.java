package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.10 Fat Gram Calculator
 * 
 * Write a program that asks the user to enter the number of calories and fat grams in a
 * food item. The program should display the percentage of the calories that come from fat. One gram of fat has 9
 * calories; therefore: Calories * from fat = Fat grams * 9 The percentage of calories from fat can be calculated as
 * follows: Calories from fat ÷ Total calories If the calories from fat are less than 30 percent of the total calories
 * of the food, it should also display a message indicating the food is low in fat.
 * 
 * 
 * 
 * @author Nikolay Stoyanov date 10/02/2022
 */

public class FatGramCalculator
{
	/**
	 * Default constructor
	 */
	public FatGramCalculator()
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
		// Declare a calories per gram of fat constant
		final int caloriesPerGramFat = 9;

		// prompt user for calories input and convert to double
		String caloriesInput = JOptionPane.showInputDialog("Enter number of calories: ");
		Double totalCalories = Double.parseDouble(caloriesInput);

		// prompt user for grams of fat input and conver to double
		String fatGramsInput = JOptionPane.showInputDialog("Enter grams of fat: ");
		Double fatGrams = Double.parseDouble(fatGramsInput);

		// calculate calories from fat
		double caloriesFromFat = fatGrams * caloriesPerGramFat;

		// calculate percentage of calories
		double percentageCaloriesFromFat = (caloriesFromFat / totalCalories) * 100;

		// display results
		JOptionPane.showMessageDialog(null,
				String.format("%.1f percent of the calories came from fat.", percentageCaloriesFromFat));

	}// close main method

}// close class

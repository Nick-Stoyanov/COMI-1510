/**
3 * Program to calculate and display average rainfall
 */

package chapter4;

import javax.swing.JOptionPane;

/**
 * 4.8 Average Rainfall
 * 
 * Write a program that uses nested loops to collect data and calculate the
 * average rainfall over a period of years. First the program should ask for the
 * number of years. The outer loop will iterate once for each year. The inner
 * loop will iterate 12 times, once for each month. Each iteration of the inner
 * loop will ask the user for the inches of rainfall for that month. After all
 * iterations, the program should display the number of months, the total inches
 * of rainfall, and the average rainfall per month for the entire period. Input
 * Validation: Do not accept a number less than 1 for the number of years. Do
 * not accept negative numbers for the monthly rainfall.
 * 
 * 
 * @author Nikolay Stoyanov Oct 12, 2022
 */

public class AverageRainfall
{
	/**
	 * Main method collects input and display results
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{
		// Get years input and validate it
		String InputYears = JOptionPane.showInputDialog("Enter years: ");
		Integer years = Integer.parseInt(InputYears);

		while (years < 1)
		{
			InputYears = JOptionPane.showInputDialog("Enter a value greater than 1: ");
			years = Integer.parseInt(InputYears);
		}

		// Declare variables
		final Integer monthsPerYear = 12;
		Integer months = years * monthsPerYear;
		Double rainfallTotal = 0.0;
		Double rainfallPerMonth = 0.0;

		// Nested for loops to loop over months and years and collect rainfall per month
		// data the nadd to total
		for (int i = 1; i <= years; i++)
		{
			for (int j = 1; j <= 12; j++)
			{
				// Get input for each month and validate it
				String InputRainfall = JOptionPane
						.showInputDialog("Enter mm rainfall for" + " year " + i + " month " + j);
				Double rainfall = Double.parseDouble(InputRainfall);

				while (rainfall < 0)
				{
					InputRainfall = JOptionPane.showInputDialog("Invalid input. Please enter a positive number: ");
					rainfall = Double.parseDouble(InputRainfall);
				}

				rainfallTotal += rainfall;
			}
		}

		// Calculate average rainfall
		rainfallPerMonth = rainfallTotal / months;

		// Display results
		JOptionPane.showMessageDialog(null, String.format("Average rainfall: %.2f mm/month", rainfallPerMonth));

	}// Close main

}// Close class

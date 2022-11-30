/**
 * 3 * Program to calculate and display average rainfall
 */

package chapter5;

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

public class AverageRainfallRefactored
{

	/**
	 * Default constructor
	 */
	public AverageRainfallRefactored()
	{
		super();
	}

	/**
	 * SquareTest method collects input and display results
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{
		// While loop to restart the program
		Boolean runAgain = true;
		while (runAgain)
		{
			// Set constant for program
			final Integer monthsPerYear = 12;

			// Declare variables
			Double rainfallTotal = 0.0;
			Double rainfallPerMonth = 0.0;
			Integer years = 0;

			// Get years input and validate it
			years = getYears();

			// ccalculate total rainfall
			rainfallTotal = getRainfall(years, monthsPerYear);

			// Calculate average rainfall
			rainfallPerMonth = calculateAverage(years, rainfallTotal, monthsPerYear);

			// Display results
			displayResults(rainfallPerMonth, years, monthsPerYear, rainfallTotal);

			// Check if user wants to restart program
			runAgain = runAgain();
		}

	}

	/**
	 * Get and validate input for years
	 * 
	 * @return years
	 */
	public static Integer getYears()
	{
		String InputYears = JOptionPane.showInputDialog("Enter years: ");
		Integer years = Integer.parseInt(InputYears);

		while (years < 1)
		{
			InputYears = JOptionPane.showInputDialog("Enter a value greater than 1: ");
			years = Integer.parseInt(InputYears);
		}
		return years;
	}

	/**
	 *
	 * Loop to gather total rainfall based on user input for years
	 * 
	 * 
	 * @param years         user years input
	 * @param monthsPerYear months per years
	 * 
	 * @return total rainfall
	 */
	public static Double getRainfall(Integer years, Integer monthsPerYear)
	{
		Double total = 0.0;
		for (int i = 1; i <= years; i++)
		{
			for (int j = 1; j <= monthsPerYear; j++)
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

				// Keep a running total
				total += rainfall;
			}
		}
		return total;
	}

	/**
	 * Calculate average rainfall
	 * 
	 * @param years         number of years
	 * @param rainfallTotal total rainfall
	 * @param monthsPerYear months per year
	 * 
	 * @return average rainfall
	 */
	public static Double calculateAverage(Integer years, Double rainfallTotal, Integer monthsPerYear)
	{
		Integer months = years * monthsPerYear;
		Double average = rainfallTotal / months;
		return average;
	}

	/**
	 * Display results
	 * 
	 * @param rainfallPerMonth average rainfall
	 * @param years            years input
	 * @param monthsPerYear    months per year
	 * @param rainfallTotal    total rainfall
	 */
	public static void displayResults(Double rainfallPerMonth, Integer years, Integer monthsPerYear,
			Double rainfallTotal)
	{
		Integer totalMonths = years * monthsPerYear;
		JOptionPane.showMessageDialog(null,
				String.format("Total months: %d\nTotal rainfall: %.2f mm\nAverage rainfall: %.2f mm/month", totalMonths,
						rainfallTotal, rainfallPerMonth));
	}

	/**
	 * Ask user if they would like to run the program again. If no then display a
	 * goodbye message.
	 * 
	 * @return boolean to stop or continue the program
	 */
	public static Boolean runAgain()
	{
		Boolean run = true;
		int n = JOptionPane.showConfirmDialog(null, "Do you want to use the program again?", " Select an option",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.NO_OPTION)
		{
			run = false;
			JOptionPane.showMessageDialog(null, "Thanks for using the program!\nBye bye.");
		}
		return run;
	}
}
// Close class

/**
 * Program calculates and appends distance traveled to file distanceFile.txt
 */
package chapter4;

import javax.swing.JOptionPane;
import java.io.*;

/**
 * 4.3 Distance File
 * 
 * Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it writes the report to a file
 * instead of the screen. Open the file in Notepad or another text editor to confirm the output. The distance a vehicle
 * travels can be calculated as follows: D i s t a n c e = S p e e d * T i m e For example, if a train travels 40
 * miles-per-hour for three hours, the distance traveled is 120 miles. Write a program that asks for the speed of a
 * vehicle (in miles-per-hour) and the number of hours it has traveled. It should use a loop to display the distance a
 * vehicle has traveled for each hour of a time period specified by the user. For example, if a vehicle is traveling at
 * 40 mph for a three-hour time period, it should display a report similar to the one that follows: Hour Distance
 * Traveled 1 40 2 80 3 120 Input Validation: Do not accept a negative number for speed and do not accept any value less
 * than 1 for time traveled.
 * 
 * @author Nikolay Stoyanov Oct 9, 2022
 */

public class DistanceFile
{

	/**
	 * Main method gets input, validates it and appends results of calculation to a file
	 * 
	 * 
	 *
	 * @param args ignored
	 * 
	 * @throws IOException exeption if file not found
	 */
	public static void main(String[] args) throws IOException
	{
		// Declare and initiate valiables
		Integer speed = 0;
		Integer time = 0;

		// Prompt user for input and validate it
		String InputSpeed = JOptionPane.showInputDialog("Enter speed: ");
		speed = Integer.parseInt(InputSpeed);

		while (speed <= 0)
		{
			InputSpeed = JOptionPane.showInputDialog("Please enter a non-negative value for speed: ");
			speed = Integer.parseInt(InputSpeed);
		}

		// Prompt user for input and validate it
		String InputTime = JOptionPane.showInputDialog("Enter travel time: ");
		time = Integer.parseInt(InputTime);

		while (time <= 0)
		{
			InputTime = JOptionPane.showInputDialog("Enter a time value greater than 0: ");
			time = Integer.parseInt(InputTime);
		}

		// Create a file to hold results
		PrintWriter outputFile = new PrintWriter("distanceFile.txt");

		// Format and make it look nice nice
		outputFile.println("Hours" + "\t" + "Distance Traveled");
		outputFile.println("-------------------------");

		// For loop to write results to file
		for (int i = 1; i <= time; i++)
		{
			outputFile.println(i + "\t\t" + speed * i);

		}
		// Close file
		outputFile.close();
	}// Close main

	/**
	 * Default constructor
	 */
	public DistanceFile()
	{
		super();
	}

}// Close class

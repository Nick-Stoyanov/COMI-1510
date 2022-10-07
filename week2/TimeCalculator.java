/**
 *  Program takes input from user for seconds then displays how many minutes, hours, days are in that many seconds
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 
 * 3.6 Time Calculator
 * 
 * Write a program that asks the user to enter a number of seconds. The Time Calculator Problem There are 60 seconds in
 * a minute. If the number of seconds entered by the user is greater than or equal to 60, the program should display the
 * number of minutes in that many seconds. There are 3,600 seconds in an hour. If the number of seconds entered by the
 * user is greater than or equal to 3,600, the program should display the number of hours in that many seconds. There
 * are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400, the
 * program should display the number of days in that many seconds.
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 */

public class TimeCalculator
{

    /**
     * 
     * Main method prompts to input seconds then calculates and displays results
     * 
     */

    public static void main(String[] args)
    {

	// Declare constant values
	final int secondsPerMinute = 60;
	final int secondsPerHour = 3600;
	final int secondsPerDay = 86400;

	// Get input for number of seconds and convert it to an integer
	String InputSeconds = JOptionPane.showInputDialog("Enter number of seconds: ");
	int seconds = Integer.parseInt(InputSeconds);

	// Calculate and display minutes
	if (seconds >= secondsPerMinute)
	{
	    double minutes = seconds / secondsPerMinute;
	    JOptionPane.showMessageDialog(null,
		    String.format("There are %.0f minutes ", minutes) + String.format("in %d seconds.", seconds));

	}

	// Calculate and display hours
	if (seconds >= secondsPerHour)
	{
	    double hours = seconds / secondsPerHour;
	    JOptionPane.showMessageDialog(null,
		    String.format("There are %.0f hours ", hours) + String.format("in %d seconds.", seconds));

	}

	// Calculate and display days
	if (seconds >= secondsPerDay)
	{

	    double days = seconds / secondsPerDay;

	    // if-else look to correctly display result if day is 1
	    if (days < 2)
	    {
		JOptionPane.showMessageDialog(null,
			String.format("There is %.0f day ", days) + String.format("in %d seconds.", seconds));
	    } else
	    {
		JOptionPane.showMessageDialog(null,
			String.format("There are %.0f days ", days) + String.format("in %d seconds.", seconds));
	    }
	}

	// Default else statement if seconds are less than 60
	else
	{
	    JOptionPane.showMessageDialog(null, "There are 0 minutes in " + seconds + " seconds.");
	}
    }// close main

}// close class

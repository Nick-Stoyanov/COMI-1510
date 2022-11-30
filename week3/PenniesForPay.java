/**
 * Program calculates and displays earnings
 */

package chapter4;

import javax.swing.JOptionPane;

/**
 * 4.4 Pennies for Pay
 * 
 * Write a program that calculates the amount a person would earn over a
 * period of time if his or her salary is one penny the first day, two pennies the second day, and continues to double
 * each day. The program should display a table showing the salary for each day, and then show the total
 * pay at the end of the period. The output should be displayed in a dollar amount, not the number of
 * pennies.
 * 
 * @author Nikolay Stoyanov Oct 9, 2022
 *
 */

public class PenniesForPay
{

	/**
	 * Default constructor
	 */
	public PenniesForPay()
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

		Integer daysWorked = -1;
		Double totalPay = 0.0;

		String InputDays = JOptionPane.showInputDialog("Days worked: ");
		daysWorked = Integer.parseInt(InputDays);

		while (daysWorked <= 0)
		{
			InputDays = JOptionPane.showInputDialog("Enter a value greater than 0: ");
			daysWorked = Integer.parseInt(InputDays);
		}

		System.out.println("Hours" + "\t" + "Salary per Day");
		System.out.println("----------------------\n");

		for (double i = 1; i <= daysWorked; i++)
		{
			System.out.printf("%.0f \t $%.2f\n ", i, i / 100);
			totalPay += i;
		}

		System.out.printf("\nTotal pay: $%.2f", totalPay / 100);
	}

}

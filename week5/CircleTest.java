/**
 * This clas test the <code>Circle</code> class.
 */
package chapter6;

import javax.swing.JOptionPane;

/**
 * Circle test
 * 
 * This class teste the <code>Circle</code> class.
 * 
 * @author Nikolay Stoyanov Nov 8, 2022
 */
public class CircleTest
{
	/**
	 * Default constructor
	 */
	public CircleTest()
	{
		super();
	}

	/**
	 * Displays the output message to the user
	 * 
	 * @param output message to display
	 */
	private static void displayOutput(String output)
	{
		System.out.println(output);
		JOptionPane.showMessageDialog(null, output);
	}// close displayOutput

	/**
	 * This method will prompt the user to enter the radius of a circle in order to calculate diameter, area and
	 * circumference
	 *
	 * 
	 * @return the result of the calculations
	 */
	private static String createCircle()
	{
		StringBuilder sb = new StringBuilder();
		Circle circle = new Circle();

		String Input = JOptionPane.showInputDialog("Enter circle radius(>0): ");
		Double rad = Double.parseDouble(Input);

		// validate that user input is greater than 0
		while (rad <= 0)
		{
			Input = JOptionPane.showInputDialog("Invalid input.\nEnter circle radius:(>0) ");
			rad = Double.parseDouble(Input);
		}
		circle.setRadius(rad);
		sb.append(circle.toString()).append("\n\n");

		sb.append("Radius: ").append(circle.getRadius()).append("\n");
		sb.append("Area: ").append(circle.getArea()).append("\n");
		sb.append("Diameter: ").append(circle.getDiameter()).append("\n");
		sb.append("Circumference: ").append(circle.getCircumference()).append("\n");

		sb.append("\n").append("Circle, circle!");

		return sb.toString();
	}

	/**
	 * This method will control the iterations of the program. User can select to restart the program or end it. Ending
	 * program displays goodbye message.
	 * 
	 * @return result of users choice whether they want to use the program again.
	 */
	private static Boolean runAgain()
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

	/**
	 * Simple main method to test the Circle class
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		// While loop to restart the program
		Boolean runAgain = true;
		while (runAgain)
		{
			String output = null;
			output = createCircle();
			displayOutput(output);
			runAgain = runAgain();
		}
	}// close main

}// close class

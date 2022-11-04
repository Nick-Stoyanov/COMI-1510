/**
 * 
 */
package chapter5;

import javax.swing.JOptionPane;

/**
 * 5.8 Conversion program
 * 
 * Write a program that asks the user to enter a distance in meters. The program
 * will then pre-sent the following menu of selections: 1. Convert to kilometers
 * 2. Convert to inches 3. Convert to feet 4. Quit the program The program will
 * convert the distance to kilometers, inches, or feet, depending on the user’s
 * selection. Here are the specific requirements: Write a void method named
 * showKilometers, which accepts the number of meters as an argument. The method
 * should display the argument converted to kilometers. Convert the meters to
 * kilometers using the following formula: kilometers = meters * 0.001 Write a
 * void method named showInches, which accepts the number of meters as an
 * argument. The method should display the argument converted to inches. Convert
 * the meters to inches using the following formula: inches = meters * 39.37
 * Write a void method named showFeet, which accepts the number of meters as an
 * argument. The method should display the argument converted to feet. Convert
 * the meters to feet using the following formula: feet = meters * 3.281 Write a
 * void method named menu that displays the menu of selections. This method
 * should not accept any arguments. The program should continue to display the
 * menu until the user enters 4 to quit the program. The program should not
 * accept negative numbers for the distance in meters. If the user selects an
 * invalid choice from the menu, the program should display an error message.
 * Here is an example session with the program, using console input. The user’s
 * input is shown in bold.
 * 
 * @author Nikolay Stoyanov Oct 25, 2022
 */
public class ConversionProgram
{

	/**
	 * Default constructor
	 */
	public ConversionProgram()
	{
		super();
	}

	/**
	 * Main method initiates variables and calls methods
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		// while loop to restart program
		boolean runAgain = true;
		while (runAgain)
		{
			// Initiate variables
			Double meters = 0.0;
			Integer menuOption = 0;

			// dispay welcome message
			welcome();

			// Get meter input
			meters = getDistance();

			// Get menu choice
			menuOption = menu();

			// select a conversion based on user menu choice and call method
			switch (menuOption)
			{

				case 1:
					convertToKM(meters);
					runAgain = runAgain();
					break;

				case 2:
					convertToInches(meters);
					runAgain = runAgain();
					break;

				case 3:
					convertToFeet(meters);
					runAgain = runAgain();
					break;

				case 4:
					runAgain = quit();
					break;
			}

		}

	}

	/**
	 * Dispaly welcome message
	 */
	public static void welcome()
	{
		JOptionPane.showMessageDialog(null, "--->Welcome to the Conversion Program!<---\n");
	}

	/**
	 * Get input for meters and validate it
	 * 
	 * @return meters
	 */
	public static Double getDistance()
	{

		String inputMeters = JOptionPane.showInputDialog("Enter distance in meters: ");
		Double meters = Double.parseDouble(inputMeters);

		while (meters < 0)
		{
			JOptionPane.showMessageDialog(null, "Invalid input.\nEnter a positive number.");
			inputMeters = JOptionPane.showInputDialog("Enter distance in meters: ");
			meters = Double.parseDouble(inputMeters);
		}
		return meters;
	}

	/**
	 * Get menu choice and validate it
	 * 
	 * @return menu choice
	 */
	public static Integer menu()

	{

		String inputNumber = JOptionPane
				.showInputDialog("1. Convert to KM\n2. Convert to in\n3. Convert to ft\n4. Quit program.");
		Integer number = Integer.parseInt(inputNumber);
		while (number < 0 || number > 4)
		{
			JOptionPane.showMessageDialog(null, "Invalid choice. Try again.");
			inputNumber = JOptionPane
					.showInputDialog("1. Convert to KM\n2. Convert to in\n3. Convert to ft\n4. Quit program.");
			number = Integer.parseInt(inputNumber);
		}
		return number;
	}

	/**
	 * Convert meters to kilometers
	 * 
	 * @param meters user meters input
	 */
	public static void convertToKM(Double meters)
	{
		Double kilometers = meters * 0.001;
		JOptionPane.showMessageDialog(null, String.format("%.2f meters equal %.2f kilometers", meters, kilometers));
	}

	/**
	 * Convert meters to inches
	 * 
	 * @param meters user meters input
	 */
	public static void convertToInches(Double meters)
	{
		Double inches = meters * 39.37;
		JOptionPane.showMessageDialog(null, String.format("%.2f meters equal %.2f inches", meters, inches));
	}

	/**
	 * Convert meters to feet
	 * 
	 * @param meters user meters input
	 */
	public static void convertToFeet(Double meters)
	{
		Double feet = meters * 3.281;
		JOptionPane.showMessageDialog(null, String.format("%.2f meters equal %.2f feet", meters, feet));
	}

	/**
	 *  Terminate program if used selects option 4
	 * @return boolean to quit program
	 */
	public static Boolean quit()
	{
		JOptionPane.showMessageDialog(null,"Bye.");
		Boolean n = false;
		return n;
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
}// close class

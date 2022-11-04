/**
 * Program to calculate and display paint job estimate
 * 
 */
package chapter5;

import javax.swing.JOptionPane;

/**
 * 4.4 Paint Job Estimator
 * 
 * A painting company has determined that for every 115 square feet of wall
 * space, one gallon of paint and eight hours of labor will be required. The
 * company charges $18.00 per hour for labor. Write a program that allows the
 * user to enter the number of rooms to be painted and the price of the paint
 * per gallon. It should also ask for the square feet of wall space in each
 * room. The program should have methods that return the following data: The
 * number of gallons of paint required The hours of labor required The cost of
 * the paint The labor charges The total cost of the paint job Then it should
 * display the data on the screen.
 * 
 * 
 * @author Nikolay Stoyanov Oct 25, 2022
 */
public class PaintJobEstimator
{

	/**
	 * Default constructor
	 */
	public PaintJobEstimator()
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
		// While loop to restart the program
		Boolean runAgain = true;
		while (runAgain)
		{

			/**
			 * Set constants for program
			 */
			final Double laborPerHour = 18.0;
			final Double ft2PerGallon = 115.0;
			final Double hoursPer115ft2 = 8.0;

			// Initialize all vaiables
			Integer rooms = 0;
			Double paintPricePerGallon = 0.0;
			Double ft2ToBePainted = 0.0;

			Double gallonsOfPaintRequired = 0.0;
			Double hoursOfLabor = 0.0;
			Double paintTotalPrice = 0.0;
			Double laborTotal = 0.0;
			Double totalCost = 0.0;

			// Get number of rooms
			rooms = getRooms();

			// Get price per gallon paint
			paintPricePerGallon = getPaintPerGallonPrice();

			// Get ft2 to be painted
			ft2ToBePainted = getFt2ToBePainted(rooms);

			// Calculate gallons of paint needed
			gallonsOfPaintRequired = calculatePaintRequired(ft2ToBePainted, ft2PerGallon);

			// Calculate hour of labor
			hoursOfLabor = calculateHoursOfLabor(gallonsOfPaintRequired, hoursPer115ft2);

			// Calculate paint cost
			paintTotalPrice = calculatePaintCost(gallonsOfPaintRequired, paintPricePerGallon);
			laborTotal = calculateLaborCost(hoursOfLabor, laborPerHour);

			// Calculate labor cost
			totalCost = calculateTotalCost(laborTotal, paintTotalPrice);

			// Display results
			displayResults(gallonsOfPaintRequired, hoursOfLabor, paintTotalPrice, laborTotal, totalCost);

			// Check if user wants to restart program
			runAgain = runAgain();

		}

	}

	/**
	 * Prompts user to enter number or rooms
	 * 
	 * @return validated number of rooms
	 */
	public static Integer getRooms()
	{
		String inputNumber = JOptionPane.showInputDialog("How many rooms do you want to paint?");
		Integer number = Integer.parseInt(inputNumber);
		while (number <= 0)
		{
			inputNumber = JOptionPane.showInputDialog("Enter a positive number larger than 0.");
			number = Integer.parseInt(inputNumber);
		}

		return number;
	}

	/**
	 * Prompt user to enter price of paint per gallon
	 * 
	 * @return validated price of paint per gallon
	 */
	public static Double getPaintPerGallonPrice()
	{
		String inputNumber = JOptionPane.showInputDialog("What's the price of paint per gallon? ");
		Double number = Double.parseDouble(inputNumber);
		while (number <= 0)
		{
			inputNumber = JOptionPane.showInputDialog("Enter a positive number larger than 0.");
			number = Double.parseDouble(inputNumber);

		}
		return number;
	}

	/**
	 * Get ft2 to be painted
	 * 
	 * @param rooms how many times should the program iterate (once per room)
	 * 
	 * @return validated total ft2 that will be painted
	 */
	public static Double getFt2ToBePainted(Integer rooms)
	{
		Double total = 0.0;
		Integer room = 1;
		for (int i = 0; i < rooms; i++)
		{
			String inputNumber = JOptionPane.showInputDialog("Enter sq2 for room " + room);
			Double number = Double.parseDouble(inputNumber);
			while (number <= 0)
			{
				inputNumber = JOptionPane.showInputDialog("Enter a positive number larger than 0.");
				number = Double.parseDouble(inputNumber);
			}
			total += number;
			room++;
		}
		return total;
	}

	/**
	 * Calculate gallons of paint required
	 * 
	 * @param ft2ToBePainted total ft2 to be painted
	 * @param ft2PerGallon   ft2 covered by 1 gallon of paint
	 * 
	 * @return gallons of paint required
	 */
	public static Double calculatePaintRequired(Double ft2ToBePainted, Double ft2PerGallon)
	{
		Double number = (ft2ToBePainted / ft2PerGallon);

		return number;

	}

	/**
	 * Calculate the number of hours necessery for the job
	 * 
	 * @param gallonsOfPaintRequired Gallon of paint required
	 * @param hoursPer115ft2         hours it takes to paint 115ft2
	 * 
	 * @return total hours of labor
	 */
	public static Double calculateHoursOfLabor(Double gallonsOfPaintRequired, Double hoursPer115ft2)
	{

		Double number = gallonsOfPaintRequired * hoursPer115ft2;
		return number;
	}

	/**
	 * Calculate paint job total amount
	 * 
	 * @param gallonsOfPaintRequired gallons of paint required
	 * @param paintPricePerGallon    price of paint per gallon
	 * 
	 * @return price of paint required
	 */
	public static Double calculatePaintCost(Double gallonsOfPaintRequired, Double paintPricePerGallon)
	{
		Double number = gallonsOfPaintRequired * paintPricePerGallon;
		return number;
	}

	/**
	 * Calculate cost of labor
	 * 
	 * @param hoursOfLabor hour of labor required
	 * @param laborPerHour price of labor per hour
	 * 
	 * @return total cost of labor
	 */
	public static Double calculateLaborCost(Double hoursOfLabor, Double laborPerHour)
	{
		Double number = hoursOfLabor * laborPerHour;
		return number;
	}

	/**
	 * Calculate the total cost
	 * 
	 * @param laborTotal      price of labor required
	 * @param paintTotalPrice price of paint required
	 * 
	 * @return total cost for the job
	 */
	public static Double calculateTotalCost(Double laborTotal, Double paintTotalPrice)
	{
		Double number = laborTotal + paintTotalPrice;
		return number;
	}

	/**
	 * Display results in a formatted window
	 * 
	 * @param gallonsOfPaintRequired gallons of paint required
	 * @param hoursOfLabor           hours of laob required
	 * @param paintTotalPrice        price of paint required
	 * @param laborTotal             price of labo required
	 * @param totalCost              total cost for the job
	 */
	public static void displayResults(Double gallonsOfPaintRequired, Double hoursOfLabor, Double paintTotalPrice,
			Double laborTotal, Double totalCost)
	{

		JOptionPane.showMessageDialog(null, String.format(
				"Gallons of paint required: %.1f\nHours of labor required: %.2f\nTotal price of paint: $%.2f\nTotal price of labor: $%.2f\nTotal Cost: $%.2f",
				gallonsOfPaintRequired, hoursOfLabor, paintTotalPrice, laborTotal, totalCost));
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

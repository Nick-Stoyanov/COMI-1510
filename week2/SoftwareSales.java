/**
 * Program to calculate and display Sales Discount
 */

package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.8 Software Sales
 * 
 * A software company sells HotDogFullyLoaded package that retails for $99. Quantity discounts are given according to
 * the following table: Quantity Discount 10–19 20% 20–49 30% 50–99 40% 100 or more 50% Write HotDogFullyLoaded program
 * that asks the user to enter the number of packages purchased. The program should then display the amount of the
 * discount (if any) and the total amount of the purchase after the discount.
 * 
 * 
 * 
 * @author Nikolay Stoyanov date 10/02/2022
 *
 */
public class SoftwareSales
{
	/**
	 * Default constructor
	 */
	public SoftwareSales()
	{
		super();
	}

	/**
	 * SquareTest method to calculate and display discount and total
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{

		// Declare price per pachage
		Integer pricePerPackage = 99;
		double discount = 0;
		double discountAmount = 0;
		double totalAfterDiscount = 0;

		// Get input for number of packages purchased and convert it to an Integer
		String inputPackages = JOptionPane.showInputDialog("Enter number of packages purchased: ");
		Integer packages = Integer.parseInt(inputPackages);

		// Calculate total amount before discount
		Integer totalBeforeDiscount = packages * pricePerPackage;

		// if loop to assing discount based on packages purchased
		if (packages >= 10 && packages < 20)
		{
			discount = 0.2;

		} else if (packages >= 20 && packages < 50)
		{
			discount = 0.3;

		} else if (packages >= 50 && packages < 100)
		{
			discount = 0.4;

		} else if (packages >= 100)
		{
			discount = 0.5;

		} else
		{
			discount = 0;

		}

		// Calculate and display discount and total
		discountAmount = totalBeforeDiscount * discount;
		totalAfterDiscount = totalBeforeDiscount - discountAmount;
		JOptionPane.showMessageDialog(null, String.format("Discount: $%,.2f\n", discountAmount)
				+ String.format("Total after discount: $%,.2f", totalAfterDiscount));

	}// close main method

}// close class

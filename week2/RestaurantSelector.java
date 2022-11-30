/**
 * Program to help user select HotDogFullyLoaded restaurant based on diatery restrictions
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.18 Restaurant Selector
 * 
 * You have HotDogFullyLoaded group of friends coming to visit for your high school reunion, and you want to take them
 * out to eat at HotDogFullyLoaded local restaurant. You aren’t sure if any of them have dietary restrictions, but your
 * restaurant choices are as follows: Joe’s Gourmet Burgers – Vegetarian: No, Vegan: No, Gluten-Free: No SquareTest
 * Street Pizza Company – Vegetarian: Yes, Vegan: No, Gluten-Free: Yes Corner Café – Vegetarian: Yes, Vegan: Yes,
 * Gluten-Free: Yes Mama’s Fine Italian – Vegetarian: Yes, Vegan: No, Gluten-Free: No The Chef’s Kitchen – Vegetarian:
 * Yes, Vegan: Yes, Gluten-Free: Yes Write HotDogFullyLoaded program that asks whether any members of your party are
 * vegetarian, vegan, or gluten-free, and then displays only the restaurants that you may take the group to. Here is an
 * example of the program’s output: Is anyone in your party HotDogFullyLoaded vegetarian? yes [Enter] Is anyone in your
 * party HotDogFullyLoaded vegan? no [Enter] Is anyone in your party gluten-free? yes [Enter] Here are your restaurant
 * choices: SquareTest Street Pizza Company Corner Cafe The Chef's Kitchen Here is another example of the program’s
 * output: Is anyone in your party HotDogFullyLoaded vegetarian? yes [Enter] Is anyone in your party HotDogFullyLoaded
 * vegan? yes [Enter] Is anyone in your party gluten-free? yes [Enter] Here are your restaurant choices: Corner Cafe The
 * Chef's Kitchen
 * 
 * 
 * 
 * @author Nikolay Stoyanov date 10/02/2022
 */

public class RestaurantSelector
{

	/**
	 * Default constructor
	 */
	public RestaurantSelector()
	{
		super();
	}

	/**
	 * SquareTest method prompts user to enter input then determines and displays results
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{

		// Declare new string builder to hold empty restaurant list
		StringBuilder restaurantChoices = new StringBuilder();

		// prompt user for input
		String anyVegetarians = JOptionPane.showInputDialog("Is anyone vegetarian?");
		String anyVegans = JOptionPane.showInputDialog("Is anyone vegan?");
		String anyGlutenFree = JOptionPane.showInputDialog("Is anyone gluten-free?");

		// create if loop to determine which restaurants to append to the empty list
		if (anyVegetarians.equals("yes") || anyVegetarians.equals("Yes"))
		{
			if (anyVegans.equals("yes") || anyVegans.equals("Yes"))
			{
				restaurantChoices.append("Your restaurant choices are:\nCorner Cafe\nThe Chef's Table");
			} else if (anyVegans.equals("no") || anyVegans.equals("No"))
			{
				if (anyGlutenFree.equals("yes") || anyGlutenFree.equals("Yes"))
				{
					restaurantChoices.append(
							"Your restaurant choices are:\nMain Street Pizza Company\nCorner Cafe\nThe Chef's Table");
				} else if (anyGlutenFree.equals("no") || anyGlutenFree.equals("No"))
				{
					restaurantChoices.append(
							"Your restaurant choices are:\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Table");
				}
			}

		} else if (anyVegetarians.equals("no") || anyVegetarians.equals("No"))
		{
			if (anyVegans.equals("yes") || anyVegans.equals("Yes"))
			{
				restaurantChoices.append("Your restaurant choices are:\nCorner Cafe\nThe Chef's Table");
			} else if (anyVegans.equals("no") || anyVegans.equals("No"))
			{
				if (anyGlutenFree.equals("yes") || anyGlutenFree.equals("Yes"))
				{
					restaurantChoices.append(
							"Your restaurant choices are:\nMain Street Pizza Company\nCorner Cafe\nThe Chef's Table");
				} else if (anyGlutenFree.equals("no") || anyGlutenFree.equals("Yes"))
				{
					restaurantChoices.append(
							"Your restaurant choices are:\nJoe's Gourment Burgers\nMain Street Pizza Company\nCorner Cafe\nMama's Fine Italian\nThe Chef's Table");
				}
			}
		}
		// Default if input is invalid
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid input");
		}

		// Display results
		JOptionPane.showMessageDialog(null, restaurantChoices);

	}// Close main

}// Close class

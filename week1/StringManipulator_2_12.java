package chapter2;

import javax.swing.JOptionPane;

/**
 * * This program asks user to input their favorite city then displays
 * n of characters in name, name in all uppercase, name in all lowercase and first character in name.
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.12 String Manipulation
 * @due: 9/18/2022 
 *
 */
public class StringManipulator_2_12
{
    /**
     * 
     * Main method prompts user to enter their favorite city and displays desired results
     */
    public static void main(String[] args)
    {

	// Get input for city
	String favoriteCity = JOptionPane.showInputDialog("What is your favorite city?");

	// Find length
	int nameLength = favoriteCity.length();

	// Convert to all uppercase
	String nameUpperCase = favoriteCity.toUpperCase();

	// Convert to all lowercase
	String nameLowerCase = favoriteCity.toLowerCase();

	// Find the first character
	char firstLetter = favoriteCity.charAt(0);

	// Display result in a window
	JOptionPane.showMessageDialog(null,
		"Your favority city is: " + favoriteCity + '\n' + "Letters in the name " + favoriteCity + " : "
			+ nameLength + '\n' + "Name in all uppercase letters: " + nameUpperCase + '\n'
			+ "Name in all lowercase letters: " + nameLowerCase + '\n' + "First letter in the name "
			+ favoriteCity + " : " + firstLetter);

    } // End main

} // End class

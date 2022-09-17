/**
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.12 String Manipulation
 * @due: 9/18/2022 
 * This program asks user to input their favorite city then displays
 * n of characters in name, name in all uppercase, name in all lowercase and first character in name.
 *
 */


package week1;
import javax.swing.JOptionPane;

public class string_manipulator {
	/**
	 * 
	 * Main method prompts user to enter their favorite city and displays desired results
	 */
	
	public static void main(String[] args) {
		
		// Get input for city
		String favoriteCity = JOptionPane.showInputDialog("What is your favorite city?");
		
		// Find length
		int nameLength = favoriteCity.length();
		
		// convert to all uppercase
		String nameUpperCase = favoriteCity.toUpperCase();
		
		// convert to all lowercase
		String nameLowerCase = favoriteCity.toLowerCase();
		
		// find the first character
		char firstLetter = favoriteCity.charAt(0);
		
		// display result in a window
		JOptionPane.showMessageDialog(null, "Your favority city is: " + favoriteCity + '\n' +
											"Letters in the name " + favoriteCity + " : " + nameLength + '\n' + 
											"Name in all uppercase letters: " + nameUpperCase + '\n' +
											"Name in all lowercase letters: " + nameLowerCase + '\n' +
											"First letter in the name " + favoriteCity + " : " + firstLetter);
		
		
		
		
		
		
	}

}

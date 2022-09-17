/**
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.8 Cookie Calories
 * @due: 9/18/2022
 * 
 * 
 * 
 */

package week1;
import javax.swing.JOptionPane;


public class cookie_calories {
	/**
	 * 
	 * Main method assigns variables, prompts user for input, calculates and displays results
	 */
	
	public static void main(String[] args) {
		
		double cookiesInABag = 40;
		
		double servingsPerBag = 10;
		
		// calculate how many cookies per serving
		double cookiesPerServing = cookiesInABag / servingsPerBag;
		
		double caloriesPerServing = 300;
		
		// calculates calories per single cookie
		double caloriesPerCookie = caloriesPerServing / cookiesPerServing;
		
		// Get amount of cookies eaten
		String InputString = JOptionPane.showInputDialog("How many cookies did you eat? Don't lie! :");
		
		// convert number of cookies to from string to double
		double cookiesEaten = Double.parseDouble(InputString);
		
		// calculate calories consumed based on cookies eaten
		double caloriesConsumed = cookiesEaten * caloriesPerCookie;
		
		// display result in a window
		JOptionPane.showMessageDialog(null, "You ate " + cookiesEaten + " cookies and consumed " + caloriesConsumed + " calories." );
		
	}

}

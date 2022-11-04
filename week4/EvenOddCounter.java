/**
 * Program generates 100 random numbers and checks how many are odd and even
 * 
 */
package chapter5;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 * 5.15 Even/Odd Counter
 * 
 * You can use the following logic to determine whether a number is even or odd:
 * if ((number % 2) == 0) { // The number is even. } else { // The number is
 * odd. } Write a program with a method named isEven that accepts an int
 * argument. The method should return true if the argument is even, or false
 * otherwise. The program’s main method should use a loop to generate 100 random
 * integers. It should use the isEven method to determine whether each random
 * number is even, or odd. When the loop is finished, the program should display
 * the number of even numbers that were generated, and the number of odd numbers
 * 
 * @author Nikolay Stoyanov Oct 25, 2022
 */
public class EvenOddCounter
{

	/**
	 * Default constructor
	 */
	public EvenOddCounter()
	{
		super();
	}

	/**
	 * Main method initiates variables, generates a random number, calls functions
	 * and iterates given amount of times.
	 *
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		/**
		 * set constant for program
		 */
		final Integer iterations = 100;
		
		// Declare variable for if number is even
		Boolean evenNum = true;

		// While loop to restar the program
		Boolean runAgain = true;
		while (runAgain)
		{

			// Initiate odd and even number variables to keep a running total
			Integer oddNumbers = 0;
			Integer evenNumbers = 0;

			// for loop to generate random int and decide if its an odd or random number
			for (int i = 0; i < iterations; i++)
			{
				// Assign random int
				Random randInt = new Random();
				int number = randInt.nextInt();

				// check if number is odd or even and keep a running total
				evenNum = isEven(number);
				if (evenNum)
				{
					evenNumbers += 1;
				} else
				{
					oddNumbers += 1;
				}
			}
			// Display results in a window
			displayResults(evenNumbers, oddNumbers);

			// Check if user wants to restart program
			runAgain = runAgain();

		}

	}

	/**
	 * Check if number is odd or even and return a boolean
	 * 
	 * @param number randomly generated int
	 * 
	 * @return True or false boolean
	 */
	public static Boolean isEven(Integer number)
	{
		Boolean evenNum = false;
		if ((number % 2) == 0)
		{
			evenNum = true;
		}
		return evenNum;

	}

	/**
	 * Display results
	 * 
	 * @param evenNumbers even number count
	 * @param oddNumbers  odd number count
	 */
	public static void displayResults(Integer evenNumbers, Integer oddNumbers)
	{
		JOptionPane.showMessageDialog(null,
				"Even numbers generated: " + evenNumbers + "\n" + "Odd numbers generated: " + oddNumbers);
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

}// Close class

/**
 *  Program to display Roman numerals
 */

package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.1 Roman Numerals (Switch Statement)
 *
 * Write a program that prompts the user to enter a number within the range of 1 through 10. The program should display
 * the Roman numeral version of that number. If the number is outside the range of 1 through 10, the program should
 * display an error message.
 * 
 * @author Nikolay Stoyanov
 * date 10/02/2022
 *
 */
public class RomanNumerals
{
    /**
     * 
     * Main method gets user input and converts it to int. If-else-if loop follows input.
     */

    public static void main(String[] args)
    {
	String InputString = JOptionPane.showInputDialog("Enter a number in the range of 1 - 10: ");

	// Convert input to int
	int numberToBeConverted = Integer.parseInt(InputString);
	// Initiate a switch statement and display result based on user input.
	switch (numberToBeConverted)
	{
	case 1:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is I.");
	    break;
	case 2:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is II.");
	    break;
	case 3:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is III.");
	    break;
	case 4:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is IV.");
	    break;
	case 5:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is V.");
	    break;
	case 6:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is VI.");
	    break;
	case 7:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is VII.");
	    break;
	case 8:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is VIII.");
	    break;
	case 9:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is IX.");
	    break;
	case 10:
	    JOptionPane.showMessageDialog(null, "The roman numeral for " + numberToBeConverted + " is X.");
	    break;
	default:
	    JOptionPane.showMessageDialog(null, "Invalid input, please enter a number between 1 and 10.");
	    

	}// close switch statement

    } // close main method

} // close class

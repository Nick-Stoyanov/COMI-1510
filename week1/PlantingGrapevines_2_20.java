package chapter2;

import javax.swing.JOptionPane;

/**
 * This program prompts user to enter three values then calculates how many vines will fit in a row.
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.20 Planting Grapevines
 * @due: 9/18/2022
 * 
 */

public class PlantingGrapevines_2_20
{

    /**
     * 
     * Main method prompts user to enter data, then converts it to double, calculates and displays the number of vines
     * that will fit in a row
     */

    public static void main(String[] args)
    {

	// Get length of row
	String lengthInput = JOptionPane.showInputDialog("Enter the length of the row, in feet: ");

	// Convert input to double
	double rowLength = Double.parseDouble(lengthInput);

	// Get space used by end-post assembly
	String spaceUsedInput = JOptionPane
		.showInputDialog("Enter the amount of space used by the end-post assembly: ");

	// Convert input to double
	double endPostSpace = Double.parseDouble(spaceUsedInput);

	// Get space between vines
	String spaceBetweenInput = JOptionPane.showInputDialog("Enter the space between vines, in feet: ");

	// Convert input to double
	double spaceBetweenVines = Double.parseDouble(spaceBetweenInput);

	// Calculate how many vines fit per row
	double vinesPerRow = (rowLength - (2 * endPostSpace)) / spaceBetweenVines;

	// Display result in a window
	JOptionPane.showMessageDialog(null, vinesPerRow + " vines will fit in the row.");
    } // End main

} // End class

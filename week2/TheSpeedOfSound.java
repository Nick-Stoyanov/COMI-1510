/**
 * Program to calculate and display time traveled by sound in different mediums.
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.12 The Speed of Sound
 * 
 * The following table shows the approximate speed of sound in air, water, and steel: Medium Speed Air 1,100 feet per
 * second Water 4,900 feet per second Steel 16,400 feet per second Write a program that asks the user to enter “air”,
 * “water”, or “steel”, and the distance that a sound wave will travel in the medium. The program should then display
 * the amount of time it will take. You can calculate the amount of time it takes sound to travel in air with the
 * following formula: Time = Distance / 1 , 100 You can calculate the amount of time it takes sound to travel in water
 * with the following formula: Time = Distance / 4 , 900 You can calculate the amount of time it takes sound to travel
 * in steel with the following formula: Time = Distance / 16 , 400.
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 */

public class TheSpeedOfSound
{

    /**
     * Main method gets input, calculates and displays results.
     * 
     * @param args ignored
     */
    public static void main(String[] args)
    {
	// Declare variables
	int speedInAir = 1100;
	int speedInWater = 4900;
	int speedInSteel = 16400;
	double timeOfTravel = 0;

	// Prompt user to choose the medium
	String medium = JOptionPane.showInputDialog("Enter the medium (air, water or steel): ");

	// Prompt user to enter distance and convert it to a double
	String inputDistance = JOptionPane.showInputDialog("Enter distance a sound wave will travel in feet: ");
	Double distance = Double.parseDouble(inputDistance);

	// switch statement to determine medium and calculate time of travel
	switch (medium)
	{
	case "air":
	case "Air":
	    timeOfTravel = distance / speedInAir;
	    break;
	case "water":
	case "Water":
	    timeOfTravel = distance / speedInWater;
	    break;
	case "steel":
	case "Steel":
	    timeOfTravel = distance / speedInSteel;
	    break;
	// Default statement
	default:
	    JOptionPane.showMessageDialog(null, "Invalid input.");
	}

	// Display formatted results in a window
	JOptionPane.showMessageDialog(null, String.format("Travel time: %.1f seconds.", timeOfTravel));

    }// Close main

}// Close class

/**
 *  Program to take race time input and display runners in the order they finished.
 */

package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.11 Running the Race
 * 
 * Write a program that asks for the names of three runners and the time, in minutes, it took each of them to finish a
 * race. The program should display the names of the runners in the order that they finished.
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 */

public class RunningTheRace
{
    /**
     * Main method takes input, performs comparisons and displays results.
     * 
     * @param args ignored
     */

    public static void main(String[] args)
    {
	// Take input for name and time for runner 1
	String runner1Name = JOptionPane.showInputDialog("Enter name of first runner: ");
	String inputRunner1Time = JOptionPane.showInputDialog("Enter " + runner1Name + "'s time in minutes: ");
	Integer runner1Time = Integer.parseInt(inputRunner1Time);

	// Take input for name and time for runner 2
	String runner2Name = JOptionPane.showInputDialog("Enter name of second runner: ");
	String inputRunner2Time = JOptionPane.showInputDialog("Enter " + runner2Name + "'s time in minutes: ");
	Integer runner2Time = Integer.parseInt(inputRunner2Time);

	// Take input for name and time for runner 3
	String runner3Name = JOptionPane.showInputDialog("Enter name of third runner: ");
	String inputRunner3Time = JOptionPane.showInputDialog("Enter " + runner3Name + "'s time in minutes: ");
	Integer runner3Time = Integer.parseInt(inputRunner3Time);

	// Declare variables for first second and third place
	StringBuilder firstPlace = new StringBuilder();
	StringBuilder secondPlace = new StringBuilder();
	StringBuilder thirdPlace = new StringBuilder();

	// If loop to sort the times by shortest and append name of runner to place
	if (runner1Time <= runner2Time && runner1Time <= runner3Time)
	{
	    firstPlace.append(runner1Name);

	    if (runner2Time <= runner3Time)
	    {
		secondPlace.append(runner2Name);
		thirdPlace.append(runner3Name);
	    } else
	    {
		secondPlace.append(runner3Name);
		thirdPlace.append(runner2Name);
	    }
	}
	if (runner2Time <= runner1Time && runner2Time <= runner3Time)
	{
	    firstPlace.append(runner2Name);

	    if (runner1Time <= runner3Time)
	    {
		secondPlace.append(runner1Name);
		thirdPlace.append(runner3Name);
	    } else
	    {
		secondPlace.append(runner3Name);
		thirdPlace.append(runner1Name);
	    }
	}
	if (runner3Time <= runner2Time && runner3Time <= runner1Time)
	{
	    firstPlace.append(runner3Name);

	    if (runner1Time <= runner2Time)
	    {
		secondPlace.append(runner1Name);
		thirdPlace.append(runner2Name);
	    } else
	    {
		secondPlace.append(runner2Name);
		thirdPlace.append(runner1Name);
	    }
	}

	// Display results in a window
	JOptionPane.showMessageDialog(null,
		"Runners in the order that they fininshed:\n" + firstPlace + '\n' + secondPlace + '\n' + thirdPlace);
    }// Close main

}// Close class

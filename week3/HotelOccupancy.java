/**
 * Program to calculate hotel occupancy
 */
package chapter4;

import javax.swing.JOptionPane;

/**
 * 4.7 Hotel Occupancy
 * 
 * A hotel’s occupancy rate is calculated as follows: Occupancy rate = Number of
 * rooms occupied ÷ Total number of rooms. Write a program that calculates the
 * occupancy rate for each floor of a hotel. The program should start by asking
 * for the number of floors in the hotel. A loop should then iterate once for
 * each floor. During each iteration, the loop should ask the user for the
 * number of rooms on the floor and the number of them that are occupied. After
 * all the iterations, the program should display the number of rooms the hotel
 * has, the number of them that are occupied, the number that are vacant, and
 * the occupancy rate for the hotel. Input Validation: Do not accept a value
 * less than 1 for the number of floors. Do not accept a number less than 10 for
 * the number of rooms on a floor.
 * 
 * 
 * @author Nikolay Stoyanov Oct 12, 2022
 */

public class HotelOccupancy
{
	/**
	 * Main method collects input and displays results
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		// Initiate valiables for total rooms
		Integer roomsOnFloor = 0;
		Double roomsTotal = 0.0;

		// Initiate variables for occupied rooms
		Integer roomsOccupiedOnFloor = 0;
		Double roomsOccupiedTotal = 0.0;

		// Initiate variable for ocupancy rate
		Double occupancyRate = 0.0;

		// Get input for number of floors and validate it
		String InputFloors = JOptionPane.showInputDialog("How many floors does the hotel have: ");
		Integer floors = Integer.parseInt(InputFloors);
		while (floors < 1)
		{
			InputFloors = JOptionPane.showInputDialog("Enter a value greater than 1: ");
			floors = Integer.parseInt(InputFloors);
		}

		// for loop for each floor
		for (int j = 1; j <= floors; j++)
		{
			// Get rooms per floor and validate input
			String roomsOnFloorInput = JOptionPane.showInputDialog("How many rooms on floor " + j + "?");
			roomsOnFloor = Integer.parseInt(roomsOnFloorInput);

			while (roomsOnFloor < 10)
			{
				roomsOnFloorInput = JOptionPane.showInputDialog("Enter 10 or more: ");
				roomsOnFloor = Integer.parseInt(roomsOnFloorInput);
			}
			// Add to total
			roomsTotal += roomsOnFloor;

			// Get rooms occupied and validate input
			String roomsOccupiedInput = JOptionPane.showInputDialog("How many rooms are occupied on floor " + j + "?");
			roomsOccupiedOnFloor = Integer.parseInt(roomsOccupiedInput);
			while (roomsOccupiedOnFloor > roomsOnFloor)
			{
				roomsOccupiedInput = JOptionPane
						.showInputDialog("You cannot occupy more rooms than are there are. Try again.");
				roomsOccupiedOnFloor = Integer.parseInt(roomsOccupiedInput);
			}
			// Add to total
			roomsOccupiedTotal += roomsOccupiedOnFloor;
		}

		// Calulate occupancy rate
		occupancyRate = roomsOccupiedTotal / roomsTotal;

		// Display results in a window
		JOptionPane.showMessageDialog(null, String.format("The hotel occupancy rate is: %% %.2f", occupancyRate * 100));

	}// Close main

}// Close class

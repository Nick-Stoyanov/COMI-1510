/**
 * Program to simulate the tossing of a coin
 */
package chapter6;

import javax.swing.JOptionPane;

/**
 * 6.16 Coin Toss Simulator
 * 
 * Write a class named Coin. The Coin class should have the following field: A
 * String named sideUp. The sideUp field will hold either “heads” or “tails”
 * indicating the side of the coin that is facing up. The Coin class should have
 * the following methods: A no-arg constructor that randomly determines the side
 * of the coin that is facing up (“heads” or “tails”) and initializes the sideUp
 * field accordingly. A void method named toss that simulates the tossing of the
 * coin. When the toss method is called, it randomly determines the side of the
 * coin that is facing up (“heads” or “tails”) and sets the sideUp field
 * accordingly. A method named getSideUp that returns the value of the sideUp
 * field. Write a program that demonstrates the Coin class. The program should
 * create an instance of the class and display the side that is initially facing
 * up. Then, use a loop to toss the coin 20 times. Each time the coin is tossed,
 * display the side that is facing up. The program should keep count of the
 * number of times heads is facing up and the number of times tails is facing
 * up, and display those values after the loop finishes.
 * 
 * @author Nikolay Stoyanov Nov 12, 2022
 */
public class CoinTossSimulator
{
	/**
	 * Default constructor
	 */
	public CoinTossSimulator()
	{
		super();
	}

	/**
	 * Main method tosses the coin 20 times and keeps count of heads and tails
	 * 
	 * @param args ignored
	 */

	private static void playGame()
	{
		/**
		 * Constant for how many times coin should be tossed
		 */
		final Integer rolls = 20;

		// initialize heads counter
		Integer headsCount = 0;

		// Initialize tails counter
		Integer tailsCount = 0;

		// Create new coin
		Coin coin = new Coin();
		System.out.println("Initial state: " + coin.getSideUp());

		// loop to iterate and keep count of heads and tails
		for (int i = 0; i < rolls; i++)
		{
			coin.toss();
			System.out.println(coin.getSideUp());

			if (coin.getSideUp() == "heads")
			{
				headsCount++;
			} else
			{
				tailsCount++;
			}
		}
		JOptionPane.showMessageDialog(null,"Heads count: " + headsCount + "\nTails count: " + tailsCount);

	}

	/**
	 * Main method calls the playGame method to start game
	 * 
	 * @param args
	 */

	public static void main(String[] args)
	{
		playGame();
	
	}// close main

}// close class

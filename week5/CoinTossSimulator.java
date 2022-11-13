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
	 * Method plays game and display results
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
		StringBuilder sb = new StringBuilder();

		// loop to iterate and keep count of heads and tails
		for (int i = 0; i < rolls; i++)
		{
			coin.toss();

			if (coin.getSideUp() == "heads")
			{
				headsCount++;
			} else
			{
				tailsCount++;
			}
			sb.append(coin.toString()).append("\n");

		}

		System.out.println(sb);
		JOptionPane.showMessageDialog(null, "Heads count: " + headsCount + "\nTails count: " + tailsCount);

	}

	/**
	 * Ask user if they would like to run the program again. If no then display
	 * goodbye message.
	 *
	 * @return boolean to stop or continue the program
	 */
	private static Boolean runAgain()
	{
		boolean run = true;
		int n = JOptionPane.showConfirmDialog(null, "Do you want to use the program again?", " Select an option",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.NO_OPTION)
		{
			run = false;
			JOptionPane.showMessageDialog(null, "Thanks for using the program!\nBye bye.");
		}
		return run;
	}

	/**
	 * Main method calls the playGame method to start game
	 * 
	 * @param args ignored
	 */

	public static void main(String[] args)
	{
		Boolean runAgain = true;
		while (runAgain)
		{
			playGame();
			runAgain = runAgain();
		}

	}// close main

}// close class

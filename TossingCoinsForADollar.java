/**
 * Program to simulate a Tossing for Dollar Game
 */
package chapter6;

import javax.swing.JOptionPane;

/**
 * 6.18 Tossing Coins for a Dollar
 * 
 * For this assignment you will create a game program using the Coin class from
 * Programming Challenge 17. The program should have three instances of the Coin
 * class: one representing a quarter, one representing a dime, and one
 * representing a nickel. When the game begins, your starting balance is $0.
 * During each round of the game, the program will toss the simulated coins.
 * When a coin is tossed, the value of the coin is added to your balance if it
 * lands heads-up. For example, if the quarter lands heads-up, 25 cents is added
 * to your balance. Nothing is added to your balance for coins that land
 * tails-up. The game is over when your balance reaches one dollar or more. If
 * your balance is exactly one dollar, you win the game. You lose if your
 * balance exceeds one dollar.
 * 
 * @author Nikolay Stoyanov Nov 12, 2022
 */
public class TossingCoinsForADollar
{

	/**
	 * Default constructor
	 */
	public TossingCoinsForADollar()
	{
		super();
	}

	/**
	 * Method plays game
	 */
	private static void playGame()
	{

		/**
		 * Initialize constant value for quarter
		 */
		final Double quarterValue = 25.0;
		/**
		 * Initialize constant value for dime
		 */
		final Double dimeValue = 10.0;
		/**
		 * Initialize constant value for nickel
		 */
		final Double nickelValue = 5.0;

		// Initialize value to keep total
		Double totalMoney = 0.0;

		StringBuilder sb = new StringBuilder();

		// Create three new coins
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();

		// while loop keeps tossing coin until user reaches or exceeds 1 dollar
		while (totalMoney < 100)
		{
			quarter.toss();

			if (quarter.getSideUp() == "heads" && totalMoney < 100)
			{
				totalMoney += quarterValue;
				System.out.println("Quarter landed heads up.\n$0.25 added to your total.");
			} else
			{
				System.out.println("Quarter landed tails up.\n0 added to your total.");
			}
			dime.toss();
			if (dime.getSideUp() == "heads" && totalMoney < 100)
			{
				totalMoney += dimeValue;
				System.out.println("Dime landed heads up.\n$0.10 added to your total.");
			} else
			{
				System.out.println("Dime landed tails up.\n0 added to your total.");
			}
			nickel.toss();
			if (nickel.getSideUp() == "heads" && totalMoney < 100)
			{
				totalMoney += nickelValue;
				System.out.println("Nickel landed heads up.\n$0.05 added to your total.");
			} else
			{
				System.out.println("Nickel landed tails up.\n0 added to your total.");
			}
			System.out.println("Total: $" + totalMoney / 100);
			sb.append(quarter.toString()).append("\n");
			sb.append(dime.toString()).append("\n");
			sb.append(nickel.toString()).append("\n");
			sb.append("Quarter toss results: ").append(quarter.getSideUp()).append("\n");
			sb.append("Dime toss results: ").append(dime.getSideUp()).append("\n");
			sb.append("Nickel toss results: ").append(nickel.getSideUp()).append("\n\n");
		}

		System.out.println(sb);
		// Determine if user wins ($1) or loses (over $1)
		if (totalMoney == 100)
		{
			JOptionPane.showMessageDialog(null, "Your got exactly $1! You win");
		} else
		{
			JOptionPane.showMessageDialog(null, "You got: $" + totalMoney / 100 + "\nYou lose!");
		}
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
	 * main method calls playGame method to initiate game
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

	}

}// close class

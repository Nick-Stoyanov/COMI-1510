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
	
	
	private static void playGame() {
		/**
		 * Initialize constant value for quarter
		 */
		final double quarterValue = 0.25;
		/**
		 * Initialize constant value for dime
		 */
		final double dimeValue = 0.1;
		/**
		 * Initialize constant value for nickel
		 */
		final double nickelValue = 0.05;

		// Initialize value to keep total
		Double totalMoney = 0.0;

		// Create three new coins
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();

		// while loop keeps tossing coin until user reaches or exceeds 1 dollar
		while (totalMoney < 1)
		{
			quarter.toss();

			if (quarter.getSideUp() == "heads" && totalMoney < 1)
			{
				totalMoney += quarterValue;
				System.out.println("Quarter landed heads up.\n$0.25 added to your total.");
			} else
			{
				System.out.println("Quarter landed tails up.\n0 added to your total.");
			}
			dime.toss();
			if (dime.getSideUp() == "heads" && totalMoney < 1)
			{
				totalMoney += dimeValue;
				System.out.println("Dime landed heads up.\n$0.10 added to your total.");
			} else
			{
				System.out.println("Dime landed tails up.\n0 added to your total.");
			}
			nickel.toss();
			if (nickel.getSideUp() == "heads" && totalMoney < 1)
			{
				totalMoney += nickelValue;
				System.out.println("Nickel landed heads up.\n$0.05 added to your total.");
			} else
			{
				System.out.println("Nickel landed tails up.\n0 added to your total.");
			}
			System.out.println("Total:" + totalMoney);
		}

		// Determine if user wins ($1) or loses (over $1)
		if (totalMoney == 1)
		{
			JOptionPane.showMessageDialog(null, "Your got exactly $1! You win");
		} else
		{
			JOptionPane.showMessageDialog(null, "You got: $" + totalMoney + "\nYou lose!");
		}
	}

	/**
	 * main method calls playGame method to initiate game
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		playGame();
		
	}

}// close class

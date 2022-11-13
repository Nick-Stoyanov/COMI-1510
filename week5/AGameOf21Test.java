/**
 * This program uses the Die and AGameOf21 class to simulate a game between player and computer
 */
package chapter6;

import javax.swing.JOptionPane;

/**
 * 6.10 A Game Of 21 Test
 * 
 * Method tests the Game of 21 class
 * 
 * @author Nikolay Stoyanov Nov 10, 2022
 */
public class AGameOf21Test
{

	/**
	 * Default constructor
	 */
	public AGameOf21Test()
	{
		super();
	}

	/**
	 * Play a game of 21
	 */
	private static void playGame()
	{
		/**
		 * Constant value of blackJack
		 */
		final int blackJack = 21;

		/**
		 * Create player player and computer using the AGameOf21Player method
		 */
		AGameOf21Player player = new AGameOf21Player();
		AGameOf21Player computer = new AGameOf21Player();

		/**
		 * Set player and computer points based on roll
		 */
		player.setPoints(player.getRollValue());
		computer.setPoints(computer.getRollValue());

		/**
		 * Display player roll
		 */
		JOptionPane.showMessageDialog(null, "Your roll: " + player.getPoints());

		// Boolean to roll again if user selects yes
		boolean rollAgain = true;

		int n = JOptionPane.showConfirmDialog(null, "Do you want to roll again?", "Select and option.",
				JOptionPane.YES_NO_OPTION);
		// While loop to assign points if rolled again or display results if not
		while (rollAgain && player.getPoints() <= blackJack)
		{

			// if no selected exit loop
			if (n == JOptionPane.NO_OPTION && player.getPoints() <= blackJack)
			{
				rollAgain = false;
			}

			// roll again and add points
			if (player.getPoints() <= blackJack && rollAgain)
			{

				computer.setPoints(computer.getPoints() + computer.getRollValue());
				player.setPoints(player.getPoints() + player.getRollValue());

				// Display new user score
				JOptionPane.showMessageDialog(null, "Your score: " + player.getPoints());

				// check if user wants to roll gain
				if (player.getPoints() <= blackJack)
				{
					n = JOptionPane.showConfirmDialog(null, "Do you want to roll again?", "Select and option.",
							JOptionPane.YES_NO_OPTION);
				}
			} else
			{
				rollAgain = false;
			}
		}

		// display points
		displayResults(player.getPoints(), computer.getPoints());

		// Calculate and display winner
		if (player.getPoints() <= blackJack && computer.getPoints() <= blackJack)
		{

			if (player.getPoints() > computer.getPoints())
			{
				JOptionPane.showMessageDialog(null, "You win!\n");
			} else if (player.getPoints() < computer.getPoints())
			{
				JOptionPane.showMessageDialog(null, "You lose!\n");

			} else
			{
				JOptionPane.showMessageDialog(null, "Draw!\n");

			}
		}

		else if (player.getPoints() <= blackJack && computer.getPoints() > blackJack)
		{
			JOptionPane.showMessageDialog(null, "You win!\n");
		}

		else if (player.getPoints() > blackJack && computer.getPoints() <= blackJack)
		{
			JOptionPane.showMessageDialog(null, "You lose!\n");
		}

		else
		{
			JOptionPane.showMessageDialog(null, "No winners!\n");
		}

	}

	/**
	 * Displays results
	 * 
	 * @param userPoints     user points
	 * @param computerPoints computer points
	 */

	private static void displayResults(int userPoints, int computerPoints)
	{
		JOptionPane.showMessageDialog(null, "Your total:" + userPoints + "\nComputer total: " + computerPoints);
	}

	/**
	 * Ask user if they would like to run the program again. If no then display HotDogFullyLoaded goodbye message.
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
	 * Main method plays game
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
}

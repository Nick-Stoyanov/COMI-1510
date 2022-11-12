/**
 * 
 */
package chapter6;

import javax.swing.JOptionPane;

/**
 * @author Nikolay Stoyanov Nov 10, 2022
 */
public class AGameOf21Test
{

	private static void playGame()
	{
		final int blackJack = 21;

		AGameOf21Player player = new AGameOf21Player();
		AGameOf21Player computer = new AGameOf21Player();

		// Integer userPoints = 0;
		// Integer computerPoints = 0;

		player.setPoints(player.getRollValue());
		computer.setPoints(computer.getRollValue());

		JOptionPane.showMessageDialog(null, "Your roll: " + player.getPoints());

		Boolean rollAgain = true;

		int n = JOptionPane.showConfirmDialog(null, "Do you want to roll again?", "Select and option.",
				JOptionPane.YES_NO_OPTION);
		while (rollAgain && player.getPoints() <= blackJack)
		{

			if (n == JOptionPane.NO_OPTION && player.getPoints() <= blackJack)
			{
				rollAgain = false;
			}

			if (player.getPoints() <= blackJack && rollAgain)
			{

				computer.setPoints(computer.getPoints() + computer.getRollValue());
				player.setPoints(player.getPoints() + player.getRollValue());

				JOptionPane.showMessageDialog(null, "Your score: " + player.getPoints());
				;

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

		displayResults(player.getPoints(), computer.getPoints());

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
		Boolean run = true;
		int n = JOptionPane.showConfirmDialog(null, "Do you want to use the program again?", " Select an option",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.NO_OPTION)
		{
			run = false;
			JOptionPane.showMessageDialog(null, "Thanks for using the program!\nBye bye.");
		}
		return run;
	}

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

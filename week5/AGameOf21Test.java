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
		AGameOf21 game = new AGameOf21();

		final int blackJack = 21;
		Integer userPoints = 0;
		Integer computerPoints = 0;

		userPoints += game.getRollValue();
		computerPoints += game.getRollValue();

		JOptionPane.showMessageDialog(null, "Your roll: " + userPoints);

		Boolean rollAgain = true;

		int n = JOptionPane.showConfirmDialog(null, "Do you want to roll again?", "Select and option.",
				JOptionPane.YES_NO_OPTION);
		while (rollAgain && userPoints <= blackJack)
		{

			if (n == JOptionPane.NO_OPTION && userPoints <= blackJack)
			{
				rollAgain = false;;
			}

			if (userPoints <= blackJack && rollAgain)
			{
				computerPoints += game.getRollValue();
				userPoints += game.getRollValue();
				JOptionPane.showMessageDialog(null, "Your score: " + userPoints);;

				if (userPoints <= blackJack)
				{
					n = JOptionPane.showConfirmDialog(null, "Do you want to roll again?", "Select and option.",
							JOptionPane.YES_NO_OPTION);
				}
			} else
			{
				rollAgain = false;
			}
		}

		displayResults(userPoints, computerPoints);

		if (userPoints <= blackJack && computerPoints <= blackJack)
		{

			if (userPoints > computerPoints)
			{
				JOptionPane.showMessageDialog(null, "You win!\n");
			} else if (userPoints < computerPoints)
			{
				JOptionPane.showMessageDialog(null, "You lose!\n");

			} else
			{
				JOptionPane.showMessageDialog(null, "Draw!\n");

			}
		}

		else if (userPoints <= blackJack && computerPoints > blackJack)
		{

			JOptionPane.showMessageDialog(null, "You win!\n");
		}

		else if (userPoints > blackJack && computerPoints <= blackJack)
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

/**
 * This class creates a player and interacts with a dice by rolling it twice
 */
package chapter6;

/**
 * 6.10 A Game Of 21
 * 
 * For this assignment, you will write a program that lets the user play against the computer in a variation of the
 * popular blackjack card game. In this variation of the game, two six-sided dice are used instead of cards. The dice
 * are rolled, and the player tries to beat the computer’s hidden total without going over 21. Here are some suggestions
 * for the game’s design: Each round of the game is performed as an iteration of a loop that repeats as long as the
 * player agrees to roll the dice, and the player’s total does not exceed 21. At the beginning of each round, the
 * program will ask the user whether or not he or she wants to roll the dice to accumulate points. During each round,
 * the program simulates the rolling of two six-sided dice. It rolls the dice first for the computer, and then it asks
 * the user whether he or she wants to roll. (Use the Die class that was shown in Code Listing 6-14 to simulate the
 * dice.) The loop keeps a running total of both the computer’s and the user’s points. The computer’s total should
 * remain hidden until the loop has finished. After the loop has finished, the computer’s total is revealed, and the
 * player with the most points, without going over 21, wins.
 * 
 * 
 * @author Nikolay Stoyanov Nov 10, 2022
 */
public class AGameOf21Player
{
	/**
	 * initiate points
	 */
	private int points = 0;

	/**
	 * Default constructor
	 */
	public AGameOf21Player()
	{
		this(0);
	}

	/**
	 * Constrictor to initiate game with input points
	 * 
	 * @param points user points
	 */
	public AGameOf21Player(int points)
	{
		super();
	}

	/**
	 * Rolls a die twice and returns their combined value
	 * 
	 * @return value of roll
	 */
	public int getRollValue()
	{

		// create new dice object
		Die die = new Die(6);

		// roll both dice
		int roll1Value = die.getValue();

		int roll2Value = die.getSides();

		// return total roll value
		return roll1Value + roll2Value;
	}

	/**
	 * Sets points
	 * 
	 * @param newPoints points
	 */
	public void setPoints(int newPoints)
	{
		points = newPoints;
	}

	/**
	 * Gets user points
	 * 
	 * @return points
	 */

	public int getPoints()
	{
		return this.points;
	}
	
	/**
	 * Returns an unserialized representation of this object
	 * 
	 * @return The unserialized representatiuon of this object
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append(this.getClass());
		sb.append(" this.getRollValue()= ").append(this.getRollValue());
		sb.append(" this.getPoints()= ").append(this.getPoints());
		return sb.toString();
	}// close toString

}// close class

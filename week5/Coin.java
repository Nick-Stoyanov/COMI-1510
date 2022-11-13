/**
 * This program simulates the toss of a coin
 */
package chapter6;

import java.util.Random;

/**
 * 6.17 Coins
 * 
 * This progran simulates the tossing of a coin. An initial state of the coin is
 * established with the default constructor. The toss() method is used to toss
 * the coin again.
 * 
 * @author Nikolay Stoyanov Nov 12, 2022
 */
public class Coin
{

	/**
	 *  Initiate variable to hold 1 or 0 as a value
	 */
	private int value;

	/**
	 *  Hold heads or tails value for the coin
	 */
	private String sideUp;

	/**
	 *  Create a new random object
	 */
	Random rand = new Random();

	/**
	 * No-arg constructor to set the initial value of the coin
	 */
	public Coin()
	{
		int initialValue = rand.nextInt(2);
		if (initialValue == 0)
		{
			sideUp = "tails";
		} else
		{
			sideUp = "heads";
		}
	}

	/**
	 * Method tosses the coin and assigns heads or tails to sideUp
	 */
	public void toss()
	{

		value = rand.nextInt(2);

		if (value == 0)
		{
			sideUp = "tails";
		} else
		{
			sideUp = "heads";
		}
	}

	/**
	 * Return the value of sideUp
	 * 
	 * @return heads or tails
	 */
	public String getSideUp()
	{
		return sideUp;
	}

}

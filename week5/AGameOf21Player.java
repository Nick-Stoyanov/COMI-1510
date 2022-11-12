/**
 * 
 */
package chapter6;

/**
 * @author Nikolay Stoyanov Nov 10, 2022
 */
public class AGameOf21Player
{
	private int points = 0;

	public AGameOf21Player()
	{
		this(0);
	}

	/**
	 * @param userScore user score
	 */
	public AGameOf21Player(int points)
	{
		super();
	}

	public int getRollValue()
	{

		Die die = new Die(6);

		int roll1Value = die.getValue();

		int roll2Value = die.getSides();

		return roll1Value + roll2Value;
	}

	public void setPoints(int newPoints)
	{
		points = newPoints;
	}

	public int getPoints()
	{
		return this.points;
	}

}

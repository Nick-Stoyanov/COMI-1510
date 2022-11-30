/**
 * Tests the die
 */
package chapter6;

/**
 * Test the die.
 * 
 * @author dean grammas
 *
 */
public class DieTest
{
	/**
	 * Default constructor
	 */
	public DieTest()
	{
		super();
	}

	/**
	 * Rolls the die 10 times
	 * 
	 * @param die - the die to test
	 * @param str - the string to show
	 * 
	 * @return - results of the roll
	 */
	private static String rollDie(Die die, String str)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++)
		{
			die.roll();
			sb.append(" i= ").append(i).append(str).append(die.toString()).append("\n");
		}
		sb.append("\n");
		return sb.toString();
	}

	/**
	 * Tests the Die
	 * 
	 * @param args - ignored
	 */
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		Die die = null;

		die = new Die(6);
		sb.append(rollDie(die, " Die(6): "));

		die = new Die(6, true);
		sb.append(rollDie(die, " Die(6, true): "));

		die = new Die(6, false);
		sb.append(rollDie(die, " Die(6, false): "));

		System.out.println(sb.toString());
	} // end main

} // end class

/**
 * Test for CircleList
 */
package chapter7;
import javax.swing.JOptionPane;

/**
 * This class tests the Circle List with different sizes
 * @author Nikolay Stoyanov Nov 19, 2022
 */
public class CircleListTest
{

	/**
	 * Default constructor
	 */
	public CircleListTest()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Main method tests the lists
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Display greeting message
		JOptionPane.showMessageDialog(null, "Hello Nick. This is your circle metrics program.\nHopefully this helps with your hotdog sales and quantum physics studies.\nEnjoy!");
		
		// Create and test List with max size of 6
		CircleList listOne = new CircleList(6);
		StringBuilder sb1 = new StringBuilder(listOne.toString());
		System.out.println(sb1);
		listOne.getMetrics();
		
		
		// Create and test List with max size of 600
		CircleList listTwo = new CircleList(600);
		StringBuilder sb2 = new StringBuilder(listTwo.toString());
		System.out.println(sb2);
		listTwo.getMetrics();
		
		// Create and test List with max size of 6000
		CircleList listThree = new CircleList(6000);
		StringBuilder sb3 = new StringBuilder(listThree.toString());
		System.out.println(sb3);
		listThree.getMetrics();
		
	}

}

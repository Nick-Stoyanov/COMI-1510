/**
 * 
 */
package chapter7;

/**
 * @author Nikolay Stoyanov Nov 19, 2022
 */
public class CircleListTest
{

	public static void main(String[] args)
	{
		CircleList listOne = new CircleList(6);
		listOne.getList();
		listOne.getSortedList();
		listOne.getArray();
		listOne.getSortedArray();
		listOne.getListMin();
		listOne.getListMax();
		listOne.getArrayMin();
		listOne.getArrayMax();
		
		CircleList listTwo = new CircleList(60);
		listTwo.getList();
		listTwo.getSortedList();
		listTwo.getArray();
		listTwo.getSortedArray();
		listTwo.getListMin();
		listTwo.getListMax();
		listTwo.getArrayMin();
		listTwo.getArrayMax();

	}

}

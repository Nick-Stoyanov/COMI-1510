/**
 * 
 */
package chapter7;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Nikolay Stoyanov Nov 19, 2022
 */
public class CircleList
{
	Random rand = new Random();

	private Circle[] array = null;
	private Circle[] sortedArray = null;

	public ArrayList<Circle> list = new ArrayList<Circle>();
	public ArrayList<Circle> sortedList = new ArrayList<Circle>();

	/**
	 * Constructor creates Array and List
	 * 
	 * @param max max size of list
	 */
	public CircleList(int max)
	{

		int maxSize = max;

		int listSize = rand.nextInt(maxSize) + 1;
		System.out.println("List size: " + listSize);

		for (int i = 0; i < listSize; i++)
		{
			list.add(new Circle(rand.nextInt(100) + 1));
			sortedList.add(i, list.get(i));
		}

		int arraySize = rand.nextInt(maxSize) + 1;
		System.out.println("Array size: " + arraySize);
		array = new Circle[arraySize];
		sortedArray = new Circle[arraySize];
		for (int i = 0; i < arraySize; i++)
		{
			array[i] = new Circle(rand.nextInt(100) + 1);
			sortedArray[i] = array[i];
		}
		sortArray();

	}

	public void getList()
	{
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("Radius of circle " + i + " in the list: " + list.get(i).getRadius());
		}
		System.out.println("\n");
	}

	public void getArray()
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Radius of circle " + i + " in the array :" + array[i].getRadius());
		}
		System.out.println("\n");
	}

	public void sortList()
	{
		int minI;
		double minRadius;

		for (int startScan = 0; startScan < sortedList.size() - 1; startScan++)
		{
			minI = startScan;
			minRadius = sortedList.get(startScan).getRadius();
			for (int i = startScan + 1; i < sortedList.size(); i++)
			{
				if (sortedList.get(i).getRadius() < minRadius)
				{
					minRadius = sortedList.get(i).getRadius();
					minI = i;
				}
			}
			Circle temp = sortedList.get(startScan);
			sortedList.set((startScan), sortedList.get(minI));
			sortedList.set((minI), temp);

		}

	}

	public void getSortedList()
	{
		for (int i = 0; i < sortedList.size(); i++)
		{
			System.out.println("Radius of circle " + i + " in the sorted list :" + sortedList.get(i).getRadius());

		}
		System.out.println("\n");
	}

	private void sortArray()
	{
		int minI;
		double minRadius;

		for (int startScan = 0; startScan < sortedArray.length - 1; startScan++)
		{
			minI = startScan;
			minRadius = sortedArray[startScan].getRadius();
			for (int i = startScan + 1; i < sortedArray.length; i++)
			{
				if (sortedArray[i].getRadius() < minRadius)
				{
					minRadius = sortedArray[i].getRadius();
					minI = i;
				}
			}
			Circle temp = sortedArray[startScan];
			sortedArray[startScan] = sortedArray[minI];
			sortedArray[minI] = temp;
		}
	}

	public void getSortedArray()
	{
		for (int i = 0; i < sortedArray.length; i++)
		{
			System.out.println("Radius of circle " + i + " in the sorted array :" + sortedArray[i].getRadius());

		}
		System.out.println("\n");
	}

	/**
	 * Gets min radius in list
	 * 
	 * @param sortedArrayList
	 * 
	 * @return min radius
	 */
	public void getListMin()
	{
		double min = sortedList.get(0).getRadius();
		System.out.println("Min value in list: " + min);
	}

	/**
	 * Gets max radius in list
	 * 
	 * @param sortedArrayList
	 * 
	 * @return max radius
	 */
	public void getListMax()
	{
		int lastPosition = sortedList.size() - 1;
		double max = sortedList.get(lastPosition).getRadius();
		System.out.println("Max value in list: " + max);
	}

	/**
	 * Gets min radius in array
	 * 
	 * @param sortedArray
	 * 
	 * @return min radius
	 */
	public void getArrayMin()
	{
		double min = sortedArray[0].getRadius();
		System.out.println("Min value in array: " + min);
	}

	/**
	 * Gets max radius in array
	 * 
	 * @param sortedArray
	 * 
	 * @return max radius
	 */
	public void getArrayMax()
	{
		int lastPosition = sortedArray.length;
		double max = sortedArray[lastPosition - 1].getRadius();
		System.out.println("Max value in array: " + max);
	}
}

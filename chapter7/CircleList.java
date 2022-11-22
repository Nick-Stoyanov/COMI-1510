/**
 * 
 */
package chapter7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

import java.util.Comparator;

/**
 * @author Nikolay Stoyanov Nov 19, 2022
 */
public class CircleList
{
	Random rand = new Random();

	private Circle[] array = null;

	ArrayList<Circle> list = new ArrayList<Circle>();

	public CircleList(int max)
	{

		int maxSize = max;

		int listSize = rand.nextInt(maxSize + 1);
		System.out.println("List size: " + listSize);

		for (int i = 0; i < listSize; i++)
		{
			list.add(new Circle(rand.nextInt(100) + 1));
		}

		int arraySize = rand.nextInt(maxSize + 1);
		System.out.println("Array size: " + arraySize);
		// Circle array[] = new Circle[arraySize];
		array = new Circle[arraySize];
		for (int i = 0; i < arraySize; i++)
		{
			array[i] = new Circle(rand.nextInt(100) + 1);
		}
	}

	public void getList()
	{
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i).getRadius());
		}
	}

	public void getArray()
	{
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public ArrayList<Circle> getSorterArrayList()
	{
		ArrayList<Circle> sortedList = list;
		Collections.sort(sortedList, Comparator.comparing(Circle::getRadius));

		return sortedList;
	}

	public Circle[] getSortedArray()
	{
		Circle[] sortedArray = new Circle[array.length];
		for (int i = 0; i < array.length; i++)
		{
			sortedArray[i] = array[i];
		}
		int startScan;
		int i;
		int minIndex = 0;
		double minValue = 0;

		for (startScan = 0; startScan < sortedArray.length; i++)
		{
			minIndex = startScan;
			minValue = sortedArray[startScan].getRadius();
			for (i = startScan + 1; i < sortedArray.length; i++)
			{
				if (sortedArray[startScan].getRadius() < minValue)
				{
					minValue = sortedArray[startScan].getRadius();
					minIndex = i;
				}
			}
			sortedArray[minIndex] = sortedArray[startScan];
			minValue = sortedArray[startScan].getRadius();
		}
		return sortedArray;

	}

	public Double getListMin(ArrayList<Circle> sortedArray)
	{
		double min = sortedArray.get(0).getRadius();
		return min;
	}

	public Double getListMax(ArrayList<Circle> sortedList)
	{
		int lastPosition = sortedList.size() - 1;
		double max = sortedList.get(lastPosition).getRadius();
		return max;
	}

	public Double getArrayMin(Circle[] sortedArray)
	{
		double min = sortedArray[0].getRadius();
		return min;
	}

	public Double getArrayMax(Circle[] sortedArray)
	{
		int lastPosition = sortedArray.length;
		double max = sortedArray[lastPosition - 1].getRadius();
		return max;
	}
}

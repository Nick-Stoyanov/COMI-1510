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
	private int maxSize = 0;

	public CircleList(int max)
	{
		maxSize = max;
	}

	Random rand = new Random();

	public ArrayList<Circle> getArrayList()
	{
		ArrayList<Circle> list = new ArrayList<Circle>();
		for (int i = 0; i < maxSize; i++)
		{
			list.add(new Circle(rand.nextInt(100) + 1));
		}
		return list;
	}

	public Circle[] getArray()
	{
		int size = rand.nextInt(maxSize);
		System.out.println("Size: " + size);
		Circle list[] = new Circle[size];

		for (int i = 0; i < size; i++)
		{
			list[i] = new Circle(size);
		}
		return list;
	}

	public ArrayList<Circle> getSorterArrayList()
	{
		ArrayList<Circle> sortedArrayList = getArrayList();
		Collections.sort(sortedArrayList, Comparator.comparing(Circle::getRadius));

		return sortedArrayList;
	}

	public Circle[] getSortedArray()
	{
		Circle[] sortedArray = new Circle[getArray().length];
		for (int i = 0; i < getArray().length; i++)
		{
			sortedArray[i] = getArray()[i];
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
			// sortedArray[startScan].getRadius() = minValue;
		}
		return sortedArray;

	}

	public Double getArrayListMin(ArrayList<Circle> sortedArrayList)
	{
		double min = sortedArrayList.get(0).getRadius();
		return min;
	}

	public Double getArrayListMax(ArrayList<Circle> sortedArrayList)
	{
		int lastPosition = sortedArrayList.size() - 1;
		double max = sortedArrayList.get(lastPosition).getRadius();
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

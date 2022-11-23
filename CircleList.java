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
	private Circle[] sortedArray = null;

	private ArrayList<Circle> list = new ArrayList<Circle>();
	private ArrayList<Circle> sortedList = new ArrayList<Circle>();

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
		}
		list.addAll(sortedList);

		int arraySize = rand.nextInt(maxSize) + 1;
		System.out.println("Array size: " + arraySize);
		array = new Circle[arraySize];
		sortedArray = new Circle[arraySize];
		for (int i = 0; i < arraySize; i++)
		{
			array[i] = new Circle(rand.nextInt(100) + 1);
			sortedArray[i] = array[i];
		}
	}

	public void getList()
	{
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("Radius of circle " + i + " in the list: " + list.get(i).getRadius());
		}
	}

	public void getArray()
	{
		for (int i = 0; i < array.length; i++)
			System.out.println("Radius of circle " + i + " in the array :" + array[i].getRadius());
	}

	public void setSorterList()
	{
		// list.addAll(sortedList);
		// Collections.sort(sortedList, Comparator.comparing(Circle::getRadius));

		for (int i = 0; i < sortedList.size(); i++)
		{
			System.out.println(sortedList.get(i).getRadius());

		}

	}

	public void getSortedArray()
	{
		for (int i = 0; i < sortedArray.length; i++)
			System.out.println("Radius of circle " + i + " in the array :" + sortedArray[i].getRadius());
	}
	
	private void sortArray() {
		int startScan =0;
		int i =0;
		int minI = 0;
		double minRadius = 0;
		
		for (startScan =0; startScan < (sortedArray.length -1); startScan++) {
			minI = startScan;
			minRadius = sortedArray[startScan].getRadius();
			for(i = startScan +1; i< sortedArray.length;i++) {
				if (sortedArray[i].getRadius() < minRadius) {
					minRadius = sortedArray[i].getRadius();
					minI = i;
				}
			}
			sortedArray[minI].getRadius()=sortedArray[i].getRadius() ;
			minRadius = sortedArray[startScan].getRadius();
		}
	}

	/**
	 * Gets min radius in list
	 * 
	 * @param sortedArrayList
	 * 
	 * @return min radius
	 */
	public Double getListMin(ArrayList<Circle> sortedList)
	{
		double min = sortedList.get(0).getRadius();
		return min;
	}

	/**
	 * Gets max radius in list
	 * 
	 * @param sortedArrayList
	 * 
	 * @return max radius
	 */
	public Double getArrayListMax(ArrayList<Circle> sortedArrayList)
	{
		int lastPosition = sortedArrayList.size() - 1;
		double max = sortedArrayList.get(lastPosition).getRadius();
		return max;
	}

	/**
	 * Gets min radius in array
	 * 
	 * @param sortedArray
	 * 
	 * @return min radius
	 */
	public Double getArrayMin(Circle[] sortedArray)
	{
		double min = sortedArray[0].getRadius();
		return min;
	}

	/**
	 * Gets max radius in array
	 * 
	 * @param sortedArray
	 * 
	 * @return max radius
	 */
	public Double getArrayMax(Circle[] sortedArray)
	{
		int lastPosition = sortedArray.length;
		double max = sortedArray[lastPosition - 1].getRadius();
		return max;
	}
}

/**
 * This class creates a list and array of circles and performs operations on
 * them then displays results.
 */
package chapter7;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Collections;

/**
 * Creating circles and performing operations on them.
 * 
 * @author Nikolay Stoyanov Nov 19, 2022
 */
public class CircleList
{
	// Create new random object
	Random rand = new Random();

	// Instantiate new array.
	private Circle[] array = null;
	// Instantiate new array to hold sorted array.
	private Circle[] sortedArray = null;

	// Instantiate new array list
	private ArrayList<Circle> list = new ArrayList<Circle>();
	// Instantiate new array list to hold sorted array list
	private ArrayList<Circle> sortedList = new ArrayList<Circle>();

	// Instantiate metrics string builder to hold results.
	private StringBuilder metrics = new StringBuilder();

	/**
	 * Constructor creates Array and List
	 * 
	 * @param max max size of list
	 */
	public CircleList(int max)
	{

		// Declare man size of lists and append to sb
		int maxSize = max;
		metrics.append("Maximum size circles in this version: " + maxSize + "\n");

		// Create list with random size
		int listSize = rand.nextInt(maxSize) + 1;

		// Populate list
		for (int i = 0; i < listSize; i++)
		{
			list.add(new Circle(rand.nextInt(100) + 1));

		}
		// Call sort function
		sortList();

		// Create array with random size
		int arraySize = rand.nextInt(maxSize) + 1;

		// Create new array.
		array = new Circle[arraySize];
		// Create new array to hold sorted array.
		sortedArray = new Circle[arraySize];
		// Populate both arrays
		for (int i = 0; i < arraySize; i++)
		{
			array[i] = new Circle(rand.nextInt(100) + 1);
			sortedArray[i] = array[i];
		}
		// Call methods
		sortArray();
		compareLengths();
		compareMins();
		compareMaxs();
		compareAverage();

	}

	/**
	 * Method appends all toString information to sb
	 */
	public String toString()
	{

		StringBuilder sb = new StringBuilder();
		sb.append("\nArray size: " + array.length);
		sb.append("\nList size: " + list.size());
		sb.append("\n");

		for (int i = 0; i < list.size(); i++)
		{
			sb.append("Unsorted list: " + list.get(i).toString()).append("\n");

		}
		for (int i = 0; i < list.size(); i++)
		{

			sb.append("Sorted List: " + sortedList.get(i).toString()).append("\n");
		}
		for (int j = 0; j < array.length; j++)
		{
			sb.append("Unsorted array: " + array[j].toString()).append("\n");
			// sb.append("Sorted array:"+sortedArray[j].toString()).append("\n");
		}
		for (int j = 0; j < array.length; j++)
		{

			sb.append("Sorted array:" + sortedArray[j].toString()).append("\n");
		}
		ArrayList<Circle> arrayToList = new ArrayList<Circle>();
		Collections.addAll(arrayToList, array);

		for (int i = 0; i < arrayToList.size(); i++)
		{
			sb.append("Array to list conversion: " + arrayToList.get(i).toString()).append("\n");

		}
		Circle[] listToArray = list.toArray(new Circle[0]);
		for (int i = 0; i < listToArray.length; i++)
		{
			sb.append("List to array converstion: " + listToArray[i].toString()).append("\n");
		}

		sb.append("\nSmallest radius in the array is: " + sortedArray[0]);
		sb.append("\nBiggest radius in the array is: " + sortedArray[sortedArray.length - 1]);
		sb.append("\nSmallers radius in the list is: " + sortedList.get(0));
		sb.append("\nLargest Radius in the list is: " + sortedList.get(sortedList.size() - 1));

		return sb.toString();

	}

	/**
	 * Sort List of Circles
	 */
	private void sortList()
	{
		Circle zero = new Circle(101);
		ArrayList<Circle> tempList = new ArrayList<Circle>();
		for (int i = 0; i < list.size(); i++)
		{
			tempList.add(i, list.get(i));
		}
		for (int i = 0; i < tempList.size(); i++)
		{
			Circle min = tempList.get(0);
			int minIndex = 0;
			for (int j = 0; j < tempList.size(); j++)
			{
				if (tempList.get(j).getRadius() < min.getRadius())
				{
					min = list.get(j);
					minIndex = j;
				}
			}
			sortedList.add(min);

			tempList.set(minIndex, zero);
		}
	}

	/**
	 * Sort Array of Circles
	 */
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

	/**
	 * Compare the length of array and list and appends results to metrics
	 */
	public void compareLengths()
	{
		double arrayLength = array.length;
		double listLength = list.size();

		Double sizeDif = 0.0;

		if (arrayLength > listLength)
		{
			sizeDif = arrayLength / listLength;
			metrics.append(String.format("Array is longer than list by: %%%.2f", ((sizeDif * 100) - 100)));

		} else if (arrayLength < listLength)
		{

			sizeDif = listLength / arrayLength;
			metrics.append(String.format("List is longer than array by: %%%.2f", ((sizeDif * 100) - 100)));
		} else
		{
			metrics.append("List and array are the same size.");
		}

	}

	/**
	 * Compares both min values for redius and appends results to metrics.
	 */
	private void compareMins()
	{
		Double sizeDif = 0.0;
		Double listMin = sortedList.get(0).getRadius();
		Double arrayMin = sortedArray[0].getRadius();
		if (arrayMin > listMin)
		{
			sizeDif = listMin / arrayMin;
			metrics.append(String.format("\nMinimum radius in list is smaller than minimum array of list by : %%%.2f",
					(sizeDif * 100)));

		} else if (arrayMin < listMin)
		{
			sizeDif = arrayMin / listMin;
			metrics.append(String.format("\nMinimum radius is array is smaller than minimum radius of list by : %%%.2f",
					(sizeDif * 100)));
		} else
		{
			metrics.append("\nMinumum radius of both list and array are equal.");
		}
	}

	/**
	 * Compares both max values for radius and appends result to metrics.
	 */
	private void compareMaxs()
	{
		Double sizeDif = 0.0;
		Double listMax = sortedList.get(sortedList.size() - 1).getRadius();
		Double arrayMax = sortedArray[sortedArray.length - 1].getRadius();

		if (arrayMax > listMax)
		{
			sizeDif = listMax / arrayMax;
			metrics.append(String.format("\nMaximum radius in list is smaller than maximum radius in array by : %%%.2f",
					(sizeDif * 100)));
		} else if (arrayMax < listMax)
		{
			sizeDif = arrayMax / listMax;
			metrics.append(String.format("\nMaximum radius in array is smaller than maximum array in list by : %%%.2f",
					(sizeDif * 100)));
		} else
		{
			metrics.append("\nMaximum radius of both list and array are equal.");
		}
	}

	/**
	 * Compares average radius size of list and array and appends result to metrics.
	 */
	private void compareAverage()
	{
		Double sizeDif = 0.0;
		Double arrayTotal = 0.0;

		Double listTotal = 0.0;

		for (int i = 0; i < array.length; i++)
		{
			arrayTotal += array[i].getRadius();
		}
		for (int i = 0; i < list.size(); i++)
		{
			listTotal += list.get(i).getRadius();
		}

		Double arrayAverage = arrayTotal / array.length;
		Double listAverage = listTotal / list.size();

		if (arrayAverage > listAverage)
		{
			sizeDif = listAverage / arrayAverage;
			metrics.append(String.format("\nList average radius is smaller than Array average radius by: %%%.2f",
					(sizeDif * 100)));
		} else if (arrayAverage < listAverage)
		{
			sizeDif = arrayAverage / listAverage;
			metrics.append(String.format("\nArray average radius is smaller than List average radius by: %%%.2f",
					(sizeDif * 100)));
		} else
		{
			metrics.append("\nAverage radius of both List and Array are equal.");
		}

	}

	/**
	 * Displays metrics to user.
	 */
	public void getMetrics()
	{
		JOptionPane.showMessageDialog(null, metrics);
	}
}

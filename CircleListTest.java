/**
 * 
 */
package chapter7;

import java.util.ArrayList;

/**
 * @author Nikolay Stoyanov Nov 19, 2022
 */
public class CircleListTest
{
	private static CircleList getCircleList()
	{
		CircleList listOne = new CircleList(6);
		listOne.getArrayList();
		return listOne;
	}
	
	private static String testArray(CircleList circleList) {
		StringBuilder sb = new StringBuilder();
		ArrayList<Circle> circleArrayList = null;
		
		Circle circleArray[] = null;
		circleArray = circleList.getArray();
		sb.append(circleList.toString(circleArray)).append("\n");
		
	}

	public static void main(String[] args)
	{

	}

}

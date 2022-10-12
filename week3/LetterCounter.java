/**
 * Program to count characters
 * 
 */
package week3;

import javax.swing.JOptionPane;

/**
 * 4.5 Letter Counter
 * 
 * @author Nikolay Stoyanov Oct 10, 2022
 */

public class LetterCounter
{

	public static void main(String[] args)
	{
		String inputString = JOptionPane.showInputDialog("Enter a word or sentence: ");
		String letterString = JOptionPane.showInputDialog("Enter a letter: ");
		char letter = letterString.charAt(0);
		
		Integer letterCount = 0;
		char letterToEvaluate = 0;
		
		
		
		for (int i = 0; i < inputString.length(); i++)
		{
			char checkLetter = inputString.charAt(i);
			
			if (checkLetter == letter)
			
			{
				letterCount++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "The letter " + letter + " appears " + letterCount + " in your sentence.");
	
}

}

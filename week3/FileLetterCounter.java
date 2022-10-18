/**
 * program to create file and count specific letters in it
 */
package chapter4;

/**
 * 4.6 File Letter Counter
 * 
 * Write a program that asks the user to enter the name of a file, and then asks
 * the user to enter a character. The program should count and display the
 * number of times that the specified character appears in the file. Use Notepad
 * or another text editor to create a simple file that can be used to test the
 * program.
 * 
 * @author Nikolay Stoyanov Oct 12, 2022
 * 
 * 
 */

import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class FileLetterCounter
{

	/**
	 * Main method gets input and performs calculationsf
	 * 
	 * @param ignored
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{

		// Initiate variable to keep running total value
		Integer letterCount = 0;

		// Get file name
		String fileName = JOptionPane.showInputDialog("Enter name of file: ");
		File textFile = new File(fileName);

		// Validate if file exists
		while (!textFile.exists())
		{
			fileName = JOptionPane.showInputDialog("File '" + textFile + "' not found. Try again: ");
			textFile = new File(fileName);
		}

		// Get letter to search for
		String characterString = JOptionPane.showInputDialog("Enter a character: ");
		char character = characterString.charAt(0);

		// Open file for reading
		Scanner inputFile = new Scanner(textFile);

		// Loop to read each character on each like and count how many match user input
		while (inputFile.hasNext())
		{

			String line = inputFile.nextLine();
			for (int i = 0; i < line.length(); i++)
			{
				char checkLetter = line.charAt(i);

				if (checkLetter == character)
				{
					letterCount++;
				}
			}
		}

		// Close file
		inputFile.close();

		// Display results
		JOptionPane.showMessageDialog(null,
				"The character " + character + " appears " + letterCount + " times in this file.");

	}// Close main

}// Close class

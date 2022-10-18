/**
 * Program to convert content of file to uppercase
 */
package chapter4;

import java.io.File;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * 4.15 Uppercase File Conversion
 * 
 * Write a program that asks the user for the names of two files. The first file
 * should be opened for reading and the second file should be opened for
 * writing. The program should read the contents of the first file, change all
 * characters to uppercase, and store the results in the second file. The second
 * file will be a copy of the first file, except that all the characters will be
 * uppercase. Use Notepad or another text editor to create a simple file that
 * can be used to test the program.
 * 
 * 
 * @author Nikolay Stoyanov Oct 13, 2022
 */

public class UppercaseFileConverter
{

	/**
	 * Main method gets input, converts to uppercase and appends to output file
	 * 
	 * @param args ignored
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		// Get input for file to read from and validate its existence
		String fileToReadInput = JOptionPane.showInputDialog("Enter file to read from: ");
		File fileToRead = new File(fileToReadInput);

		while (!fileToRead.exists())
		{
			fileToReadInput = JOptionPane.showInputDialog("File not found. Try again: ");
			fileToRead = new File(fileToReadInput);
		}

		// Get input for file to write to and validate its existence
		String fileToWriteInput = JOptionPane.showInputDialog("File not write to: ");
		File fileToWrite = new File(fileToWriteInput);

		while (!fileToWrite.exists())
		{
			fileToWriteInput = JOptionPane.showInputDialog("File not found. Try again: ");
			fileToWrite = new File(fileToWriteInput);
		}

		// Open files for reading and writing
		Scanner readFile = new Scanner(fileToRead);
		PrintWriter writeFile = new PrintWriter(fileToWrite);

		// loop through each line, read and append as uppercase to output file
		while (readFile.hasNext())
		{
			String line = readFile.nextLine();
			writeFile.println(line.toUpperCase());

		}
		JOptionPane.showMessageDialog(null,"Done!");
		// Close files
		readFile.close();
		writeFile.close();

	}// Close main

}// Close class

/**
 * Program to calculate and dispaly award point at a bookstore 
 */
package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.16 Book Club Points
 * 
 * Serendipity Booksellers has a book club that awards points to its customers based on the number of books purchased
 * each month. The points are awarded as follows: If a customer purchases 0 books, he or she earns 0 points. If a
 * customer purchases 1 book, he or she earns 5 points. If a customer purchases 2 books, he or she earns 15 points. If a
 * customer purchases 3 books, he or she earns 30 points. If a customer purchases 4 or more books, he or she earns 60
 * points. Write a program that asks the user to enter the number of books that he or she has purchased this month and
 * then displays the number of points awarded.
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 * 
 */

public class BookClubPoints
{

    /**
     * Main method takes input,calculates and displays award point
     * 
     * @param args ignored
     */
    public static void main(String[] args)
    {
	// prompt user for input and conver it to integer
	String inputBooksPurchased = JOptionPane.showInputDialog("How many books did you buy this month?");
	Integer booksPurchased = Integer.parseInt(inputBooksPurchased);
	// initiate and declare variable
	Integer pointsEarned = 0;

	// nested if loop to run if input not zero
	if (booksPurchased != 0)
	{
	    // if else loop to detemrine points earnen
	    if (booksPurchased == 1)
	    {
		pointsEarned = 5;
	    } else if (booksPurchased == 2)
	    {
		pointsEarned = 15;
	    } else if (booksPurchased == 3)
	    {
		pointsEarned = 30;
	    } else
	    {
		pointsEarned = 60;
	    }

	}
	// Display results
	JOptionPane.showMessageDialog(null, String.format("You earned " + pointsEarned + " points this month."));
    }// close main

}// close class

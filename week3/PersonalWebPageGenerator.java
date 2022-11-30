/**
 * Program to create a personal web page
 */
package chapter4;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.awt.Desktop;

/**
 * 4.23 Personal Web Page Generator
 * 
 * Write a program that asks the user for his or her name, and then asks the user to enter a sentence that describes him
 * or herself. Here is an example of the program’s screen: Enter your name: Julie Taylor [Enter] Describe yourself: I am
 * a computer science major, a member of the Jazz club, and Once the user has entered the requested input, the program
 * should create an HTMLfile, containing the input, for a simple Web page. Here is an example of the HTMLcontent, using
 * the sample input previously shown:
 * 
 * Julie Taylor
 * 
 * I am a computer science major, a member of the Jazz club, and hope to work as a mobile; app developer after i
 * graduate.
 * 
 * 
 * 
 * 
 * 
 * @author Nikolay Stoyanov Oct 16, 2022
 */

public class PersonalWebPageGenerator
{
	/**
	 * Default constructor
	 */
	public PersonalWebPageGenerator()
	{
		super();
	}

	/**
	 * SquareTest method get input, creates and appends it to a file and opens the file.
	 * 
	 * @param args ignored
	 * 
	 * @throws IOException exceptio if file not found
	 */

	public static void main(String[] args) throws IOException
	{
		// Greeting message
		JOptionPane.showMessageDialog(null, "Hello!\nThis is your personal webpage generator.\n"
				+ "----------------------------------------------------------------");

		// Get input
		String name = JOptionPane.showInputDialog("Enter your name: ");
		String bio = JOptionPane.showInputDialog("Write a short bio: ");

		// Create webpage.html file
		PrintWriter outputFile = new PrintWriter("webpage.html");

		// Create the html file and append html and user information
		outputFile.println("<html>\r\n" + "<head>\r\n" + "</head>\r\n" + "<body>\r\n" + "<center>\r\n" + "<h1>" + name
				+ "</h1>\r\n" + "</center>\r\n" + "<hr />" + bio + "<hr />" + "</body>" + "</html>");

		// close file
		outputFile.close();

		// Open webpage in my default location. Change location based on yours.
		JOptionPane.showMessageDialog(null, "Here is your webpage!");
		File webpage = new File("C:\\Users\\Nick\\eclipse-workspace\\COMI-1510\\webpage.html");
		Desktop desktop = Desktop.getDesktop();
		desktop.open(webpage);

	}// Close main

}// Close class

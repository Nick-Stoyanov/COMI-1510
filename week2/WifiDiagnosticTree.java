/**
 * Program to troubleshooot WiFi
 */

package chapter3;

import javax.swing.JOptionPane;

/**
 * 3.16 Wi-Fi Disgnostic Tree
 * 
 * Figure 3-23 shows a simplified flowchart for troubleshooting a bad Wi-Fi connection. Use the flowchart to create a
 * program that leads a person through the steps of fixing a bad Wi-Fi connection. Here is an example of the program’s
 * output: Reboot the computer and try to connect. Did that fix the problem? no [Enter] Reboot the router and try to
 * connect. Did that fix the problem? yes [Enter] Notice that the program ends as soon as a solution is found to the
 * problem. Here is another example of the program’s output: Reboot the computer and try to connect. Did that fix the
 * problem? no [Enter] Reboot the router and try to connect. Did that fix the problem? no [Enter] Make sure the cables
 * between the router & modem are plugged in firmly. Did that fix the problem? no [Enter] Move the router to a new
 * location. Did that fix the problem? no [Enter] Get a new router.
 * 
 * 
 * 
 * @author Nikolay Stoyanov 
 * date 10/02/2022
 */

public class WifiDiagnosticTree
{

    /**
     * Main class creates input if loop to troubleshoot problems
     * 
     * @param args ignored
     */
    public static void main(String[] args)
    {
	JOptionPane.showMessageDialog(null, "Reboot the computer and try to connect.");
	String rebootComputer = JOptionPane.showInputDialog("Did that fix the problem?");

	if (rebootComputer.equals("no") || rebootComputer.equals("No"))
	{
	    JOptionPane.showMessageDialog(null, "Reboot the router and try to connect.");
	    String rebootRouter = JOptionPane.showInputDialog("Did that fix the problem?");

	    if (rebootRouter.equals("no") || rebootRouter.equals("No"))
	    {
		JOptionPane.showMessageDialog(null,
			"Make sure the cables between the router & modem are plugged in firmly.");
		String checkCables = JOptionPane.showInputDialog("Did that fix the problem?");

		if (checkCables.equals("no") || checkCables.equals("No"))
		{
		    JOptionPane.showMessageDialog(null, "Move the router to a new location and try to connect.");
		    String moveRouter = JOptionPane.showInputDialog("Did that fix the problem?");

		    if (moveRouter.equals("no") || moveRouter.equals("No"))
		    {
			JOptionPane.showMessageDialog(null, "Get a new router.");
		    }
		}

	    }
	}
	
    }// close main

}// close class

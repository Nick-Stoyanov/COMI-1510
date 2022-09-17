/**
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.10 Test Average
 * @due: 9/18/2022
 *  This program takes input for three test scores, displays them and their average
 * 
 * 
 */
package week1;
import javax.swing.JOptionPane;


public class test_average {
	
	public static void main(String[] args) {
		
		// Get purchase amount
		String InputForTest1 = JOptionPane.showInputDialog("Enter first test score: ");
				
		// Convert input to double 
		double firstScore = Double.parseDouble(InputForTest1);
		
		// Get purchase amount
		String InputForTest2 = JOptionPane.showInputDialog("Enter second test score: ");
						
		// Convert input to double 
		double secondScore = Double.parseDouble(InputForTest2);
		
		// Get purchase amount
		String InputForTest3 = JOptionPane.showInputDialog("Enter third test score: ");
						
		// Convert input to double 
		double thirdScore = Double.parseDouble(InputForTest3);
		
		int numberOfTests = 3;
		
		double averageScore = (firstScore + secondScore + thirdScore) / numberOfTests;
		
		JOptionPane.showMessageDialog(null, "Scores:" + '\n' +
											"Test 1: " + firstScore + '\n' +
											"Test 2: " + secondScore + '\n' + 
											"Test 3: " + thirdScore + '\n' +
											"Average Score: " + averageScore);			
	}

}

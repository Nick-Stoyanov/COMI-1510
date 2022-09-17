/**
 * 
 * @author Nikolay Stoyanov
 * @assignment: 2.18 Word Game
 * @due: 9/18/2022 
 * This program asks user for name, age, city name, college name, profession,
 * type of animal and a pet's name to tell a story.
 *
 */

package week1;

import javax.swing.JOptionPane;

public class word_game {
	
	/**
	 * Main method prompts user to enter information then displays a story 
	 */
	public static void main(String[] args) {
		
		
		// Get name
		String name = JOptionPane.showInputDialog("Enter your name: ");
		
		// Get age
		String age = JOptionPane.showInputDialog("Enter your age: ");
		
		// Get city name
		String cityName = JOptionPane.showInputDialog("Enter the name of a city: ");
		
		// Get college name
		String collegeName = JOptionPane.showInputDialog("Enter the name of a college: ");
		
		// Get profession
		String profession = JOptionPane.showInputDialog("Enter profession: ");
		
		// Get type of animal
		String typeOfAnimal = JOptionPane.showInputDialog("Enter type of animal: ");
		
		// Get pet name
		String petName = JOptionPane.showInputDialog("Enter pet name: ");
		
		
		// Display story
		JOptionPane.showMessageDialog(null, "There once was a person named " + name + " who lived in " + cityName +  ". "  +
											"At the age of " + age + ", " + name + " when to college at " + collegeName + ". "  +
											name + " graduated and went to work as a " + profession + ". " + '\t' +
											"Then, " + name + " adopted a(n) " + typeOfAnimal + " named " + petName + ". " +
											"They both lived happily ever after!");
	}
}

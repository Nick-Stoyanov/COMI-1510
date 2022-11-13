/**
 * Tests Savings Account
 */
package chapter6;

import javax.swing.JOptionPane;

/**
 * 6.12 Savings Account Test
 * 
 * This program tests the Savings Account class
 * 
 * @author Nikolay Stoyanov Nov 12, 2022
 */
public class SavingsAccountTest
{
	public SavingsAccountTest() {
		super();
	}
	/**
	 * Main method simulates using a savings account from the SavingsAccount class
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args)
	{
		/**
		 * Create a account object
		 */
		SavingsAccount account = new SavingsAccount();
		// Create string to hold input
		String input = null;

		// Initiate months variable
		Double months = 0.0;

		// Initiate deposit variable
		Double deposit = 0.0;

		// Initiate withdraw variable
		Double withdraw = 0.0;

		// Get input for interest rate and validate it
		input = JOptionPane.showInputDialog("Enter interest Rate: ");
		Double intRate = Double.parseDouble(input);
		while (intRate <= 0)
		{
			input = JOptionPane.showInputDialog("Enter interest rate value greaten than 0: ");
			intRate = Double.parseDouble(input);
		}

		/**
		 * Add interest rate to account
		 */
		account.setInterestRate(intRate);

		// Get input for starting balance and validate it
		input = JOptionPane.showInputDialog("Enter starting balance: ");
		Double sb = Double.parseDouble(input);
		while (sb < 0)
		{
			input = JOptionPane.showInputDialog("Negative value not allowed.\nEnter starting balance: ");
			sb = Double.parseDouble(input);
		}

		/**
		 * Add starting balance to starting balance
		 */
		account.setStartingBalance(sb);
		/**
		 * Add starting balance to current balance
		 */
		account.setCurrentBalance(sb);

		// Get input for months and validate it
		input = JOptionPane.showInputDialog("How many months has the account been open? ");
		months = Double.parseDouble(input);
		while (months <= 0)
		{
			input = JOptionPane.showInputDialog("Enter value over 0.\nHow many months has the account been open? ");
			months = Double.parseDouble(input);
		}

		// For loop iterates once per month input and calculates current account balance
		for (int i = 1; i <= months; i++)
		{

			// Get and validate deposit input
			input = JOptionPane.showInputDialog("How much did you deposit in month " + i + " :");
			deposit = Double.parseDouble(input);
			while (deposit < 0)
			{
				input = JOptionPane
						.showInputDialog("Enter value over 0.\nHow much did you deposit in month" + i + " :");
				deposit = Double.parseDouble(input);
			}
			// Add deposit to account
			account.deposit(deposit);

			// Get and validate withdraw input
			input = JOptionPane.showInputDialog("How much did you withdraw in month " + i + " :");
			withdraw = Double.parseDouble(input);
			while (withdraw < 0)
			{
				input = JOptionPane
						.showInputDialog("Enter value over 0.\nHow much did you withdraw in month " + i + " :");
				withdraw = Double.parseDouble(input);
			}

			// Validate that withdraw does not exceed account current balance
			while (account.getCurrentBalance() < withdraw)
			{
				input = JOptionPane.showInputDialog("Account balance: " + account.getCurrentBalance()
						+ "\nYou cannot withdraw more than your current balance."
						+ "\nHow much did you withdraw in month " + i + " :");
				withdraw = Double.parseDouble(input);
			}

			// Add withdraw to account
			account.withdraw(withdraw);

			// Add monthly interest
			account.addMonthlyInterest();

		}

		// Display results
		JOptionPane.showMessageDialog(null, String.format(
				"Starting balance: $%.2f\nInterest rate: %% %.2f\nTotal deposit: $%.2f\nTotal withdraws: $%.2f\nTotal interest earned: $%.2f\nCurrent balance: $%.2f",
				account.getStartingBalance(), account.getInterestRate(), account.getTotalDeposit(),
				account.getTotalWithdraw(), account.getTotalInterestEarned(), account.getCurrentBalance()));

	}

}// close class

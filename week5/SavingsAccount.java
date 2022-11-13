/**
 * 
 */
package chapter6;

/**
 * 6.12 Savings Account
 * 
 * Design a SavingsAccount class that stores a savings account’s annual interest rate and balance. The class constructor
 * should accept the amount of the savings account’s starting balance. The class should also have methods for
 * subtracting the amount of a withdrawal, adding the amount of a deposit, and adding the amount of monthly interest to
 * the balance. The monthly interest rate is the annual interest rate divided by twelve. To add the monthly interest to
 * the balance, multiply the monthly interest rate by the balance, and add the result to the balance. Test the class in
 * a program that calculates the balance of a savings account at the end of a period of time. It should ask the user for
 * the annual interest rate, the starting balance, and the number of months that have passed since the account was
 * established. A loop should then iterate once for every month, performing the following: 1. Ask the user for the
 * amount deposited into the account during the month. Use the class method to add this amount to the account balance.
 * 2. Ask the user for the amount withdrawn from the account during the month. Use the class method to subtract this
 * amount from the account balance. 3. Use the class method to calculate the monthly interest. After the last iteration,
 * the program should display the ending balance, the total amount of deposits, the total amount of withdrawals, and the
 * total interest earned.
 *
 * @author Nikolay Stoyanov Nov 8, 2022
 */
public class SavingsAccount
{
	/**
	 * Initiate variable to hold starting balance
	 */
	private double startingBalance = 0;

	/**
	 * Initiate variable to hold current balance
	 */
	private double currentBalance = 0.0;

	/**
	 * Initiate variable to hold interest rate
	 */
	private double interestRate = 0.0;

	/**
	 * Initiate variable to hold total interest earned
	 */
	private double totalInterestEarned = 0.0;

	/**
	 * Initiate variable to hold total amount of deposits
	 */
	private double totalDeposit = 0.0;

	/**
	 * Initiate variable to hold total amount of withdraws
	 */
	private double totalWithdraw = 0.0;

	/**
	 * Default constructor
	 */
	public SavingsAccount()
	{
		this(0);
	}

	/**
	 * Constructor to set starting balance
	 * 
	 * @param sb startBalance
	 */
	public SavingsAccount(double sb)
	{
		startingBalance = sb;
	}

	/**
	 * Set starting balance
	 * 
	 * @param sb User input for tarting balance
	 */
	public void setStartingBalance(double sb)
	{
		startingBalance = sb;
	}

	/**
	 * Get starting balance
	 * 
	 * @return Starting balance
	 */
	public double getStartingBalance()
	{
		return this.startingBalance;
	}

	/**
	 * Set current balance
	 * 
	 * @param cb Current balance
	 */
	public void setCurrentBalance(double cb)
	{
		currentBalance = cb;
	}

	/**
	 * Get current balance
	 * 
	 * @return Current balance
	 */
	public double getCurrentBalance()
	{
		return this.currentBalance;
	}

	/**
	 * Set interest rate
	 * 
	 * @param IntRate User input for interest rate
	 */
	public void setInterestRate(double IntRate)
	{
		interestRate = IntRate;
	}

	/**
	 * Get interest Rate
	 * 
	 * @return Interest rate
	 */
	public double getInterestRate()
	{
		return this.interestRate;
	}

	/**
	 * Get user input for deposit and add it to current balance and total deposit.
	 * 
	 * @param deposit User input for deposit amount
	 */
	public void deposit(double deposit)
	{
		currentBalance += deposit;
		totalDeposit += deposit;
	}

	/**
	 * Get total deposit amount.
	 * 
	 * @return Total deposit amount
	 */
	public double getTotalDeposit()
	{
		return this.totalDeposit;
	}

	/**
	 * Get user input for withdraw subtract it from current balance and att to total withdraw.
	 * 
	 * @param withdraw withdraw amount
	 */
	public void withdraw(double withdraw)
	{
		currentBalance -= withdraw;
		totalWithdraw += withdraw;
	}

	/**
	 * Get total withdraw amount
	 * 
	 * @return Total withdraw amount
	 */
	public double getTotalWithdraw()
	{
		return this.totalWithdraw;
	}

	/**
	 * Adds monthly interest too current balance and total interest earned
	 */
	public void addMonthlyInterest()
	{
		double monthlyInterest = 0;

		// Calculate monthly interest
		monthlyInterest = (interestRate / 100) * currentBalance;

		currentBalance += monthlyInterest;
		totalInterestEarned += monthlyInterest;
	}

	/**
	 * Get toatl interest earned
	 * 
	 * @return total Interest earned
	 */
	public double getTotalInterestEarned()
	{
		return this.totalInterestEarned;
	}
	
	/**
	 * Returns an unserialized representation of this object
	 * 
	 * @return The unserialized representatiuon of this object
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append(this.getClass());
		sb.append(" this.getStartingBalance()= ").append(this.getStartingBalance());
		sb.append(" this.getCurrentbalance()= ").append(this.getCurrentBalance());
		sb.append(" this.getInterestRate()= ").append(this.getInterestRate());
		sb.append(" this.getGetTotalDeposit()= ").append(this.getTotalDeposit());
		sb.append(" this.getGetTotalWithdraw()= ").append(this.getTotalWithdraw());
		sb.append(" this.getGetTotalInterestEarned()= ").append(this.getTotalInterestEarned());

		return sb.toString();
	}// close toString
}// close class

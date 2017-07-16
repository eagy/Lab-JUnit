package core;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private int accountType;
	
	/**
	 * Default constructor
	 * Sets accountNumber to "none", accountHolder to "Unknown", balance to 0.00, and accountType to 0. 
	 */
	public BankAccount() {
		this("none", "Unknown", 0.00, 0);
	}
	
	/**
	 * Parameterized constructor
	 * Takes input for each data type
	 * 
	 * @param accountNumber the account number
	 * @param accountHolder the name of the account holder
	 * @param balance the opening balance
	 * @param accountType the type of account
	 */
	public BankAccount(String accountNumber, String accountHolder, double balance, int accountType) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance; 
		
		if (accountType > 0 && accountType <= 4)
			this.accountType = accountType;
		else 
			this.accountType = 0;
	}
	
	/**
	 * getAccountNumber()
	 * Returns the account number.
	 * @return the account number.
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	
	/**
	 * setAccountNumber
	 * Sets the account Number.
	 * @param accountNumber the new account number.
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * getAccountHolder
	 * Returns the account holder.
	 * @return the account holder.
	 */
	public String getAccountHolder() {
		return accountHolder;
	}
	
	/**
	 * setAccountHolder
	 * Sets the account holder.
	 * @param accountHolder the new account holder. 
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	/**
	 * getBalance()
	 * Returns the account balance. 
	 * @return the account balance. 
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * setBalance()
	 * Sets the account balance.
	 * @param balance the new account balance. 
 	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * getAccountType()
	 * returns the account type.
	 * @return the account type.
	 */
	public int getAccountType() {
		return accountType;
	}
	
	/**
	 * setAccountType()
	 * Sets the account type. 
	 * @param accountType the new account type. 
	 */
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	
	/**
	 * calculateTotalBalance()
	 * Calculates and returns the balance with interest added. 
	 * @return the balance with interest. 
	 */
	public double calculateTotalBalance() {
		return (balance + (balance*(getInterestRate()/100)));
	}
	
	/**
	 * getInterestRate()
	 * Returns the interest rate based on the accountType.
	 * @return the interest rate based on the accountType.
	 */
	public double getInterestRate() {
		switch(accountType) {
		case 1	:
			return 0.5;
		case 2	:
			return 4.5;
		case 3	:
			return 1.0;
		case 4 	:
			return 15.0;
		default :
			return 0.0;
		}
	}
	
	
}

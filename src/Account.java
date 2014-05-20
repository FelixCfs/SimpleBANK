import java.io.*;

public class Account 
{
	private double balance;
    private AccountType accountType;
	
	public Account()
	{
		balance = 0;
	}

	public Account(AccountType newAccountType)
	{
	    accountType = newAccountType;
	    balance = 0;
	 }

	 public AccountType getAccountType()
	 {
	     return accountType;
	 }
	
	public void deposit(double amount)
	{
		if(amount > 0)
			balance = balance + amount;
	 }

	public boolean withdraw(double amount)
	{
		boolean canWithdraw = true;
		if(amount > balance)
		{ 
			canWithdraw = false;
		}
		else
		{
			balance = balance - amount;
		}
		return canWithdraw;
	}

	public double getBalance()
	{
	  return balance;
	}

	public void printInfo()
	{
	    System.out.println("Balance on " + accountType + " account =  " + balance);
	}
}

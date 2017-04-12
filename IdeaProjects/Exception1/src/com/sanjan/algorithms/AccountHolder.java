package com.sanjan.algorithms;

/**
 * This class shows the Bank Account Information.
 * There are methods in this class which are used to perform the basic transactions
 * 
 * @author Yogi R Bhangdiya
 * @version 1
 * @since 09/11/2016
 * Lab: Lab 1
 * File Name: AccountHolder.java
 *
 */
public class AccountHolder 
{
	static double annualInterestRate = 0.04;
	double balance;
	double monthlyBalance;
	String monthlyInterestBalance;
/**
 * 
 * This is a parameterized constructor used to initialize the balance for an account.
 * 
 * @param balance - shows the default balance.
 */
	AccountHolder(double balance)
	{
	//test for positive validity
	this.balance = balance >=0 ? balance : null;
	this.monthlyBalance = 0;
	this.monthlyInterestBalance = "";

	}

	/**
	 * The Balance of the account is set after the holder deposits money in the account
	 * 
	 * @param deposit - the amount the holder wants to deposit in that account
	 * 				
	 */
	public void deposit(double deposit) {
		// TODO Auto-generated method stub
		this.balance= this.balance + deposit;
		
	}
	/**
	 *  The Balance of the account is changed after the holder performs withdrawal transaction on the account.
	 *  
	 *  This method checks if the holder is withdrawing the amount considering the minimum balance requirement.
	 *  
	 *  There are multiple conditions which allows the holder to withdraw only if those conditions are satisfied.
	 *  
	 *  If all the said conditions are satisfied it is only then the holder can perform withdrawal.
	 *  
	 * @param withdrawalAmount - the amount holder wants to withdraw from the account
	 *  
	 */
	public void withdrawal(double withdrawalAmount)
	{
		if (this.balance >= 500)
		{
			this.balance = (this.balance - withdrawalAmount);
			if(this.balance < 100)
			{
				System.out.println("\n The balance is of your account falling below $100. Thus we cannot proceed with the transaction ");
				this.balance = (this.balance + withdrawalAmount);
			}
			else if(this.balance < 500)
			{
				this.balance = (this.balance - 50);
				if(this.balance < 100)
				{
					System.out.println("\n The balance is of your account falling below $100. Thus we cannot proceed with the transaction ");
				 	this.balance = (this.balance + 50);
					this.balance = (this.balance + withdrawalAmount);
				}
				else
					System.out.println("\n\t\tTranscation successful");
			}
		}
		else
		{
			this.balance = (this.balance - withdrawalAmount) - 50;
			if(this.balance < 100)
			{
				System.out.println("\n The balance is of your account falling below $100. Thus we cannot proceed with the transaction ");
				this.balance = (this.balance + 50);
				this.balance = (this.balance + withdrawalAmount);
			}
			else
				System.out.println("\n\t\tTranscation successful");
		}
		
	}
	/**
	 * 
	 * This method is used to calculates the interest deposited by multiplying it with 
	 * the given interest rate.
	 * 
	 * The interest rate which is applied for first 12 months is 0.04.
	 * 
	 * New interest rate is 0.05.
	 * 
	 * Which will be used to calculate the balance with newly applied interest.
	 * 
	 */
	public void monthlyInterest()
	{
			int i;
			double newInterestRate = 0.05;
			this.monthlyBalance = this.balance;
			System.out.println("\n \t\t Monthly Balance for a year @" + (annualInterestRate * 100) + "pa");
			System.out.println("\n\t Month \t\t\t Balance");
			for( i = 1; i <= 12; i++)
			{
				this.monthlyBalance = this.monthlyBalance + (this.monthlyBalance *(annualInterestRate / 12));
				System.out.println("\n\t   " + i + "\t\t\t" + String.format("$%.2f", this.monthlyBalance));
			}

			modifyMonthlyInterest(newInterestRate);

			this.monthlyBalance = this.monthlyBalance + (this.monthlyBalance * (annualInterestRate / 12));
			System.out.println("\n New Interest Rate Applied is " + annualInterestRate * 100 + " pa");
			System.out.println("\n After Applying New Interest Rate The Account "
							+ "Balance is :" + String.format("$%.2f", this.monthlyBalance));

	}

	/**
	 * 
	 * This method updates the annual interest rate with a new interest rate.
	 * 
	 * @param newInterestRate, which is generated using Math.random function.
	 * 
	 */
	
	public void modifyMonthlyInterest(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
	}
	
	/**
	 * This method returns the balance of the account holder by rounding it 
	 * off to 2 decimal points in string format.
	 * 
	 * @return String 
	 */
	
	public String toString()
	{
		return String.format("$%.2f", this.balance);
		
	}
	
}

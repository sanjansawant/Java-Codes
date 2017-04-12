package com.sanjan.algorithms; /**
 *  This class shows the Bank Account Information.
 * There are methods in this class which are used to perform the basic transactions
 * 
 * such as updates balance, deposit money, withdraw balance, check monthly interest, update monthly interest.
 * 
 * @author Yogi R Bhangdiya
 * @version 1
 * @since 09/11/2016
 * Lab: Lab 1
 * File Name: AccountHolderTest.java
 *
 */
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AccountHolderTest {

	/**
	 * This is the main method of the AccountHolderTest.
	 * 
	 * @param args unused
	 * 
	 * @exception InputMismatchException on alphabetic input
	 * 
	 * @see InputMismatchException
	 * 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double initialBalance = 0, deposit, withdrawalAmount;
		Scanner input = null;
		int menuOption;
		try
		{
				NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
				AccountHolder accountHolder = new AccountHolder(initialBalance);
				do
				{
					//display menu
					System.out.println("\n\n\t\t\t Welcome to the Bank of IIT \n How may I assist you? \n");
					System.out.println("1. Do you want to set Initial Balance? \n ");
					System.out.println("2. Do you want to check your account balance? \n ");
					System.out.println("3. Do you want to Deposit your cash? \n");
					System.out.println("4. Do you want to Withdraw your cash? \n");
					System.out.println("5. Account Balance after applying Interest\n");
					System.out.println("6. Exit \n");
					System.out.println("Choose an option: ");
					
					input = new Scanner(System.in);
					menuOption = input.nextInt();
					switch (menuOption) 
					{
						case 1:
								//Sets initial balance
							
							 	System.out.println("\n Dear Customer, the minimum balance for this account is $500. \n If the balance in your account falls below $500 you will be \n charged $50 per transaction.");
							 	System.out.println(" \n Enter Initial Balance:");
							
							 	input = new Scanner(System.in);;			
							 	initialBalance = input.nextDouble();
							 	try
							 	{
							 		if(initialBalance >= 500)
							 		{
							 				accountHolder.balance = initialBalance;
							 				System.out.println("\n\t\tYour New Balance is:" +currencyFormat.format(initialBalance));
							 		}
							 		else
							 		 		throw new Exception("\n Invalid Account Balance. Initial account balance should be greater than $500");
							 	}
							 	catch (Exception e) 
							 	{
							 		// TODO: handle exception
							 		System.out.println(e.getMessage().toString());
							 	}
						break;
						
						case 2:
								//displays account holder balance
								System.out.println("\n Your Account Balance is " +accountHolder.toString());
						break;
						
						case 3:
								//deposit amount code snippet
								input = new Scanner(System.in);
								System.out.println("\n Enter Amount to Deposit :");
								deposit = input.nextDouble();
								try
								{
									if(deposit >= 0)
									{
									accountHolder.deposit(deposit);
									System.out.println(" \n The Amount " +currencyFormat.format(deposit)+" is deposited successfully.Your new Balance is " +accountHolder.toString());
									}
									else
										throw new Exception("\n Deposit Amount cannot be negative.!!");
								}
								catch (Exception e)
								{
									System.out.println(e.getMessage());
								}
						 
						break;
						case 4:
								//withdraw amount code snippet
								input = new Scanner(System.in);
								System.out.println("\n Enter Amount to Withdraw :");
								withdrawalAmount = input.nextDouble();
								try
								{
									if(withdrawalAmount < 1)
										throw new Exception("\n Withdrawal amount cannot be less than 1.");
									else if(withdrawalAmount >= accountHolder.balance)
										throw new Exception("\n Transaction Failure. Account Balance is less than entered withdrawal Amount.");
									else
									{
										accountHolder.withdrawal(withdrawalAmount);
										System.out.println("\n\t\tYour current balance is : " +currencyFormat.format(accountHolder.balance));				
							
									}
								}
								catch(Exception e)
								{
					  		  		System.out.println(e.getMessage());
								}
						break;
						case 5:
								//monthly interest rate calculation code snippet
								accountHolder.monthlyInterest();
						break;
						case 6:
								System.out.println("\n\t\t\tThank you for banking with IIT Bank! Have a great day!");
								String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
								System.out.println("Cur dt=" + timeStamp + "\nProgrammed by Yogesh Bhangdiya\n");
								System.exit(0);
					
						default:
								System.out.println("\n\t\t\tInvalid Choice. Thank you for banking with IIT Bank! Have a great day!");
						
					}
				}
				while(menuOption != 6);

			}
			catch(InputMismatchException inputMismatchException)
			{
					System.out.println("\n\nInvalid Input. Please enter numerics only!!");	
			}
	finally
	{
		input.close();
		System.gc();
	}
	
	}
}
	




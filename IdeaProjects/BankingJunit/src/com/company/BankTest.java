package com.company;

import org.junit.Before;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

/**
 * Created by sanja on 4/1/2017.
 */
public class BankTest {

    private Bank account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This Executes before any test cases. Count= "+ count++);
    }

    @org.junit.Before
    public void setup(){
        account=new Bank("Sanjan","Sawant",1000,Bank.CHECKING);
        System.out.println("Running a Test...");
    }

    @org.junit.Test
    public void deposit() throws Exception{
        double balance=account.deposit(200.00,true);
        assertEquals(1200.00,balance,0);

    }
    @org.junit.Test
    public void withdraw_branch() throws Exception{
        double balance=account.withdraw(600.00,true);
        assertEquals(400.00,balance);
    }


    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notbranch() throws Exception{
        account.withdraw(600.00,false);
        fail("should have thrown an illegal argument exception");

    }


    @org.junit.Test
    public void getBalance_deposit() throws Exception{
        account.deposit(200.00,true);
        assertEquals(1200.00,account.getBalance(),0);
    }


    @org.junit.Test
    public void getBalance_withdraw() throws Exception{
        account.withdraw(200.00,true);
        assertEquals(800.00,account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true(){

        assertTrue("The account is not checking account",account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This Executes after any test cases Count= "+ count++);
    }

    @org.junit.After
    public void tearDown(){
        System.out.println("Count = "+count++);
    }


}

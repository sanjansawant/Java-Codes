package com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by sanja on 4/2/2017.
 */
@RunWith(Parameterized.class)
public class BankTestParameterized {

    private Bank account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void Before(){
        account=new Bank("Sanjan","Sawant",1000.00,Bank.CHECKING);
        System.out.println("Running a test.....");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {100.00,true,1100.00},
                {200.00,true,1200.00},
                {325.14,true,1325.14},
                {489.33,true,1489.33},
                {1000.00,true,2000.00}
        });
    }

    @org.junit.Test
    public void deposit() throws Exception{
        account.deposit(amount,branch);
        assertEquals(expected,account.getBalance(),.01);
    }


}

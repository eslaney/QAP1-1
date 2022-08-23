package com.example.demo;

import org.junit.jupiter.api.Test;
import com.example.demo.Account.Account;
import org.junit.jupiter.api.Assertions;


public class AccountTest {

    @Test
    public void TestAccount()
    {
        Account accountTest = new Account(0, "Bob Pancakes", 500, true);
        Assertions.assertEquals("Bob Pancakes", accountTest.getName()); 
        Assertions.assertEquals(500, accountTest.getBalance());
        Assertions.assertTrue(true);

    }
    @Test
    public void TestDeposit()
    {
        Account accountTest = new Account(0, "Bella Goth", 1000, true);
        Assertions.assertEquals(999, accountTest.deposit(999));
        Assertions.assertEquals(1999, accountTest.getBalance());
    }

    @Test
    public void TestWithdrawal()
    {
        Account accountTest = new Account(0, "Johnny Smith", 500, true);
        Assertions.assertEquals(250, accountTest.withdraw(250));
        Assertions.assertEquals(250, accountTest.getBalance());
    }
    @Test
    public void TestDebit()
    {
        Account accountTest = new Account(0, "Liberty Lee", 0, false);
        Assertions.assertEquals(-250, accountTest.debit(250));
        Assertions.assertEquals(0, accountTest.getBalance());
        Assertions.assertFalse(true);
    }

    }


package com.example.demo.Account;

public class Account {

    private int id;
    private String name;
    private int balance;
    private boolean active;

    public Account(int id, String n, int b, boolean active)
    {
        this.id = id;
        this.name = n;
        this.balance = b;
        this.active = active;
    }
    public int getID() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }
    public int getBalance() 
    {
        return balance;
    }

    public void setBalance(int balance) 
    {
        this.balance = balance;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active) 
    {
        this.active = active;
    }

    public void cancel() 
    {
        this.active = false;
    }

    public int deposit(int amount) 
    {
        if (amount < 0) {
        System.out.println ("Cannot Deposit Negative Amount!");
        } else {
        this.balance = this.balance += amount;
            }
        return amount;
    }
    public int withdraw(int amount) 
    {
        if (amount < 0) {
        System.out.println ("Cannot Withdraw Negative Amount!");
        } else if (this.balance < amount) {
        System.out.println ("Insufficient Funds!");
        } else {
        this.balance = this.balance -= amount;
            }
        return amount;
    }
    public void transferTo(Account a, Account b, int amount) 
    {
        if (amount < 0) {
        System.out.println ("Cannot Deposit Negative Amount!");
        } else {
                b.withdraw(amount);
                a.deposit(amount);
            }
    }

    public int debit(int amount) 
    {
        if (amount < 0) {
        System.out.println ("Cannot Debit Negative Amount!");
        } else if (this.balance < amount) {
        System.out.println ("Insufficient Funds!");
            } else {
            this.balance = this.balance -= amount;
                }
        return amount;
        }

        

    public String toString() 
    {
        return "Account: \nid: " + id + " name: " + name + " balance: " + balance + "\nIs Active? " + active;
    }

    }


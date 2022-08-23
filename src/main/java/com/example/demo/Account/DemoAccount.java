package com.example.demo.Account;

public class DemoAccount {

    public static void main(String[] args) {

        
        Account a = new Account(1, "", 1000, true);
        System.out.println(a.toString());
        Account b = new Account(2, "Rosetta Tharpe", 1000, true);
        System.out.println(b.toString());
        a.deposit(1000);
        System.out.println("Credit $1000 in Account A");
        System.out.println("Balance A: " + a.getBalance());
        b.deposit(2000);
        System.out.println("Credit $2000 in Account B");
        System.out.println("Balance B: " + b.getBalance());
        a.transferTo(a, b, 1000);
        System.out.println("Transfer $1000 from Account B to Account A");
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        a.debit(100);
        System.out.println("Debit $100 from Account A");
        System.out.println("Balance A: " + a.getBalance());
        b.debit(3000);
        System.out.println("Debit 3000 from Account B");
        System.out.println("Balance B: " + b.getBalance());


    }
}


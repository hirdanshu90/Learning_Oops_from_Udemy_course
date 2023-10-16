package com.example;

// BASICS 

class BankAccount {
    private double balance = 10000;
    private String username = "basic";
    private String password = "password";

    public double getwithdrawalBalance(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return balance;

        } else
            return 0.0;
    }
}

public class app {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println(acc.getwithdrawalBalance("basic", "password"));

    }
}

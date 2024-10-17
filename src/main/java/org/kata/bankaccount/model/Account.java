package org.kata.bankaccount.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {
    private double balance;
    private List<Transaction> transactions;

    public Account() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }
    public Account(double balance, List<Transaction> transactions) {
        this.balance = balance;
        this.transactions = transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}

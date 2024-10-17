package org.kata.bankaccount.services;

import org.kata.bankaccount.model.Account;
import org.kata.bankaccount.model.OperationType;
import org.kata.bankaccount.model.Transaction;

import java.util.Date;

public class AccountServiceImpl implements AccountService{
    @Override
    public void deposit(Account account, double amount) throws Exception {
        if(amount<=0) throw new Exception("deposit amount should be greater than 0");
        double newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
        account.getTransactions().add(
                new Transaction(OperationType.DEPOSIT,new Date(),amount,newBalance)
        );
    }

    @Override
    public void withdraw(Account account, double amount) throws Exception {
        if(amount<=0 || amount>account.getBalance()) throw new Exception("insufficient balance");
        double newBalance = account.getBalance() - amount;
        account.setBalance(newBalance);
        account.getTransactions().add(
                new Transaction(OperationType.WITHDRAW,new Date(),amount,newBalance)
        );
    }
}

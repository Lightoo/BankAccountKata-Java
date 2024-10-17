package org.kata.bankaccount.services;

import org.kata.bankaccount.model.Account;

public interface AccountService {
    void deposit(Account account, double amount) throws Exception;
    void withdraw(Account account, double amount) throws Exception;
}

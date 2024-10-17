package org.kata.bankaccount.services;

import org.kata.bankaccount.model.Account;

public interface AccountService {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account, double amount);
}

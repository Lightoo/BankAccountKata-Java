package org.kata.bankaccount.services;

import org.kata.bankaccount.model.Account;

public interface StatementPrinter {
    public String print(Account account);
}

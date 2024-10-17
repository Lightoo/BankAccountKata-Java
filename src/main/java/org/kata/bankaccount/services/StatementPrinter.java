package org.kata.bankaccount.services;

import org.kata.bankaccount.model.Account;

public interface StatementPrinter {
    String print(Account account);
}

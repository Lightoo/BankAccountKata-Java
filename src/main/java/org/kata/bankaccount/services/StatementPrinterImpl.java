package org.kata.bankaccount.services;

import org.kata.bankaccount.model.Account;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class StatementPrinterImpl implements StatementPrinter {
    private static final String STATEMENT_HEADER="Operation;Date;Amount;Balance";
    private final DateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
    @Override
    public String print(Account account) {
        StringBuilder statementsBuilder = new StringBuilder(STATEMENT_HEADER);
        account.getTransactions().forEach(transaction -> statementsBuilder.append("\n")
                .append(transaction.operationType().name())
                .append(";")
                .append(DATE_FORMAT.format(transaction.date()))
                .append(";")
                .append(transaction.amount())
                .append(";")
                .append(transaction.balance()));
        return statementsBuilder.toString();
    }
}

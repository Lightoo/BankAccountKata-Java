package org.kata.bankaccount.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kata.bankaccount.model.Account;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementPrinterTest {
    private StatementPrinter statementPrinter;
    private AccountService accountService;

    @BeforeEach
    void setUp(){
        accountService = new AccountServiceImpl();
        statementPrinter = new StatementPrinterImpl();
    }
    @Test
    void print_non_empty_account_transaction() throws Exception {
        Account account = new Account();
        accountService.deposit(account,200);
        accountService.deposit(account,400);
        accountService.withdraw(account,100);
        String date= new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String expectedValue=String.format("""
                Operation;Date;Amount;Balance
                DEPOSIT;%s;200.0;200.0
                DEPOSIT;%s;400.0;600.0
                WITHDRAW;%s;100.0;500.0""",date,date,date);
        assertEquals(expectedValue,statementPrinter.print(account));

    }
    @Test
    void print_empty_account_transaction() throws Exception {
        Account account = new Account();
        String expectedValue="Operation;Date;Amount;Balance";
        assertEquals(expectedValue,statementPrinter.print(account));

    }
}

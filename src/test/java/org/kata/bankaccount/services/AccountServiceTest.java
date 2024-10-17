package org.kata.bankaccount.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kata.bankaccount.model.Account;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountServiceTest {

    private AccountService accountService;

    @BeforeEach
    void setUp(){
        accountService = new AccountServiceImpl();
    }
    @Test
    void deposit_with_positive_amount() throws Exception {
        Account account = new Account();
        accountService.deposit(account,200);
        assertEquals(200, account.getBalance());
        assertEquals(1, account.getTransactions().size());
    }
    @Test()
    void deposit_with_negative_amount() {
        Account account = new Account();
        assertThrows(Exception.class,()-> accountService.deposit(account,-200));
    }
    @Test
    void withdraw_with_sufficient_amount() throws Exception {
        Account account = new Account(2000, new ArrayList<>());
        accountService.withdraw(account,500);
        assertEquals(1500, account.getBalance());
        assertEquals(1, account.getTransactions().size());
    }
    @Test
    void withdraw_with_insufficient_amount() {
        Account account = new Account(1000, new ArrayList<>());
        assertThrows(Exception.class,()-> accountService.withdraw(account,2000));
    }
}

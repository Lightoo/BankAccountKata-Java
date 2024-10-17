package org.kata.bankaccount.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.kata.bankaccount.model.Account;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

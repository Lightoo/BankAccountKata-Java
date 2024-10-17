package org.kata.bankaccount.services;

import org.junit.jupiter.api.Test;
import org.kata.bankaccount.model.Account;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {

    private AccountService accountService;

    @Test
    void deposit_with_positive_amount() throws Exception {
        Account account = new Account(0, Collections.emptyList());
        accountService.deposit(account,200);
        assertEquals(200, account.balance());
    }
}

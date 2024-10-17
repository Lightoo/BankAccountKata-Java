package org.kata.bankaccount.model;

import java.util.List;

public record Account(double balance, List<Transaction> transactions) {
}

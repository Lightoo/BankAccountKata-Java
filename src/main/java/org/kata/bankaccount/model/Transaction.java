package org.kata.bankaccount.model;

import java.util.Date;

public record Transaction(Date date, double amount, double balance) {
}

package org.kata.bankaccount.model;

import java.util.Date;

public record Transaction(OperationType operationType, Date date, double amount, double balance) {
}

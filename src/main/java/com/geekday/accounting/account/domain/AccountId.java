package com.geekday.accounting.account.domain;


public class AccountId {
    private static int nextAccountId = 1;
    String value;

    public AccountId() {
        value = String.valueOf(nextAccountId);
        nextAccountId = nextAccountId + 1;
    }

    public String getValue() {
        return value;
    }
}

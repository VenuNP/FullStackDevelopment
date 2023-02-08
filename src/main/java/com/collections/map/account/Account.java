package com.collections.map.account;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Builder
@Setter
@Getter
public class Account implements Comparable<Account>{
    private Integer accountId;
    private String accountName;

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId);
    }

    @Override
    public int compareTo(Account account) {
        return this.accountId.compareTo(account.getAccountId());
    }
}

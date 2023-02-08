package com.collections.set.account;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AccountTreeSet {
    public static void main(String[] args) {
        Set<Account> accounts = new TreeSet<>();

        accounts.add(Account.builder().accountId(1).accountName("Srinu").build());
        accounts.add(Account.builder().accountId(2).accountName("Venu").build());
        accounts.add(Account.builder().accountId(1).accountName("Srinu").build());
        accounts.add(Account.builder().accountId(3).accountName("Akash").build());

        accounts.add(Account.builder().accountId(13).accountName("Akash N").build());

        accounts.add(Account.builder().accountId(43).accountName("Akash N").build());


        accounts.stream().forEach(System.out::println);

    }
}

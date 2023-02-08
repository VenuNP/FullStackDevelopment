package com.collections.map.account;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccountMap {
    public static void main(String[] args) {
        Map<Account,Float> accounts = new HashMap<>();

        accounts.put(Account.builder().accountId(1).accountName("Srinu").build(),1500f);
        accounts.put(Account.builder().accountId(2).accountName("Venu").build(),1100f);
        accounts.put(Account.builder().accountId(1).accountName("Srinu").build(),1200f);
        accounts.put(Account.builder().accountId(3).accountName("Akash").build(),1200f);

        accounts.put(Account.builder().accountId(13).accountName("Akash N").build(),1550f);

        accounts.put(Account.builder().accountId(43).accountName("Akash N").build(),2500f);

        accounts.keySet().stream().forEach(key -> System.out.println(key+ " --> "+accounts.get(key)));


    }
}

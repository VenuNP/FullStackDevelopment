package com.collections.set;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(15);
        set.add(10);
        set.add(20);
        set.add(16);
        set.add(15);
        set.add(null);

        set.stream().forEach(System.out::println);

        System.out.println("is Present(16)? "+set.contains(16));

        System.out.println("is Removed(16)? "+set.remove(16));

        System.out.println("is Added(10)? "+set.add(10));

        System.out.println("is Added(17)? "+set.add(17));

        System.out.println(set);

    }
}

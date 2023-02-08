package com.collections.set;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(15);
        set.add(10);
        set.add(20);
        set.add(16);
        set.add(15);

        set.stream().forEach(System.out::println);

        System.out.println("is Present(16)? "+set.contains(16));

        System.out.println("is Removed(16)? "+set.remove(16));

        System.out.println("is Added(10)? "+set.add(10));

        System.out.println("is Added(17)? "+set.add(17));

        System.out.println(set);

    }
}

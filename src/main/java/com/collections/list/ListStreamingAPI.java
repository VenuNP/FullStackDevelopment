package com.collections.list;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamingAPI {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(45);
        list.add(50);
        list.add(35);
        list.add(75);
        list.add(21);


        List<Integer> oddNumbers =
               list.stream().filter(element -> element%2 == 1)
                       .collect(Collectors.toList());

    System.out.println( "Ascending Order" +oddNumbers.stream().sorted().collect(Collectors.toList()));

    System.out.println("Descending Order" +oddNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    System.out.println("Original"+oddNumbers);

    System.out.println("Even Count =" +list.stream().filter(element -> element % 2 == 0).count());

    System.out.println(" 10 exist ? "+list.contains(10));
    }
}

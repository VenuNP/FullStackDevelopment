package com.collections.list;

import java.util.Iterator;
import java.util.List;
import  java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(null);
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);



        Iterator<Integer> iterator = list.iterator();
        System.out.println(" Iterating through iterator");
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }

        list.add(3,35);
        list.set(1,25);

        System.out.println("\n after add idx3:35 && replace idx1:25"+list);


        for(int index = 0; index < list.size() ; index++)
        {
            if(list.get(index) != null && list.get(index) == 10)
            {
                list.remove(index);
            }
        }

        System.out.println(" after remove 10 "+list);

        list.removeIf((element) -> element != null && element == 40);
        System.out.println(" after remove 40 "+list);

        System.out.println("\n Print using Streaming API ");

        list.stream().forEach(element -> System.out.print(element+ " "));

        System.out.println("\n Get Even collection ");

          List<Integer> evenList =
                  list.stream().filter((element) -> element != null && element % 2 == 0)
                .collect(Collectors.toList());
          System.out.println(evenList);
    }
}

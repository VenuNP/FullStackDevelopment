package com.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(10,"Srinu");
        map.put(12,"Venu");
        map.put(17,"Akash");
        map.put(15,"Srinu N");
        map.put(10,"Srinu NP");

        System.out.println("Iterating through Set");

        Set<Integer> set =   map.keySet();


     for(Integer key: set)
     {
         System.out.println(key + " --> "+map.get(key));
     }


        System.out.println("\nIterating through EntrySet");
    Set< Map.Entry<Integer,String> > entrySet = map.entrySet();

     for( Map.Entry<Integer,String>  me : entrySet )
     {
         System.out.println(me.getKey()+" --> "+me.getValue());
     }


        System.out.println("is Present(10)? "+map.containsKey(10));

        System.out.println("is Removed(10)? "+map.remove(10));
        System.out.println("is Present(10)? "+map.containsKey(10));



    }
}

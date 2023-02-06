package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        Queue<Integer> minHeap = new PriorityQueue<>((n1,n2) -> n1-n2);


        minHeap.add(10);
        minHeap.add(8);
        minHeap.add(11);
        minHeap.add(7);
        minHeap.add(2);
        minHeap.add(6);

        System.out.println(minHeap);
        System.out.println(" minElement [Front] --> "+minHeap.element() );

        System.out.println(" Delete minElement [Front] --> "+minHeap.poll());

        System.out.println(minHeap);

        System.out.println(" minElement [Front] --> "+minHeap.element());




    }
}

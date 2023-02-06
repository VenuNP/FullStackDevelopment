package com.collections.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();

       // The below four methods add elements at Last
        queue.add(10);
        queue.addLast(20);
        queue.offer(30);
        queue.offerLast(40);

        System.out.println(queue);

        System.out.println("add 8 at first");
        queue.addFirst(8);
        System.out.println(queue);
        System.out.println("add 6 at first");
        queue.offerFirst(6);
        System.out.println(queue);

        System.out.println(
                String.format(" getFirst --> %s getLast --> %s",
                        queue.getFirst(),queue.getLast())
                        );

        System.out.println(
                String.format(" removeFirst --> %s removeLast --> %s",
                        queue.removeFirst(),queue.removeLast())
                         );

        System.out.println("After remove First & Last"+queue);

    }
}

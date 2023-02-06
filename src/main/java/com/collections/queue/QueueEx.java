package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.offer(40);

        System.out.println(" Element in Queue --> "+queue);
        System.out.println(" Remove Front --> "+queue.poll());
        System.out.println(" Element in Queue --> "+queue);

        System.out.println(" Front --> "+queue.element());


    }
}

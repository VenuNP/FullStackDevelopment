package com.collections.stack;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println("Stack --> "+stack);
        System.out.println("peek --> "+stack.peek());
        stack.pop();
        System.out.println("after remove peek --> "+stack.peek());
        System.out.println("Stack --> "+stack);




    }
}


package com.arvind;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {

        //Stack is a class //

//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        //Queue is an interface //
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);

//        System.out.println(queue.peek());
//        System.out.println(queue.remove());

        //add and delete from the both ends
        Deque<Integer> deque = new LinkedList<>();

        deque.add(12);
        deque.addFirst(33);
        deque.remove();
        System.out.println(deque);
        //etc

    }
}
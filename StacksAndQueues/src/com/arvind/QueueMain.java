package com.arvind;

public class QueueMain {
    public static void main(String[] args) throws Exception {

        CustomQueues queue = new CustomQueues(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        System.out.println("Front Element : " + queue.front());

        queue.display();

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());




    }
}

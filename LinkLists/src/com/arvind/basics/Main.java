package com.arvind.basics;

public class Main {
    public static void main(String[] args) {

        //create the first node(head of the list)
        Node head = new Node(10);
        //Link the second node
        head.next = new Node(20);
        head.next.next = new Node(30); //link the third node
        head.next.next.next = new Node(40); //link the fourth node


        //insert the new node at the beginning of a Singly Linked List
        Node newNode = new Node(11);
        newNode.next = head;
        head = newNode;


        //insert at last
        Node endNode = new Node(12);
        endNode.next = null;


//        //Length of the nodes
//        int count = 0;
//        while(head != null) {
//            count++;
//            head = head.next; //every time check whether the head is pointing to any node or not
//            //if the head is pointing to the null then the while loop condition will be false and break the loop and return the length of the Linked list
//        }
//        System.out.println("Length :" + count);

        //Printing the nodes
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("null");
    }
}

package com.arvind.sll;

public class SinglyLinkedList {

    private Node head;

    private static class Node {
        private int data; //can be generic type
        private Node next; // Reference to the next Node in list

        public Node(int data) {
            this.data = data;
            this.next = null; // initial when there is no any element in the list
        }
    }

    // Insert at any position : assuming position to be valid and starting from 1 --> Good Shot
    public void insertCustom(int val, int position) {
        Node node = new Node(val);
        if(position == 1) {
            node.next = head;
            head = node;
        }
        else {
            Node previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            node.next = current;
            previous.next = node;

        }

    }

    public void insertLast(int val) {
        Node endNode = new Node(val);

        //check if the list is empty, if yes then add the value and simply return
        if(head == null) {
            head = endNode;
            return;
        }
        //if the list is already some values then check while null
        while(head.next != null) { //if head.next == null then break the while loop and assign the value of endNode to head.next
            head = head.next;
        }
        head.next = endNode; 
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    // display method for printing the list
    public void display() {
        while(head != null) {
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.println("null");
    }
    //length of the list node
    public int length() {
        if(head == null) {
            return 0;
        }
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();

        ssl.head = new Node(10);
        Node sec = new Node(20);
        Node third = new Node(30);

        ssl.head.next = sec;
        sec.next = third;

        //insert at first position
//        ssl.insertFirst(10);
//        ssl.insertFirst(20);
//        ssl.insertFirst(30);
//
//        //inset at last position
//        ssl.insertLast(11);
//        ssl.insertLast(33);

        ssl.insertCustom(7, 5);


        ssl.display();
    }


}

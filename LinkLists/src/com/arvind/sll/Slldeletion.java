package com.arvind.sll;

public class Slldeletion {

    private Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // initially it's pointing to null
        }
    }

    // insert at first index
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    // printing without modifying head
    public void display() {
        Node temp = head; // ✅ use a temp node, DO NOT modify head
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node deleteFirst() {
        // check whether Linked list is empty
        if (head == null) {
            return null;
        }

        Node temp = head; // store the node to return
        head = head.next; // move head
        temp.next = null; // detach the deleted node from list
        return temp; // return deleted node
    }

    public static void main(String[] args) {
        Slldeletion ssl = new Slldeletion();

        ssl.insertFirst(10);
        ssl.insertFirst(20);
        ssl.insertFirst(30);

        ssl.display(); // Before deletion

        Node deleted = ssl.deleteFirst(); // delete and store deleted node

        if (deleted != null) {
            System.out.println("Deleted Node Data: " + deleted.data);
        }

        ssl.display(); // After deletion
    }
}

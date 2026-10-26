package com.arvind.recursion;

public class BinaryTree {

    private class Node {
        int data; //Generic Type
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return String.valueOf(data); //for printing data only
        }
    }
    public Node root;

    public void createTree() {

        Node first = new Node(9);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        root = first; // root Node
        first.left = second; //second <--- first
        first.right = third; //second <--- root ---> third
        second.left = fourth;//fourth <-- second <--- root ---> third
    }

    //Recursive call
    public void preOrder(Node root) {
        //base condition
        if(root == null) {
            System.out.print(-1 + " "); //printing null node
            return;
        }
//        System.out.print(root.data + " ");
        System.out.print(root + " ");
        preOrder(root.left); //if root.left is not null then go back to the method, next method will not be executed until the node.left is null
        preOrder(root.right);
    }

}

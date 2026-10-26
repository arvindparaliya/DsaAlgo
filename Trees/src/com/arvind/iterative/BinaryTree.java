package com.arvind.iterative;

import java.util.Stack;

public class BinaryTree {

    public Node root;

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return String.valueOf(data); //for printing data only
        }

        //        @Override
//        public String toString() {
//            return "Node{" +
//                    "data=" + data +
//                    ", left=" + left +
//                    ", right=" + right +
//                    '}';
//        }
    }
    public void createTree() {
        Node first = new Node(4);
        Node second = new Node(12);
        Node third = new Node(9);
        Node forth = new Node(23);

        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
    }

    public void preOrder() {

        Stack <Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){

            Node temp = stack.pop();
            //for null data visualization
            if(temp == null){
                System.out.print(-1 + " ");
                continue;
            }
            System.out.print(temp + " ");
            stack.push(temp.right);
            stack.push(temp.left);

//            System.out.print(temp.data + " "); //temp.data for printing human-readable output otherwise override to string method
//            if(temp.right != null) {
//                stack.push(temp.right);
//            }
//            if(temp.left != null) {
//                stack.push(temp.left);
//            }

        }

    }
}

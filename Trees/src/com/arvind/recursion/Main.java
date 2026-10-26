package com.arvind.recursion;

public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.createTree();
        bt.preOrder(bt.root);
    }
}

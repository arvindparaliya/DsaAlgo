package com.arvind.paraliya;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax : <Wrapper Class>
        ArrayList<Integer> list = new ArrayList<>(3);

//        list.add(74);
//        list.add(101);
//        list.add(333);
//        list.add(10101);
//
//        System.out.println(list);
//        System.out.println(list.contains(3434));
//        list.set(0,0);
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list);

        //input
        for (int i = 0; i < 3; i++) {
            list.add(in.nextInt());
        }
//        System.out.println(list);

        //get items at any index
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(2));
            System.out.println(list);

        }
    }
}
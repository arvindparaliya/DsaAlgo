package com.arvind; //package is a identity or directions of the object

import java.util.Scanner;

public class IoClass {
    public static //static means same for all (it's fixed for all)
    void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //System.in (in means input by user)

        System.out.println("Please enter your name :");
        String s = input.next();
        System.out.println("Please enter your age :");
        int i = input.nextInt();
        System.out.println("------------------------------");

        System.out.println("Your name ang age are :" + s +"," + i);

    }
}

package com.arvind;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Arvind";
        {
//          int a = 99; //already initialised outside the block in the same method,-
                        //hence we cannot be initialised again
            a = 77; //reassign the original ref variable to some other value
            System.out.println(a);
            int c = 122;
            name = "Ankit";
            System.out.println(name); //values initialised in this block , will remain in block
        }
        int c = 900;
        System.out.println(a); //ans : 77
        System.out.println(name); //ans : Ankit
        System.out.println(c); // ans : 900; //cannot use outside the block

        //scoping for loops

        for (int i = 0; i < 4; i++) {
            int num = 90;
            a = 10000;
        }
        System.out.println();

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

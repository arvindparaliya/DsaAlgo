package com.arvind;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5);
        multiple(1,3, "Ram", "Aman" );
        demo(1);
        demo("Tom");

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

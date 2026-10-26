package com.arvind.array;

public class Array1D {
    public static void main(String [] args){

        /*

        datatype[] variable_name = new datatype[size];
        //we need to mentions the size of array
        ==OR==

        datatype [] variable_name = { , , , ,};
        //we directly put the values whatever we want to print

         */

        int [] arr = new int[3];
        /* ==> int [] arr ; =>declaration of an array (it's define in the stack)->At compile time
        ==> new int [3] ; => Initialization of an array (Heap memory) ->
        Actual memory allocation happens here , object is being created in heap memory and its called
        Dynamic memory allocation at runtime*/
        int [] arr1 = {1, 2, 3};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}

package com.arvind.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation ==>List of list so we have to create first extra list
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>()); //2D list with 3 empty rows
        }
        //add elements ==>nested loops go over each 3 rows and 3 cols
        for (int i=0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt()); //list.get(i)-> gets the inner list (rows)
                //in.nextInt()-> takes input from the user and adds it to the respective rows
            }
        }
        System.out.println(list);
    }
}

package com.arvind.paraliya;


import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation (created 3 empty inner list)
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
            //add a new arraylist in list(list of list)
        }
        /*
        list = [
            [],         //list.get(0)
            [],         //list.get(1)
            []          //list.get(2)
         */

        //add elements (nested loops) => fills each row with 3 integers (3 columns)
        for(int i=0; i<3; i++){           //for rows
            for(int j=0; j<3; j++){       //for columns
                list.get(i).add(in.nextInt());
                //list.get(i) gets the inner list (ith row)
                //in.nextInt() takes input from the user and add it to the respective row
            }
        }

        System.out.println(list);
    }
}

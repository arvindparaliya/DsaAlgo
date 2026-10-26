package com.arvind;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class LS {
    public static void main(String[] args){
        int[] arr = {2, 3, 1, 4, 4, 5};
        int target = 4;

//        System.out.println(find(arr, target, 0 ));
//        System.out.println(findIdx(arr, target, 0));
//        System.out.println(findIdxLast(arr, target, arr.length - 1));
//        findAllIdx(arr, target, 0);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIdxA(arr, target, 0, new ArrayList<>());
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllIdxA2(arr, target, 0));

    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return target == arr[index] || find(arr,target, index + 1);
    }
    static int findIdx(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIdx(arr, target, index + 1);
        }
    }
    static int findIdxLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIdxLast(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIdx(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIdx(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIdxA(int[] arr, int target, int index,  ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIdxA(arr, target, index + 1, list);
    }

    //This method create again and again new object(Arraylist), but use in some cases that's why it's important
    static ArrayList<Integer> findAllIdxA2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contains answer for that function only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls= findAllIdxA2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}

package com.arvind;

public class SearchString {
    public static void main(String[] args) {
        String name = "Arvind";
        char target = 'l';
//        boolean ans = searchChar(name, target);
//        System.out.println(ans);


    }
    static boolean searchChar2(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (char ch : str.toCharArray()) {
            if(ch == target){
                return true;
            }
        }
        return false;
    }


    static boolean searchChar(String str, char target){
//        if(str.length() == 0){
//            return false;
//        }
        //OR

        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

package com.arvind;

public class EvenDigit {
    public static void main(String[] args) {
        int [] arr = {12,345,2,6,7896};

//         int ans = findNumbers(arr);
//         System.out.println(ans);

        System.out.println(digits(-747593)); //digits method called

    }

    static int findNumbers(int [] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int digit2(int num){
        return (int)(Math.log10(num));
    }

    //count number of digits in a number
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num/10; //num /=10;
        }
        return count;
    }

}

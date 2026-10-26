package com.arvind;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        String fruit = in.next();
        //old style switch cases
//        switch (fruit) {
//            case ("Mango"):
//                System.out.println("King of all fruits");
//                break;
//            case ("Apple"):
//                System.out.println("A red sweet fruit");
//                break;
//            case ("Orange"):
//                System.out.println("It contain vitamin C and Fibers");
//                break;
//            case ("Grapes"):
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("Enter the valid Fruit name");
//                break;
//        }
        //enhance switch cases
//        switch (fruit) {
//            case ("Mango") -> System.out.println("King of all fruits");
//            case ("Apple") -> System.out.println("A red sweet fruit");
//            case ("Orange") -> System.out.println("It contain vitamin C and Fibers");
//            case ("Grapes") -> System.out.println("small fruit");
//            default -> System.out.println("Enter the valid Fruit name");
//        }

        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 7 -> System.out.println("Saturday");
//        }
//        System.out.println(day);

//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("It's week day, you cannot get a leave");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Ënjoy your weekend");
//                break;
//            default:
//                System.out.println("Invalid number, Please try again!");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("It's week day, you cannot get a leave");
            case 6, 7 -> System.out.println("Ënjoy your weekend");
            default -> System.out.println("Invalid number, Please try again!");
        }
    }


}

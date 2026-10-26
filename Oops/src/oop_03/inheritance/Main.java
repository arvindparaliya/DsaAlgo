package oop_03.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box = new Box(2);

//        Box box1 = new Box(2, 3, 4);
//        Box box2 = new Box(box1);
//
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.l + " " + box3.weight);

//        Box box2 = new BoxWeight(1, 2, 3, 4);
//         System.out.println(box2.h + " " + box2.w + box2.weight);

        //we can't access weight through parent class,
        // because it's not initialise in the parent class
        //we can only access to variables that are it the ref type

        //parent class only refers to the child class but can't access
        //hence, parent class doesn't know anything about child class
        //but child class know all about the parent class
        //here, the object itself is the parent class.
        //if we try to access child class through parent class, it will give an error

        //BoxWeight box5 = new Box(); ==> we can't do this

//        //checking of 'super' and 'this' keyword
//        BoxWeight b = new BoxWeight();
//        b.dispaly();



        BoxPrice p = new BoxPrice(2, 300);

    }
}

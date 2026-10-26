package com.arvind;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        //insert at first position
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(9);
        list.insertFirst(13);

        //insert at last position
        list.insertLast(99);

        //insert between 1st and last position
        list.insert(100, 3);

        list.display();
        list.deleteFirst();
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        System.out.println(list.find(9));
        list.display();


    }
}

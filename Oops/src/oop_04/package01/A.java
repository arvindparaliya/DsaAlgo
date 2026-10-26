package oop_04.package01;

public class A {

    private int num; //access through getters and setters methods
    protected String name; //access through subclass
              int rollNo;
    public int[] arr; //access anywhere int the world(Dangerous)

    public A(int num, String name, int rollNo) {
        this.num = num;
        this.name = name;
        this.rollNo = rollNo;
        int[] arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}

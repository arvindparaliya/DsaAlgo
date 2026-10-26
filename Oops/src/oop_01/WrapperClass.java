package oop_01;

public class WrapperClass {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer a = 10;
//        Integer b = 20;
//
//        A obj = new A();
////        obj.num = 14;
//        System.out.println(obj.num);

        final A arvind = new A("arvind");
        System.out.println(arvind);

//        swap(a, b);
//        System.out.println("a : " + a + "  " + "b : " + b);
    }
    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 12;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

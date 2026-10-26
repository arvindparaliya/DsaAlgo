package oop_03.polymorphism.compileTime;

public class Calculator {
    int l;
    int h;
    int w;

    Calculator(){

    }

    Calculator(int l, int h, int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    int add(int a, int b){
        return a + b;
    }
    //this is called method Overloading
    double add(double a, double b){
        return a + b;
    }
}

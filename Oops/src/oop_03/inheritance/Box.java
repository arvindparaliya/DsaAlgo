package oop_03.inheritance;

public class Box {
    private double l;
    double h;
    double w;

//    double weight = 1;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }


    //cube
    Box(double side){

        super(); //this class is not derived from anything. it's internally refers to Object
        //every single class inherits the object class

        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public void printInfo(){
        System.out.println("");
    }
}


package oop_03.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = 2;
    }


    BoxWeight(BoxWeight other){
        super(other);
    }

    public BoxWeight(double side){
        super(side);
    }


    public BoxWeight(double l, double h, double w, double weight) {
        //here 'super' keyword refers to the direct parent's/base's class constructor or property(variable)
        super(l, h, w); // this is call the parent class constructor
        //used to initialise values those are present in parent class
        //always initialise before subclass (child class)

        System.out.println(this.weight);
//        System.out.println(super.weight); //here 'super' keyword use for direct refers to the -
        // parent class properties or instance variable called weight

        this.weight = weight;
    }

    public void dispaly() {

        System.out.println("WeightBox Class : "+ this.weight); //refers to this class itself
//        System.out.println("Box Class : " + super.weight); //refers to direct above class(parent class)

    }
}

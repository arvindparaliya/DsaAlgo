package oop_03.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(double cost){
        super();
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double cost){
        super(side);
        this.cost = cost;
    }
}

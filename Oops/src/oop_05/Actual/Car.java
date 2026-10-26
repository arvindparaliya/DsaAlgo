package oop_05.Actual;

public class Car implements Break, Engine, Media{

    int a = 88;

    @Override
    public void stopBreak() {
        System.out.println("I break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate engine like a normal car");
    }
}

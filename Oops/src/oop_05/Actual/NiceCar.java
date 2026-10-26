package oop_05.Actual;


public class NiceCar {

    private Engine engine;
    private Media player = new CDPlayer();
    private Break sBreak = new SmartBreak();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public void stopBreak(){
        sBreak.stopBreak();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}

package src.Oops_13th_Jan.Abstraction.interfaces.realtime;

public class Car implements Engine,Break{

    void start (){
        System.out.println("Starting Engine");
        startEngine();
        breaks();
    }

    @Override
    public void startEngine(){
        System.out.println("Started engine");
    }

    @Override
    public void breaks(){
        System.out.println("Break is working fine");
    }
}


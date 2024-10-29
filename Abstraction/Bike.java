package OOPs.Abstraction;

public class Bike extends Vehicle{

    Bike(){
        super("Honda Shine");
    }


    @Override
    void start() {
        System.out.println("start my " + getName() + " bike with key !!");
    }
}

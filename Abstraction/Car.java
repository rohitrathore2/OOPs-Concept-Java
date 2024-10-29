package OOPs.Abstraction;

public class Car extends Vehicle{

    Car(){
        super("Tata");
    }

    @Override
    void start() {
        System.out.println("start the " +getName() + " car with key !");
    }
}

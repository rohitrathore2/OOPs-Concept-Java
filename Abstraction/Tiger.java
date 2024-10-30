package OOPs.Abstraction;

public class Tiger implements Animal{
    @Override
    public void eat() {
        System.out.println("Tiger can eat.");
    }

    public void run(){
        System.out.println("Tiger runs fast.");
    }
}

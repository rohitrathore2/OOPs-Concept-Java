package OOPs.Inheritance;

public class Dog extends Animal{
    Dog(){
        super(4);
    }

    @Override
    public void eat() {
        System.out.println("Dog can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog can sleep");
    }
}

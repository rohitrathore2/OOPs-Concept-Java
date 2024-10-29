package OOPs.Polymorphism;

public class Dog implements Animall{

    @Override
    public void walk() {
        System.out.println("Dog can walk");
    }

    @Override
    public void eat() {
        System.out.println("Dog can eat..");
    }

    @Override
    public void sleep() {
        System.out.println("Dog can sleep all the day..");
    }

    public static void main(String[] args) {
        Animall a = new Dog();
        a.eat();
        a.sleep();
        a.walk();
    }
}

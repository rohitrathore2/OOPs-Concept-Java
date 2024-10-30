package OOPs.Abstraction;

public class Monkey implements Animal{

    @Override
    public void eat() {
        System.out.println("Monkey eat bananas");
    }

    public void run(){
        System.out.println("Monkey can jump and run too.");
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.run();

        System.out.println("----------------------------------");

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
    }
}

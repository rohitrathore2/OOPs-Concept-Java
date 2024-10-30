package OOPs.Inheritance;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal(2);
        System.out.println("Animal has " + a.legs + " legs");
        a.eat();
        a.sleep();
        a.walk();

        System.out.println("--------------------------------------------------");


        Dog d = new Dog();
        d.walk();
        d.eat();
        d.sleep();
        System.out.println("Dog has " + d.legs + " legs");

        System.out.println("--------------------------------------------------");

        Animal c = new Cat();
        System.out.println("Cat has " + c.legs + " legs");
        c.sleep();
        c.eat();
        c.walk();





    }
}

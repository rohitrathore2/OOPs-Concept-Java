package OOPs.Polymorphism;

public class Cat extends Animal{
    @Override
    void walkk() {
        System.out.println("Cat can walkk..");
    }

    @Override
    void eatt() {
        System.out.println("Cat can eatt roti..");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.walkk();
        c.eatt();
    }
}

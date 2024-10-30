package OOPs.Inheritance;

public class Animal {
    int legs;

    Animal(int legs){
        this.legs = legs;
    }

    public void eat(){
        System.out.println("Animal can eat.");
    }

    public void sleep(){
        System.out.println("Animal can sleep.");
    }

    public void walk(){
        System.out.println("Animal can walk.");
    }
}

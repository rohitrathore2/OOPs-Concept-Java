package OOPs.Inheritance;

import org.w3c.dom.ls.LSOutput;

public class Cat extends Animal{
    Cat(){
        super(4);
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Cat can sleep");
    }

    @Override
    public void eat() {
        System.out.println("Cat can eat");
    }

}

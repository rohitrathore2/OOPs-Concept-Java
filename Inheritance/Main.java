package OOPs.Inheritance;

public class Main implements A, B {

//    @Override
//    public void printName() {
//        A.super.printName();
//    }


    @Override
    public void printName(){
        B.super.printName();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printName();
    }
}

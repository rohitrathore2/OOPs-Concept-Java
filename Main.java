package OOPs;


// Polymorphism :- Many forms.
// there are 2 types of polymorphism:-
// 1. Compile time Polymorphism / static poly. :- we can achieve it by method overloading.
// 2. Runtime Polymorphism / dynamic poly. :- we can achieve it by method overriding.
public class Main {

    //****************************************************************************
    // 1. Compile time polymorphism :-  method overloading:
    public  void show(){
        System.out.println("1");
    }


    //  below method is giving error:- java: method show() is already defined.
    // dono same naam ki method he or param bhi same he isliye ye erorr aayi.
    //    public void show(){
    //        System.out.println("2");
    //    }

    public void show(String s){
        System.out.println("2....");
        System.out.println(" hi " +s);
    }

    // main method of java ****
    public static void main(String[] args) {

        System.out.println(" Hey Rohit welcome to java");

        Main obj = new Main();
        obj.show();
        obj.show("RoEnish");

      //  obj.main(1);
    }

    // *  ------------------------------------------------------------------------
    // ??   // METHOD OVERLOADING:- lets try with changing return type

    //    private void say(){
    //        System.out.println(" I want to say something..");
    //    }
    //
    //    private int say(){
    //        System.out.println(" I want to say but i won't say ..");
    //    }

    // CONCLUSION :- we can't achieve method overloading by changing return type of method.
    // * ---------------------------------------------------------------------------------------



    // *------------------------------------------------------------------*
    // Ques. Can we overload java main() method ?

//    public static void main(int a){
//        System.out.println("yes, we can overload main method ");
//    }

    // Ans:- Yes, we can overload main() method in java.

    // *----------------------------------------------------------------------*




    // ***************************************************************************************



    // **** 2. Runtime Polymorphism :- Method Overriding.






}
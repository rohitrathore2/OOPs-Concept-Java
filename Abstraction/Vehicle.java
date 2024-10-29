package OOPs.Abstraction;

/*
Abstraction :- Abstraction is hiding internal implementation and showing only relevant information.

Abstraction can be achieved by 2 ways :-
    1. abstract class (0-100%)
    2. interface (100%)

1. Abstract class :- use keyword abstract to create a class
        eg. abstract class Vehicle

        Note :- We can not create an object of abstract class

   Ques. what is abstract method ??
   Ans:- abstract method are those method which doesn't have any body
            eg:- abstract void start();
            eg:- void start();

         Note :- if any of the method is declared as abstract , that class need to be abstract.

         Note :- But if we have abstract class, so it is not compulsion to have abstract method inside it.
                    it may have or it may not have.

         Note :- normal methods are also allowed inside abstract class.

         Note :- if any other class extends abstract class, so the implementation of all abstract method(present in abstract class)
                  is compulsory.


 */
abstract class Vehicle {
    private String name;

    Vehicle(String name){
        this.name = name;
    }


    // getter method
    public String getName(){
        return name;
    }


    abstract void start();

    void display() {
        System.out.println("calling from display method inside abstract class");
    }
}

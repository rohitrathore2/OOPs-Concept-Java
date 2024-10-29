package OOPs.Encapsulation;

public class Employee {
    /*
    Encapsulation :- Encapsulation allows us to store attribute(varibles) and behaviour(methods) together in a class. and protect them from outside world

    following are the steps to achieve Encapsulation :-
        1. declare attributes(variable) as private.
        2. provide public setter and getter method to modify and view the variable values.


     */

    // step 1. :- declate attributes(variable) as private
    private int id;
    private String name;

    // step 2 :- provide public setter and getter method to modify and view the variable values
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

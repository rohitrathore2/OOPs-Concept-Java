package OOPs.Encapsulation;
    /*
        following are the ways to achieve Encapsulation :-
            1. declare all attributes(variable) and behaviour(methods) as private
            2. provide setter and getter method to modify and view the values of attributes.
     */
public class Client {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(1);
        emp.setName("Rohit");

        System.out.println(emp.getId() + " " + emp.getName());
    }
}

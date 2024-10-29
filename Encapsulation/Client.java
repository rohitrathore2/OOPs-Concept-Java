package OOPs.Encapsulation;

public class Client {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(1);
        emp.setName("Rohit");

        System.out.println(emp.getId() + " " + emp.getName());
    }
}

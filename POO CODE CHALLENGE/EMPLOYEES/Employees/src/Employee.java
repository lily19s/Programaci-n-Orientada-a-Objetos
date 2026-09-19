
public class Employee {

    private String name;
    private double salary;

    //constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    //methods and functions
    public void showInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
        
    }
}

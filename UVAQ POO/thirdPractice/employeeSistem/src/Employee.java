import java.util.*;

public class Employee {

    protected String name;
    protected final String email;
    protected double salary;

    private static int totalEmployees = 1000;
    private static final int FINAL_NUMBER = 1000;
    private final int employeeNumber;

    static final double MINIMUM_SALARY = 8500;
    static final String COMPANY_NAME = "TechNova";
    public static final double BONUS_PERCENTAGE = 0.10;

    public Employee(String name, String email, double salary) {

        if (salary < MINIMUM_SALARY) {

            System.out.println("The salary cannot be less than the minimum salary: " + MINIMUM_SALARY);
            System.exit(19);
        }

        totalEmployees++;
        this.employeeNumber = totalEmployees;

        this.name = name;
        this.email = email;
        this.salary = salary;

    }

    // getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {

        if (salary < MINIMUM_SALARY) {

            System.out.println("The salary cannot be less than the minimum salary: " + MINIMUM_SALARY);
            System.exit(19);
        }

        this.salary = salary;
    }

    // metods & functions

    public void showInformation() {
        System.out.println("Company name:" + COMPANY_NAME);
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Employee number: " + employeeNumber);
        System.out.println("Email: " + email);
        System.out.println("Salary: $" + salary);
    
    }

    public static int getTotalEmployees() {

        return totalEmployees - FINAL_NUMBER;

    }

    public double calculateBonus() {

        return salary * BONUS_PERCENTAGE;

    }

}


public class Developer extends Employee {

    private String programmingLanguage;

    //constructor
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    //methods and functions
    public void showInformation() {
       
        System.out.println("            EMPLOYEES         ");
        System.out.println("===============================");
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Programming Language: " + getProgrammingLanguage());
        System.out.println("------------------------------");

    }

}


public class Designer extends Employee {

    private String designTool;

    //constructor
    public Designer(String name, double salary, String designTool) {
        super(name, salary);
        this.designTool = designTool;
    }

    //getters
    public String getDesignTool() {
        return designTool;
    }

    //methods and functions
    public void showInformation() {

        
        System.out.println("Name: " + getName());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Design Tool: " + getDesignTool());
        System.out.println("------------------------------");

    }

}

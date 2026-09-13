public class Designer extends Employee {

    private String primaryTool;
    private String specialty;

    // constructor
    public Designer(String name, String email, double salary, String primaryTool, String specialty) {

        super(name, email, salary);

        this.primaryTool = primaryTool;
        this.specialty = specialty;
    }

    // getters
    public String getPrimaryTool() {
        return primaryTool;
    }

    public String getSpecialty() {
        return specialty;
    }

    // setters
    public void setPrimaryTool(String primaryTool) {
        this.primaryTool = primaryTool;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

}

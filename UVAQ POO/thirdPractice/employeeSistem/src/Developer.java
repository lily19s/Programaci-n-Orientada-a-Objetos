public class Developer extends Employee {

    private String primaryLanguaje;
    private int level;

    // constructor
    public Developer(String name, String email, double salary, String primaryLanguaje, int level) {

        super(name, email, salary);

        this.primaryLanguaje = primaryLanguaje;
        this.level = level;
    }

    // getters
    public String getPrimaryLanguaje() {
        return primaryLanguaje;
    }

    public int getLevel() {
        return level;
    }

    // setters
    public void setPrimaryLanguaje(String primaryLanguaje) {
        this.primaryLanguaje = primaryLanguaje;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}

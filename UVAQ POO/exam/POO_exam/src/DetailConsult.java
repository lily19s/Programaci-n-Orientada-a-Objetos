
public class DetailConsult {

    private String reasonConsult;
    private String diagnostic;
    private static int cost;
    private static final double TAXES = 0.16;

    //constructor
    public DetailConsult(String reasonConsult, String diagnostic, int cost) {
        this.reasonConsult = reasonConsult;
        this.diagnostic = diagnostic;

        if (cost <= 0) {
            System.out.println("The cost must be greather than 0");
            this.cost = 100;
        } else {

            this.cost = cost;
        }

    }

    //getters
    public String getReasonConsult() {
        return reasonConsult;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public int getCost() {
        return cost;
    }

    public double getAddTaxes(int cost, double TAXES) {

        return cost + (cost * TAXES);
    }

    public double getAddTaxes() {
        return getAddTaxes(cost, TAXES);
    }

    //Methodas and functions
    public void showInformation() {
        System.out.println(" - reason consult: " + reasonConsult + "- " + cost);
        System.out.println("Diagnostic: " + diagnostic);
        System.out.println("Price final: $" + getAddTaxes());
    }

}

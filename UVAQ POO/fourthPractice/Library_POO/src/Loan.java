
import java.util.*;

public class Loan {

    private User user;
    private final int loanNumber;
    private static int loanCounter = 0;
    public static final int MAXIMUM_LOANDAYS = 14;
    private ArrayList<LoanDetail> details;

    //constructor
    public Loan(User user) {

        loanCounter++;
        this.loanNumber = loanCounter;
        this.user = user;
        this.details = new ArrayList<LoanDetail>();
    }

    //getters
    public User getUser() {
        return user;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public ArrayList<LoanDetail> getDetails() {
        return details;
    }

    public void addMaterial(LibraryMaterial material, int loanDays) {

        if (loanDays <= 0) {
            System.out.println("Loan days must be older than 0 days");

            loanDays = 3;
        }

        if (loanDays > MAXIMUM_LOANDAYS) {
            System.out.println("Cannot load a material for more than 14 days");
            return;
        }

        details.add(new LoanDetail(material, loanDays));
    }

    public void showInformation() {
        System.out.println("LOAN # " + loanNumber);
        System.out.println("User: " + user.getName());
        System.out.println("User number: " + user.getUserNumber());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Materials: ");
        for (LoanDetail detail : details) {
            detail.showInformation();
        }
        System.out.println("=====================================");

    }

}

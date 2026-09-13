
public class LoanDetail {

    private LibraryMaterial material;
    private int loanDays;

    //cosntructor
    LoanDetail(LibraryMaterial material, int loanDays) {
        this.material = material;
        this.loanDays = loanDays;
    }

    //getters
    public LibraryMaterial getMaterial() {
        return material;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void showInformation() {
        System.out.println(" - " + material.getTitle() + " - " + loanDays + " days");
        System.out.println("Material code: " + material.getCode());
    }

}

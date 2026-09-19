
public class BankAccount {

    private final String owner;
    private double balance;
    private final int number;

    private static int accountNumber = 1000;

    //constructor
    public BankAccount(String owner, int number, double balance) {

        accountNumber++;
        this.number = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    //getters
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

//methods and functions
    public void makeDeposit(double deposit) {

        balance = balance + deposit;
    }

    public void makeWithdraw(double withdraw) {
        balance = balance - withdraw;
    }

    public void getShowInformation() {

        System.out.println("BANK ACCOUNT");
        System.out.println("---------------");
        System.out.println("Account: " + number);
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }

}

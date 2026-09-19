public class App {
    public static void main(String[] args) throws Exception {
        
        
        BankAccount objAccount = new BankAccount("Ana", 1001, 1000);

        objAccount.makeDeposit(500);
        objAccount.makeWithdraw(300);
        objAccount.makeDeposit(200);

        objAccount.getShowInformation();
    }
}

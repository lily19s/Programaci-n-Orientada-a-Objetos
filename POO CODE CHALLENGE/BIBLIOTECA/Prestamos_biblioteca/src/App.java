
public class App {

    public static void main(String[] args) throws Exception {

        Book objBook = new Book("The little prince", 1945, "Antoyne Sant Exauspey", 100);
        Book objBook2 = new Book("Methamorphosis", 1930, "Franz Kafka", 120);

        Magazine objMagazine = new Magazine("Vogue", "September",2025 , 2025);

        Library objLibrary = new Library("Library lle");

        objLibrary.addMaterial(objMagazine);
        objLibrary.addMaterial(objBook);
        objLibrary.addMaterial(objBook2);

        User objUser = new User("Carlos", "c545hp@gmail.com");
        User objUser2 = new User("Miguel", "mp452@gmail.com");

        Loan objLoan = new Loan(objUser);
        objLoan.addMaterial(objMagazine, 4);
        
        Loan objLoan2 = new Loan(objUser2);
        objLoan2.addMaterial(objBook, 9);

        objLoan.showInformation();
        objLoan2.showInformation();

        System.out.println("Total materials registered: " + LibraryMaterial.getTotalMaterial());

    }
}

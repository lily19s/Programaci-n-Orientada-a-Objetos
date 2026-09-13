public class App {
    public static void main(String[] args) throws Exception {

        Developer objDev1 = new Developer("Miguel", "migue23@gmail.com", 9500, "Java", 3);
        Developer objDev2 = new Developer("Juan", "juan45@gmail.com", 10000, "Python", 1);

        Designer objDes1 = new Designer("Pablo", "pablo44@gmail.com", 15000, "UI/UX", "Figma");
        Designer objDes2 = new Designer("Emma", "emma67@gmail.com", 12000, "CSM", "Payload CMS");

        objDev1.showInformation();
        System.out.println("Bonus for: $" + objDev1.calculateBonus());
        System.out.println("==========================");
        System.out.println("\n");

        objDev2.showInformation();
        System.out.println("Bonus for: $" + objDev2.calculateBonus());
        System.out.println("==========================");
        System.out.println("\n");

        objDes1.showInformation();
        System.out.println("Bonus for: $" + objDes1.calculateBonus());
        System.out.println("==========================");
        System.out.println("\n");

        objDes2.showInformation();
        System.out.println("Bonus for: $" + objDes2.calculateBonus());
        System.out.println("==========================");
        System.out.println("\n");

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }

}

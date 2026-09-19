
public class App {

    public static void main(String[] args) throws Exception {

        Product objLaptop = new Product("Laptop", 1500.0, 10);
        Product objMouse = new Product("Mouse", 500.0, 20);

        objLaptop.removeStock(2);
        objMouse.addStock(5);
        objMouse.removeStock(3);

        System.out.println("          - INVENTORY -        ");
        System.out.println("===============================");
        objLaptop.showInformation();
        objMouse.showInformation();
        System.out.println("Total products:" + Product.totalProducts());
        System.out.println("===============================");
    }
}

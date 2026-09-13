import java.util.*;

public class App {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Store> product = new ArrayList<Store>();

    public static void main(String[] args) throws Exception {

        int opt = 0;

        while (opt != 5) {

            printMenu();

            opt = scan.nextInt();

            switch (opt) {
                case 1:

                    createProduct();

                    break;

                case 2:

                    addProduct();

                    break;

                case 3:

                    removeStock();
                    break;

                case 4:
                    showStock();

                    break;

                case 5:

                    System.out.println("Thanks for use this program!");
                    break;

                default:
                    System.out.println("Sorry, this option is not available");
                    break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("\n========= Welcome to Store =========");
        System.out.println("Choose the option that you want to perform");
        System.out.println("1. Create a new product");
        System.out.println("2. Add product to the stock");
        System.out.println("3. Remove product from the stock");
        System.out.println("4. Get the stock quantity");
        System.out.println("5. Exit");
        System.out.println("====================================");
    }

    public static void createProduct() {

        System.out.println("Product name: ");
        String nameProduct = scan.next();
        scan.nextLine();

        System.out.println("Product Type: ");
        String productType = scan.next();
        scan.nextLine();

        System.out.println("Price product: ");
        float priceProduct = scan.nextFloat();

        Store obj = new Store(nameProduct, productType, priceProduct);

        product.add(obj);

        System.out.println(
                "Product create succesfully with ID: " + obj.getID() + " and product code: " + obj.getCodeProduct());

        System.out.println("\n");
    }

    public static void addProduct() {

        Store products = searchProduct();

        if (products != null) {
            System.out.println("How many products do yo want to add to the stock?: ");
            int stockProduct = scan.nextInt();

            int newStock = products.addProduct(stockProduct);

            if (newStock == -1) {
                System.out.println("Stock of products exceed the limit (Max: 50 units per product) ");
            } else {
                System.out.println("Product succesfully added");
                System.out.println("New stock: " + newStock);
            }

        } else {
            System.out.println("Product not found");
        }

    }

    public static void removeStock() {
        Store products = searchProduct();

        if (products != null) {
            System.out.println("How many products do yo want to remove to the stock? ");
            int stockProduct = scan.nextInt();

            int newStock = products.removeStock(stockProduct);

            if (newStock == -1) {
                System.out.println("Not enought products. ");
            } else {
                System.out.println("Product succesfully removed");
                System.out.println("New stock: " + newStock);
            }

        } else {
            System.out.println("Product not found.");
        }
    }

    public static void showStock() {
        Store products = searchProduct();

        if (products != null) {

            System.out.println("\nTotal stock: " + products.getStockProduct());
            System.out.println("Product: " + products.getNameProduct());
            System.out.println("Type of product " + products.getProductType());
            System.out.println("Code product: " + products.getCodeProduct());
            System.out.println("Price per product: $" + products.getPriceProduct());
            System.out.println("\n");

        } else {
            System.out.println("Product not found");
        }

    }

    public static Store searchProduct() {
        System.out.println("Enter the product ID: ");
        int ID = scan.nextInt();
        Store products = null;

        for (Store element : product) {
            if (element.getID() == ID) {

                products = element;
                break;

            }

        }

        return products;
    }

}

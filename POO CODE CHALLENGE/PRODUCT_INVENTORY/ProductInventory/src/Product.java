
public class Product {

    private static int ID = 100;
    private final int identifier;
    private static final int TOTAL = 100;
    private String name;
    private double price;
    private int stock;

    //constructor
    public Product(String name, double price, int stock) {
        ID++;
        this.identifier = ID;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    //getters
    public static int getID() {
        return ID;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    //methods and functions
    public void addStock(int moreStock) {
        if (moreStock > 0) {
            this.stock = this.stock + moreStock;
        }
    }

    public void removeStock(int stock) {
        if (stock > 0 && stock <= this.stock) {
            this.stock = this.stock - stock;
        }
    }

    public static int totalProducts() {
        return ID - TOTAL;
    }

    public void showInformation() {

       
        System.out.println(getIdentifier() + " - " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Stock: " + getStock());
        System.out.println("------------------------------");

    }
}

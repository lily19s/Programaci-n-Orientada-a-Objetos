public class OrderDetail {

    private Product newProduct;
    private int quantity;
    private double price;

    public OrderDetail(Product newProduct, int quantity) {

        if (quantity <= 0) {
            System.out.println("You need add products ");
            this.quantity = 0;

        } else {
            this.quantity = quantity;
        }

        this.newProduct = newProduct;
        this.price = newProduct.getPrice();

    }

    public Product getNewProduct() {
        return newProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public double calculateTotal() {

        return quantity * price;

    }

}

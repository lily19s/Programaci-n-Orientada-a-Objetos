import java.util.ArrayList;

public class Order {

    private int number;
    private Customer customer;
    private ArrayList<OrderDetail> requestedProducts;
    private double total;

    public Order(int number, Customer customer, Product newProduct, int quantity) {
        this.number = number;
        this.customer = customer;
        this.requestedProducts = new ArrayList<OrderDetail>();
        this.requestedProducts.add(new OrderDetail(newProduct, quantity));
        this.total = 0;
    }

   
    public int getNumber() {
        return number;
    }


    public Customer getCustomer() {
        return customer;
    }


    public ArrayList<OrderDetail> getRequestedProducts() {
        return requestedProducts;
    }

    public void addOrderDetail(Product product, int quantity){
        requestedProducts.add(new OrderDetail(product, quantity));
    }

    public double calculateTotal(){
    
        total = 0;
        for (OrderDetail orDetail : requestedProducts){
            total+= orDetail.calculateTotal();
        }

        return total;

    }

}

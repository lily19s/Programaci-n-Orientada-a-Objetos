public class Customer {

    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void showOrder(Order ord, Restaurant rest) {

        Customer clientOrder = ord.getCustomer();

        System.out.println("\nRestaurant: " + rest.getName());
        System.out.println("Adress: " + rest.getAddress());
        System.out.println("-----------------------");
        System.out.println("\nOrder for: " + clientOrder.getName() + "\nPhone: " + clientOrder.getPhone() + "\nOrden number: " + ord.getNumber() + "\nProduct: "  );

        for(OrderDetail detail : ord.getRequestedProducts()){
            System.out.println(detail.getNewProduct().getName()  + "(" + detail.getQuantity() + " - $" + detail.getPrice() + " c/u) = $" + detail.calculateTotal());
        }

            System.out.println("\nTotal: $" + ord.calculateTotal() + "\n=================================");
    }

}

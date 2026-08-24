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

    public void showOrder(Order ord) {

        Customer clientOrder = ord.getCustomer();

        System.out.println("Order for: " + clientOrder.getName() + "\nPhone: " + clientOrder.getPhone() + "\nOrden number: " + ord.getNumber() + "\nTotal: $" + ord.calculateTotal() + "\n=================================");
    }

}

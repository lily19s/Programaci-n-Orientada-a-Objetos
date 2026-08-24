public class App {
    public static void main(String[] args) throws Exception {

        Restaurant objRestaurant = new Restaurant("Malta fresh", "Blvrd Juan Pablo II");

        Table objTable1 = new Table(4, 3);
        Table objTable2 = new Table(5, 2);

        objRestaurant.addTable(objTable1);
        objRestaurant.addTable(objTable2);

        Product objProduct = new Product("Bowl de Quinoa", 95.7);
        Product objProduct2 = new Product("Quesadillas", 15.5);
        

        Customer objCustomer = new Customer("Betty", "354-854-79-85");
        Customer objCustomer2 = new Customer("Ophelia", "443-628-77-99");

       
        Order objOrder = new Order(5, objCustomer, objProduct, 3);
        Order objOrder2 = new Order(8, objCustomer2, objProduct2, 9);

        objCustomer.showOrder(objOrder, objRestaurant);
        objCustomer.showOrder(objOrder2, objRestaurant);
        
    }
}

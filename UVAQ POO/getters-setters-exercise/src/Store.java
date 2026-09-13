public class Store {

    private String nameProduct;
    private float priceProduct;
    private int codeProduct;
    private int stockProduct;
    private int ID;
    private String productType;
    public static int productCounter = 1;

    public Store(String nameProduct,String productType, float priceProduct) {
        this.nameProduct = nameProduct;
        this.productType = productType;
        this.priceProduct = priceProduct;
        this.stockProduct = 0;
        this.ID = Store.productCounter++;
        this.codeProduct = (int) (Math.random() * 10000000) + 1;
    }

    // Create getters and setters
    public String getNameProduct() {
        return nameProduct;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public int getStockProduct() {
        return stockProduct;
    }

    public int getID() {
        return ID;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    // Make functions
    public int addProduct(int stock) {

        if (this.stockProduct + stock > 50) {
            return -1;
        } else {
            this.stockProduct += stock;
        }
        return this.stockProduct;
    }

    public int removeStock(int stock) {

        if (stock <= this.stockProduct) {
            this.stockProduct -= stock;
        } else {
            return -1;
        }
        return this.stockProduct;
    }

}

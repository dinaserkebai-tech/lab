//14 exp


public class Product {
    private String productName;
    private String productCode;
    private double price;

    public Product(String productName, String productCode, double price) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            double discountAmount = price * (percentage / 100);
            price -= discountAmount;
            System.out.println("Discount of " + percentage + "% applied.");
        } else {
            System.out.println("Invalid discount percentage. Must be between 0 and 100.");
        }
    }
    public static void main(String[] args) {
        Product product = new Product("Wireless Mouse", "WM123", 49.99);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Price: $" + product.getPrice());

        product.applyDiscount(20); // Valid discount
        System.out.println("Price after discount: $" + product.getPrice());

        product.applyDiscount(150); // Invalid discount
    }
}
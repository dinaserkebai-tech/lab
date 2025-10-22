//8 exp


public class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
            System.out.println("Discount applied: " + percentage + "%");
        } else {
            System.out.println("Invalid discount percentage. Must be between 0 and 100.");
        }
    }
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", 29.99);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
        book.applyDiscount(15);
        System.out.println("Price after discount: $" + book.getPrice());

        book.applyDiscount(120);
    }
}

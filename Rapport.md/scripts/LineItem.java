package app.model;

public class LineItem {

    private int quantity;
    private double price;

    private Product product; // 1

    public LineItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price * quantity;
    }

    public Product getProduct() {
        return product;
    }
}

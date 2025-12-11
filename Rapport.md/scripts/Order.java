package app.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private String number;
    private Date ordered;
    private Date shipped;
    private String shipTo;
    private OrderStatus status;
    private double total;

    private List<LineItem> lineItems;  // 1..*
    private Account account;          // 1

    public Order(String number, Date ordered, String shipTo) {
        this.number = number;
        this.ordered = ordered;
        this.shipTo = shipTo;
        this.status = OrderStatus.New;
        this.lineItems = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public Date getOrdered() {
        return ordered;
    }

    public Date getShipped() {
        return shipped;
    }

    public String getShipTo() {
        return shipTo;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public double getTotal() {
        return total;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void addLineItem(LineItem item) {
        lineItems.add(item);
        total += item.getPrice();
    }

    public void ship(Date shippedDate) {
        this.shipped = shippedDate;
        this.status = OrderStatus.Shipped;
    }
}


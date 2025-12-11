package app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private String id;
    private String billingAddress;
    private boolean isClosed;
    private Date openDate;
    private Date closedDate;

    private ShoppingCart cart;         // 0..1
    private Customer customer;         // 1
    private List<Order> orders;        // 1..*
    private List<Payment> payments;    // 0..*

    public Account(String id, String billingAddress, Date openDate) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.openDate = openDate;
        this.orders = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void closeAccount(Date date) {
        this.isClosed = true;
        this.closedDate = date;
    }
}


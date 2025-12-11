package app.model;

import java.util.Date;

public class Payment {

    private String id;
    private Date paid;
    private double total;
    private String details;

    private Account account; // 0..*

    public Payment(String id, Date paid, double total, String details) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public Date getPaid() {
        return paid;
    }

    public double getTotal() {
        return total;
    }

    public String getDetails() {
        return details;
    }
}
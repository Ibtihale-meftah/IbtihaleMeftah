package app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {

    private Date created;
    private List<LineItem> items;

    public ShoppingCart(Date created) {
        this.created = created;
        this.items = new ArrayList<>();
    }

    public Date getCreated() {
        return created;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void addItem(LineItem item) {
        items.add(item);
    }
}

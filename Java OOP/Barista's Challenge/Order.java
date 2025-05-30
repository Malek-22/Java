import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // Add Item
    public void addItem(Item item) {
        this.items.add(item);
    }

    // Get statue message:
    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // Get order total:
    public double getOrderTotal() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    // Display order:
    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : this.items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }


    public String getName() {
        return this.name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

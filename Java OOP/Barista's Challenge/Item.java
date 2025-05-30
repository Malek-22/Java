public class Item {
    
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // GETTER for name:
    public String getName() {
        return name;
    }

    // SETTER for name:
    public void setName(String name) {
        this.name = name;
    }

    // GETTER for price:
    public double getPrice() {
        return price;
    }

    // SETTER for price:
    public void setPrice(double price) {
        this.price = price;
    }
}

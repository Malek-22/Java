import java.util.ArrayList;

class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}

class Order {
    private String customerName;
    private ArrayList<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayOrder() {
        System.out.println("Order for: " + customerName);
        double total = 0;
        if (items.isEmpty()) {
            System.out.println("   No items ordered.");
        } else {
            for (Item item : items) {
                System.out.printf("   %d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
                total += item.getPrice();
            }
        }
        System.out.printf("   Total: $%.2f\n", total);
    }
}

public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size());
        menu.add(newItem);
    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.printf("%d %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order newOrder = new Order(name);
        
        displayMenu();
        
        System.out.println("Please enter a menu item index or q to quit:");
        String itemInput = System.console().readLine();
        
        while (!itemInput.equals("q")) {
            try {
                int index = Integer.parseInt(itemInput);
                if (index >= 0 && index < menu.size()) {
                    Item menuItem = menu.get(index);
                    newOrder.addItem(menuItem);
                    System.out.println("Added " + menuItem.getName() + " to order.");
                } else {
                    System.out.println("Invalid index. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or q to quit.");
            }
            
            System.out.println("Please enter a menu item index or q to quit:");
            itemInput = System.console().readLine();
        }
        
        orders.add(newOrder);
        System.out.println("Order details:");
        newOrder.displayOrder();
    }

    public void addMenuItemByInput() {
        System.out.println("Enter new menu item name:");
        String itemName = System.console().readLine();
        System.out.println("Enter price for " + itemName + ":");
        String priceStr = System.console().readLine();
        try {
            double price = Double.parseDouble(priceStr);
            addMenuItem(itemName, price);
            System.out.println("Added " + itemName + " -- $" + price + " to the menu.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid price input. Menu item not added.");
        }
    }

    public void run() {
        String input = "";
        while (true) {
            System.out.println("\n--- Coffee Kiosk ---");
            System.out.println("1. New Order");
            System.out.println("2. Add Menu Item (admin)");
            System.out.println("3. Display Menu");
            System.out.println("q. Quit");
            input = System.console().readLine();
            if (input.equals("1")) {
                newOrder();
            } else if (input.equals("2")) {
                addMenuItemByInput();
            } else if (input.equals("3")) {
                displayMenu();
            } else if (input.equals("q")) {
                break;
            } else {
                System.out.println("Invalid selection, please try again.");
            }
        }
        System.out.println("Thank you for using the Coffee Kiosk!");
    }

    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();
        
        kiosk.addMenuItem("banana", 2.00);
        kiosk.addMenuItem("coffee", 1.50);
        kiosk.addMenuItem("latte", 4.50);
        kiosk.addMenuItem("capuccino", 3.00);
        kiosk.addMenuItem("muffin", 4.00);
        
        kiosk.run();
    }
}
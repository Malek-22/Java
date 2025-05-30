public class TestOrder {
    public static void main(String[] args) {
        Order orderGuest1 = new Order();
        Order orderGuest2 = new Order();

        Order orderAlice = new Order("Alice");
        Order orderBob = new Order("Bob");
        Order orderCharlie = new Order("Charlie");

        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("capuccino", 3.50);
        Item item3 = new Item("latte", 4.00);
        Item item4 = new Item("mocha", 4.50);
        Item item5 = new Item("tea", 1.25);
        Item item6 = new Item("hot chocolate", 2.75);

        orderGuest1.addItem(item1);
        orderGuest1.addItem(item3);

        orderGuest2.addItem(item2);
        orderGuest2.addItem(item6);

        orderAlice.addItem(item1);
        orderAlice.addItem(item2);
        orderAlice.addItem(item5);

        orderBob.addItem(item4);
        orderBob.addItem(item3);

        orderCharlie.addItem(item5);
        orderCharlie.addItem(item6);
        orderCharlie.addItem(item2);

        orderGuest1.setReady(true);
        orderAlice.setReady(true);

        System.out.println("Order Guest 1 Status: " + orderGuest1.getStatusMessage());
        System.out.println("Order Guest 2 Status: " + orderGuest2.getStatusMessage());
        System.out.println("Order Alice Status: " + orderAlice.getStatusMessage());
        System.out.println("Order Bob Status: " + orderBob.getStatusMessage());
        System.out.println("Order Charlie Status: " + orderCharlie.getStatusMessage());

        System.out.printf("Order Guest 1 Total: $%.2f\n", orderGuest1.getOrderTotal());
        System.out.printf("Order Guest 2 Total: $%.2f\n", orderGuest2.getOrderTotal());
        System.out.printf("Order Alice Total: $%.2f\n", orderAlice.getOrderTotal());
        System.out.printf("Order Bob Total: $%.2f\n", orderBob.getOrderTotal());
        System.out.printf("Order Charlie Total: $%.2f\n", orderCharlie.getOrderTotal());

        System.out.println("\nOrder Guest 1 Details:");
        orderGuest1.display();
        System.out.println("\nOrder Guest 2 Details:");
        orderGuest2.display();
        System.out.println("\nOrder Alice Details:");
        orderAlice.display();
        System.out.println("\nOrder Bob Details:");
        orderBob.display();
        System.out.println("\nOrder Charlie Details:");
        orderCharlie.display();
    }
}
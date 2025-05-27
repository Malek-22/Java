public class TestOrders {
    public static void main(String[] args) {

        // Create items:
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.0;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.5;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.5;

        // Create orders:
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 0.0;
        order1.ready = false;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 0.0;
        order2.ready = false;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 0.0;
        order3.ready = false;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 0.0;
        order4.ready = false;

        System.out.println("order1: " + order1);
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %.2f\n", order1.total);
        System.out.printf("Ready: %b\n", order1.ready);

        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += 2 * item2.price;

        order2.ready = true;

        System.out.println("\n--- Order Status ---");
        System.out.printf("Cindhuri's Order / Total: $%.2f, Ready: %b, Number of Items: %d\n",
                order1.total, order1.ready, order1.items.size());
        System.out.printf("Jimmy's Order / Total: $%.2f, Ready: %b, Number of Items: %d\n",
                order2.total, order2.ready, order2.items.size());
        System.out.printf("Noah's Order / Total: $%.2f, Ready: %b, Number of Items: %d\n",
                order3.total, order3.ready, order3.items.size());
        System.out.printf("Sam's Order / Total: $%.2f, Ready: %b, Number of Items: %d\n",
                order4.total, order4.ready, order4.items.size());
    }
}
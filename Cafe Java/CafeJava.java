public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu prices
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.5;

        // Customers
        String customer1 = "Sam";
        String customer2 = "Jimmy";
        String customer3 = "Noah";

        // Order status
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;

        // Interactions
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        if (isReadyOrder2) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (lattePrice * 2));
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
    }
}

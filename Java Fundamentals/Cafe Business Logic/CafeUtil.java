import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public int getStreakGoal() {
        return getStreakGoal(10);
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(username);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double discountedPrice = price * i - (0.5 * (i - 1));
            System.out.printf("%d - $%.2f\n", i, discountedPrice);
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

    public void addCustomers(ArrayList<String> customers) {
        System.out.println("Enter customer names one by one. Type 'q' to quit.");
        while (true) {
            String name = System.console().readLine();
            if (name.equals("q")) {
                break;
            }
            customers.add(name);
            System.out.println("Added: " + name);
        }
        System.out.println("Final customer list: " + customers);
    }
}
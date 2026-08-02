class FoodOrder {
    static int orderCount = 0;
    // Dine-in Order
    void generateBill(double price) {
        orderCount++;
        System.out.println("Dine-In Amount : " + price);
    }

    // Takeaway Order
    void generateBill(double price, boolean isTakeaway) {
        orderCount++;
        double finalAmount = price + 20;
        System.out.println("Takeaway Amount : " + finalAmount);
    }

    // Home Delivery Order
    void generateBill(double price, String location) {
        orderCount++;
        double finalAmount = price + 50;

        System.out.println("Home Delivery Amount : " + finalAmount);
        System.out.println("Location : " + location);
    }

    static void displayOrders() {
        System.out.println("Orders Processed : " + orderCount);
    }
}

public class FoodBillingSystem {

    public static void main(String[] args) {

        FoodOrder order = new FoodOrder();

        order.generateBill(450);
        order.generateBill(300, true);
        order.generateBill(650, "Hinjewadi, Pune");

        FoodOrder.displayOrders();
    }
}
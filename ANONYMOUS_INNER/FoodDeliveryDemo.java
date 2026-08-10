class FoodDelivery {
    private String customer = "mokshh";
    private String food = "pizza";
    private int price = 299;

    // Inner class
    class OrderDetails {
        void display() {
            System.out.println("customer: " + customer);
            System.out.println("food: " + food);
            System.out.println("price: Rs. " + price);
        }
    }
}

public class FoodDeliveryDemo {
    public static void main(String[] args) {
//inner Class
        FoodDelivery obj = new FoodDelivery();
        FoodDelivery.OrderDetails order = obj.new OrderDetails();
        order.display();

//anonymous class
        Runnable status = new Runnable() {
            public void run() {
                System.out.println("delivery Status-- Order is out for delivery");
            }
        };

        status.run();
    }
}
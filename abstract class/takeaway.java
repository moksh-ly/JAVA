abstract class FoodOrder {

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    void calculateBill() {
        double foodPrice = 500;
        double serviceCharge = 50;

        double total = foodPrice + serviceCharge;

        System.out.println("Dine-In Order");
        System.out.println("Total Bill: " + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    void calculateBill() {
        double foodPrice = 500;
        double packingCharge = 30;

        double total = foodPrice + packingCharge;

        System.out.println("Take-Away Order");
        System.out.println("Total Bill: " + total);
    }
}

public class takeaway {
    public static void main(String[] args) {

        FoodOrder order1 = new DineInOrder();
        order1.calculateBill();

        FoodOrder order2 = new TakeAwayOrder();
        order2.calculateBill();
    }
}
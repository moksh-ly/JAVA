abstract class FoodOrder {

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    @Override
    void calculateBill() {
        double foodPrice = 500;
        double serviceCharge = 50;

        double total = foodPrice + serviceCharge;

        System.out.println("Dine in Order");
        System.out.println("Total bill: " + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    @Override
    void calculateBill() {
        double foodPrice = 500;
        double packingCharge = 30;

        double total = foodPrice + packingCharge;

        System.out.println("Take away Order");
        System.out.println("total bill: " + total);
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {

        FoodOrder order1 = new DineInOrder();
        order1.calculateBill();

        FoodOrder order2 = new TakeAwayOrder();
        order2.calculateBill();
    }
}
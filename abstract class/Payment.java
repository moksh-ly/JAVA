abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {

    void pay(double amount) {
        System.out.println("paid " + amount + " using credit card");
    }
}

class UPI extends PaymentMethod {

    void pay(double amount) {
        System.out.println("paid " + amount + " using UPI");
    }
}

public class Payment {
    public static void main(String[] args) {

        PaymentMethod p1 = new CreditCard();
        p1.pay(1000);

        PaymentMethod p2 = new UPI();
        p2.pay(500);
    }
}
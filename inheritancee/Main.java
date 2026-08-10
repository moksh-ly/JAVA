interface Product {
    void displayDetails();
    double calculatePrice();
}

class ProductBase {
    String name;
    double price;

    ProductBase(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ElectronicProduct extends ProductBase implements Product {
    int warranty;

    ElectronicProduct(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public void displayDetails() {
        System.out.println("Electronic Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty + " years");
    }

    public double calculatePrice() {
        return price;
    }
}

class ClothingProduct extends ProductBase implements Product {
    String size;

    ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public void displayDetails() {
        System.out.println("Clothing Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
    }

    public double calculatePrice() {
        return price;
    }
}

class GroceryProduct extends ProductBase implements Product {
    double weight;

    GroceryProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public void displayDetails() {
        System.out.println("Grocery Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight + " kg");
    }

    public double calculatePrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {

        ElectronicProduct e =
            new ElectronicProduct("Laptop", 55000, 2);

        ClothingProduct c =
            new ClothingProduct("T-Shirt", 999, "L");

        GroceryProduct g =
            new GroceryProduct("Rice", 1200, 5);

        e.displayDetails();
        System.out.println("Final Price: " + e.calculatePrice());

        System.out.println();

        c.displayDetails();
        System.out.println("Final Price: " + c.calculatePrice());

        System.out.println();

        g.displayDetails();
        System.out.println("Final Price: " + g.calculatePrice());
    }
}
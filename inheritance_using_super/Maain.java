class Vehicle {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Insurance extends Vehicle {
    String insuranceType;
    int premium;

    Insurance(String vehicleNumber, String ownerName,
              String insuranceType, int premium) {

        super(vehicleNumber, ownerName);

        this.insuranceType = insuranceType;
        this.premium = premium;
    }

    void displayInsurance() {
        super.display();

        System.out.println("Insurance Type: " + insuranceType);
        System.out.println("Insurance Premium: " + premium);
    }
}

public class Maain {
    public static void main(String[] args) {

        Insurance i = new Insurance(
            "MH12AB1234",
            "Moksh",
            "Comprehensive",
            15000
        );

        i.displayInsurance();
    }
}
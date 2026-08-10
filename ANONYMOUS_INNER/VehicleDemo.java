class Vehicle {
    private String brand = "Toyota";
    private String model = "Fortuner";
    private int speed = 120;

    // Inner class
    class VehicleDetails {
        void display() {
            System.out.println("Vehicle Brand: " + brand);
            System.out.println("Vehicle Model: " + model);
            System.out.println("Vehicle Speed: " + speed + " km/h");
        }
    }
}

public class VehicleDemo{
    public static void main(String[] args) {

//inner Class
        Vehicle obj = new Vehicle();
        Vehicle.VehicleDetails details = obj.new VehicleDetails();
        details.display();

//anonymous Class
        Runnable action = new Runnable() {
            public void run() {
                System.out.println("Vehicle is moving...");
            }
        };

        action.run();
    }
}
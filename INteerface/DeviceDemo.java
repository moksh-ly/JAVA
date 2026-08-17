
interface Controllable {
    void turnOn();
}

class RoomLight implements Controllable {
    public void turnOn() {
        System.out.println("light is ON");
    }
}

class CeilingFan implements Controllable {
    public void turnOn() {
        System.out.println("fan is ON");
    }
}

public class DeviceDemo {
    public static void main(String[] args) {

        RoomLight light = new RoomLight();
        CeilingFan fan = new CeilingFan();

        light.turnOn();
        fan.turnOn();
    }
}
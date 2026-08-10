

class Shape {
    void display() {
        System.out.println("shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("area of circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("area of rectangle: " + area);
    }
}

public class ShapeApplication {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10, 4);

        c.display();
        c.calculateArea();

        System.out.println();

        r.display();
        r.calculateArea();
    }
}
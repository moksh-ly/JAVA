
abstract class shape{
    abstract void draw(); //abstract method
    void display() { //concrete method
        System.out.println("This is a shape.");
    }
}

class circle extends shape{
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class shapeabs {
    public static void main(String[] args) {
        shape s = new circle();
        s.draw();
        s.display();
    }
}

package shapes;

public class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public void area() {
        System.out.println("Area of square = " + (side * side));
    }
}
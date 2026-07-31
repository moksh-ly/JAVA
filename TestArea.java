
import area.SquareArea;
import area.RectangleArea;

public class TestArea {
    public static void main(String[] args) {
        SquareArea s = new SquareArea();
        RectangleArea r = new RectangleArea();

        s.calculate(5);
        r.calculate(10, 5);
    }
}
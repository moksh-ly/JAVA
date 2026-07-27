class mycalc {
    int num1 = 40;
    int num2 = 9;

    void add() {
        int rs = num1 + num2;
        System.out.println("Addition: " + rs);
    }

    void sub() {
        int diff = num1 - num2;
        System.out.println("Subtraction: " + difference);
    }

    void mul() {
        int product = num1 * num2;
        System.out.println("Multiplication: " + product);
    }

     void divide() {
        int div = num1 / num2;
        System.out.println("Division: " + division);
    }
}
public class Calculator{

    public static void main(String[] args) {
        MyCalc m = new MyCalc();
        m.add();
        m.sub();
        m.mul();
        m.divide();
    }
}
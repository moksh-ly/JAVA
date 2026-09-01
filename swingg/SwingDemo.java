
import javax.swing.Jframe;
import javax.swing.JLabel;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Demo");
        JLabel label = new JLabel("Hello, World!");
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
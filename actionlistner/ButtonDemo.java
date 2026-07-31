
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonDemo extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;

    public ButtonDemo() {
        button = new JButton("Click Me");
        label = new JLabel("Button not clicked yet.");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked!");
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}
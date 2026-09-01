
import java.applet.Applet;       //in viva can be public static void main but here is public void paint
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 50, 60);
    }
}



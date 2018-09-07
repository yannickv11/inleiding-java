import java.awt.*;
import java.applet.*;

public class Opdracht46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 240);
        g.fillRect(20,20,100,240);
        g.setColor(Color.red);
        g.drawOval(20, 40, 100, 50);
        g.fillOval(20,40,100,50);
        g.setColor(Color.orange);
        g.drawOval(20,120,100,50);
        g.fillOval(20,120,100,50);
        g.setColor(Color.green);
        g.drawOval(20,190,100,50);
        g.fillOval(20,190,100,50);
    }
}

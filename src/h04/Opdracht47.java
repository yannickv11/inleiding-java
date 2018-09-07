import java.awt.*;
import java.applet.*;

public class Opdracht47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.red);
        g.setColor(Color.white);
        g.drawRoundRect(20, 20, 200, 150, 10, 10);
        g.fillRoundRect(20,20,200,150,10,10);
        g.setColor(Color.black);
        g.drawOval(60, 40, 50, 50);
        g.fillOval(60,40,50,50);
        g.setColor(Color.black);
        g.drawOval(60, 100, 50, 50);
        g.fillOval(60,100,50,50);
        g.setColor(Color.black);
        g.drawOval(130, 40, 50, 50);
        g.fillOval(130,40,50,50);
        g.setColor(Color.black);
        g.drawOval(130, 100, 50, 50);
        g.fillOval(130,100,50,50);
    }
}

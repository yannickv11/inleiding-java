package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht43 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20,20,10,150);
        g.fillRect(20,20,10,150);
        g.setColor(Color.red);
        g.drawRect(20,20,75,10);
        g.fillRect(20,20,75,10);
        g.setColor(Color.white);
        g.drawRect(20,30,75,10);
        g.fillRect(20,30,75,10);
        g.setColor(Color.blue);
        g.drawRect(20,40,75,10);
        g.fillRect(20,40,75,10);
    }
}
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht45 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawOval(20, 20, 200, 100);
        g.fillOval(20,20,200,100);

    }
}
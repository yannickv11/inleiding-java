package h013;

import java.applet.Applet;
import java.awt.*;

public class opdracht132 extends Applet {


    public void init() {
        setSize(450, 420);

    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        for (int i = 0; i < 400; i += 22) {

            for (int x = 0; x < 400; x += 72) {

                g.fillRect(x, i, 70, 20);

            }
        }
    }
}



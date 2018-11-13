package h013;

import java.applet.Applet;
import java.awt.*;

public class praktijk132 extends Applet {
    int x = 10;
    int x2 = 0;
    int x3 = 10;
    int x4 = 0;



    public void init() {

    }


    public void paint (Graphics g) {

        x = 10;
        x2 = 0;
        x3 = 10;
        x4 = 0;
        for (int i = 0; i < 5; i++) {
            x += 50;
            x2 += 50;
            g.setColor(Color.black);
            g.fillRect(x, 50, 25, 50);
            g.setColor(Color.green);
            g.fillOval(x2, 5, 50, 50);

        }
        for (int i = 0; i < 5; i++) {
            x3 += 50;
            x4 += 50;
            g.setColor(Color.black);
            g.fillRect(x3, 150, 25, 50);
            g.setColor(Color.green);
            g.fillOval(x4, 105, 50, 50);

        }
    }

}

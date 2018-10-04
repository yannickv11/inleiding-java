package h011;

import java.awt.*;
import java.applet.*;


public class opdracht111 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 0;

        for(int teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x , 20, x, 100 );
            g.drawString("" + teller, x, 110 );
        }
    }
}

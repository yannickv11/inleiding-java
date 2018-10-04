package h011;

import java.awt.*;
import java.applet.*;


public class opdracht112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int y = 0;

        for( int teller = 20; teller > 10; teller--) {
            y += 20;
            g.drawString("" + teller, 10, y );


        }
    }
}
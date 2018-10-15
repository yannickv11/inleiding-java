package h011;

import java.awt.*;
import java.applet.*;


public class opdracht112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int x = 0;

        for( int teller = 20; teller > 9; teller--) {
            x += 20;
            g.drawString("" + teller, x, 20 );


        }
    }
}
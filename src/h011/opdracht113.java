package h011;

import java.awt.*;
import java.applet.*;


public class opdracht113 extends Applet {

    int eerste;
    int tweede;
    int derde;
    int x;

    public void init() {
        eerste = 1;
        tweede = 1;

    }

    public void paint(Graphics g) {

        x += 20;


        for(int teller=0; teller < 10; teller++) {
            eerste = tweede;
            tweede = derde;
            derde = eerste + tweede;
            String s = " " + derde;
            g.drawString(s, x + (20 * teller), 20 );
        }
    }
}
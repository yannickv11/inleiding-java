package h011;


import java.awt.*;
import java.applet.*;


public class opdracht118 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int s = 0;

        for(int teller = 0; teller < 100; teller++) {
            s += 20;
            g.drawOval(0,0,s,s);


        }
    }
}

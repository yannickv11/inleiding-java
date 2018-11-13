package h011;


import java.awt.*;
import java.applet.*;


public class opdracht115 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int s = 0;

        for(int teller = 0; teller < 5; teller++) {
            s += 20;
            g.drawRect(s,s,20,20);


        }
    }
}


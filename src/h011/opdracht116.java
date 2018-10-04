package h011;

import java.awt.*;
import java.applet.*;


public class opdracht116 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int s = 10;
        int x = 60;
        int y = 60;

        for(int teller = 0; teller < 5; teller++) {

            g.drawOval(x,y,s,s);
            x -= 5;
            y -= 5;
            s += 10;



        }
    }
}

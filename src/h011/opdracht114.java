package h011;

import java.awt.*;
import java.applet.*;


public class opdracht114 extends Applet {

    int eerste;
    int tweede;
    int derde;



    public void init() {
      eerste = 3;
      tweede = 3;
      derde = 3;



    }

    public void paint(Graphics g) {

        int x = 20;
        eerste = 0;


        for (int teller = 0; teller < 10; teller++) {

            eerste += 3;
            g.drawString("" + eerste, x, 20 );
            x += 20;
        }
    }
}


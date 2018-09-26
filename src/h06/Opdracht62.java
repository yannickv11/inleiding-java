package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht62 extends Applet {
    int secondesperuur;
    int secondesperdag;
    int secondesperjaar;

    public void init() {
        secondesperuur = 60*60;
        secondesperdag = secondesperuur*24;
        secondesperjaar = secondesperdag*365;
    }

    public void paint(Graphics g) {
        secondesperuur++;
        g.drawString("aantal secondes " + secondesperuur +
                " in een uur ", 50, 60 );
        g.drawString("aantal secondes " + secondesperdag +
                " per dag ", 50, 80 );
        g.drawString("aantal secondes " + secondesperjaar +
                " per jaar ", 50, 100 );



    }
}
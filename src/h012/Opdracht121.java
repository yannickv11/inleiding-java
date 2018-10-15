package h012;


import java.awt.*;
import java.applet.*;

public class Opdracht121 extends Applet {
    double getal[];
    double gemiddelde;



    public void init() {
        getal = new double [10];


        for (int teller = 0; teller < getal.length; teller ++) {
            getal[teller] = 10 * teller + 10;
        }

        double optelsom = 0;
        for (int teller = 0; teller < getal.length; teller++ ) {
            optelsom = optelsom + getal[teller];
        }

        gemiddelde = optelsom / getal.length;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            g.drawLine(80, 95, 85, 95);
            g.drawString("Gemiddelde: " + gemiddelde,90,100);
        }
    }
}
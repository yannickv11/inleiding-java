package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht61 extends Applet {
    double a;
    double b;
    double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan krijgt " + uitkomst+"Euro", 20, 20);
        g.drawString("Ali krijgt " + uitkomst+"Euro", 20, 40);
        g.drawString("Jeannette krijgt " + uitkomst+"Euro", 20, 60);
        g.drawString("Yannick krijgt " + uitkomst+"Euro", 20, 80);



    }
}
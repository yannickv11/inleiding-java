import java.awt.*;
import java.applet.*;


public class Opdracht64 extends Applet {
    double getal1;
    double getal2;
    double getal3;
    double Gafg;
    int GNafg;


    public void init() {
        getal1 = 5.9;
        getal2 = 6.3;
        getal3 = 6.9;
        Gafg = (5.9+6.3+6.9) /3 * 10;
        GNafg = 63;
        Gafg = GNafg;



    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + Gafg/10, 20, 20);

    }
}
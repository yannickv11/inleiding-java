import java.awt.*;
import java.applet.*;


public class Opdracht63 extends Applet {
    int a;
    int b;
    int c;
    int Uitkomst;



    public void init() {
        a = 8;
        b = 8;
        c = 17;
        Uitkomst = ( a + b) - c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + Uitkomst, 20, 20);
    }
}
package h04;
import java.awt.*;
import java.applet.*;

    public class Opdracht42 extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawLine(200, 100, 250, 200);
            g.drawLine(200, 100, 150, 200);
            g.drawLine(150,200,250,200);
            g.drawRect(150, 200, 100, 100);
            g.drawRect(160,220,25,25);
            g.drawRect(215,250,25,50);


        }
    }


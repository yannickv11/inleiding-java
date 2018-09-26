package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht48 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 50);
        g.drawRoundRect(20, 100, 100, 50, 10, 10);
        g.drawOval(20, 180, 50, 50);
        g.drawOval(160, 20, 100, 50);
        g.fillOval(160,20,100,50);
        g.setColor(Color.red);
        g.fillRoundRect(160,110,100,50,10,10);
        g.setColor(Color.blue);
        g.drawOval(160, 110, 100, 50);
        g.setColor(Color.black);
        g.drawOval(160, 180, 100, 50);
        g.drawArc(160, 180, 100, 50, 90, 45);
        g.fillArc(160, 180, 100, 50, 90, 45) ;
        g.drawLine(80, 290, 270, 290);
        g.drawString("Rechthoek",10,10);
        g.drawString("Gevulde Ovaal",160,10);
        g.drawString("Cirkel",20,170);
        g.drawString("Afgeronde Rechthoek",20,90);
        g.drawString("Lijn",80,280);
        g.drawString("Taartpunt met ovaal",160,170);
        g.drawString("Gevulde Rechthoek met ovaal",160,100);




    }
}
import java.awt.*;
import java.applet.*;

public class Opdracht51 extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        lijnkleur = Color.black;
        breedte = 200;
        opvulkleur = Color.magenta;
        hoogte = 100;

    }

    public void paint(Graphics g) {

        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, breedte, hoogte);
        g.drawRoundRect(20, 150, breedte, hoogte, 10, 10);
        g.drawOval(20, 310, 100, hoogte);
        g.drawOval(350, 20, breedte, hoogte);
        g.fillOval(350,20,breedte,hoogte);
        g.setColor(opvulkleur);
        g.fillRoundRect(350,130,breedte,hoogte,10,10);
        g.setColor(Color.red);
        g.drawOval(350, 130, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(350, 260, breedte, hoogte);
        g.drawArc(350, 260, breedte, hoogte, 90, 45);
        g.fillArc(350, 260, breedte, hoogte, 90, 45) ;
        g.drawLine(80, 450, 270, 450);
        g.drawString("Rechthoek",10,10);
        g.drawString("Gevulde Ovaal",350,10);
        g.drawString("Cirkel",20,300);
        g.drawString("Afgeronde Rechthoek",20,140);
        g.drawString("Lijn",80,440);
        g.drawString("Taartpunt met ovaal",350,250);
        g.drawString("Gevulde Rechthoek met ovaal",600,130);

    }
}
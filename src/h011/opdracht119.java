package h011;


import java.awt.*;
import java.applet.*;


public class opdracht119 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int breedte = 20;
        int hoogte = 20;
        int x = breedte;
        int y;
        y = 20;

        for (int i = 0; i < 4; i++) {


            for (int kolom = 0; kolom < 4; kolom++) {

                g.drawRect(x, y, breedte, hoogte);
                g.fillRect(x + 20, y, breedte + 1, hoogte + 1);
                x += 40;
            }
            y += 20;
            x = 20;
            for (int kolom = 0; kolom < 4; kolom++) {

                g.fillRect(x, y, breedte + 1, hoogte + 1);
                g.drawRect(x + 20, y, breedte, hoogte);

                x += 40;
            }
            x = 20;
            y += 20;
        }
    }
    }







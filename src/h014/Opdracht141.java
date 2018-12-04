package h014;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht141 extends Applet {
    Button knop;

    String kaart[];
    String kaartsoort[];

    double random;
    double random2;

    int teller;
    int teller2;

    public void init () {
        knop = new Button("deel");
        knop.addActionListener(new knopListener());
        add(knop);
        kaart = new String[13];

        for (int i = 0; i < 9; i++) {
            kaart[i] = "" + (i = i + 2);
            i -= 2;
        }

        kaart[9] = "Heer";
        kaart[10] = "Vrouw";
        kaart[11] = "Boer";
        kaart[12] = "Aas";

        kaartsoort = new String[4];

        kaartsoort[0] = "Harten";
        kaartsoort[1] = "Schoppen";
        kaartsoort[2] = "Klavers";
        kaartsoort[3] = "Ruiten";


    }
    public void paint (Graphics g) {
        g.drawString(kaartsoort[teller2] + "" + kaart[teller], 60, 40);
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            random = (Math.random() * 12 + 0);
            teller = (int) random;

            random2 = (Math.random() * 3 + 0);
            teller2 = (int) random2;

          repaint();
        }
        }
    }
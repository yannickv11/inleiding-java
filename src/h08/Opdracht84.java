package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht84 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;

    int getal1;
    int getal2;
    int eindgetal;

    Button keerKnop;
    Button deelKnop;
    Button plusKnop;
    Button minKnop;

    String schermtekst;


    public void init() {
        tekstvak1 = new TextField("", 15);
        tekstvak2 = new TextField("", 15);
        add(tekstvak1);
        add(tekstvak2);

        keerKnop = new Button("*");
        keerKnop.addActionListener(new keerKnopListener());
        add(keerKnop);

        deelKnop = new Button("/");
        deelKnop.addActionListener(new deelKnoplistener());
        add(deelKnop);

        plusKnop = new Button("+");
        plusKnop.addActionListener(new plusKnopListener());
        add(plusKnop);

        minKnop = new Button("-");
        minKnop.addActionListener(new minKnopListener());
        add(minKnop);

    }
        public void paint (Graphics g){

        g.drawString("" + eindgetal,50,75);
        }



    class keerKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            eindgetal = getal1 * getal2;

            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }

    class deelKnoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            eindgetal = getal1 / getal2;

            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }


    class plusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            eindgetal = getal1 + getal2;

            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }


    class minKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            eindgetal = getal1 - getal2;

            tekstvak1.setText("");
            tekstvak2.setText("");

            repaint();


        }
    }

}
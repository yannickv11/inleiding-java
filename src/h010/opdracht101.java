package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht101 extends Applet {

    int leeftijd;
    int nleeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("" +  leeftijd, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            nleeftijd = Integer.parseInt(s);
            if (nleeftijd > leeftijd) {
                leeftijd = nleeftijd;
                repaint();

            }


            }
        }
    }

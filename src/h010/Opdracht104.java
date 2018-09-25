package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht104 extends Applet {
    int input;
    String maand;

    TextField tekstvak;
    TextField tekstvakk;
    Button okknop;
    String s;
    String s1;

    int jaartal;
    String tekst;

    public void init() {


        maand = "...";

        okknop = new Button("Ok");
        okknop.addActionListener(new okknopListener());
        add(okknop);

        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);
        Label label;
        tekstvakk = new TextField("", 5);
        tekstvakk.addActionListener(new tekstvakkListener());
        add(tekstvakk);
    }

    public void paint(Graphics g) {

        g.drawString(maand, 100, 75);
        g.drawString("" + tekst, 100, 90);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Integer.parseInt(s);

            if (input == 1) {
                maand = "Januari heeft 31 dagen.";
            }
            if (input == 2) {
                maand = "Februari heeft 28 dagen maar in het schrikkeljaar 29.";
            }
            if (input == 3) {
                maand = "Maart heeft 31 dagen.";
            }
            if (input == 4) {
                maand = "April heeft 30 dagen.";
            }
            if (input == 5) {
                maand = "Mei heeft 31 dagen.";
            }
            if (input == 6) {
                maand = "Juni heeft 30 dagen.";
            }
            if (input == 7) {
                maand = "Juli heeft 31 dagen.";
            }
            if (input == 8) {
                maand = "Augustus heeft 31 dagen.";
            }
            if (input == 9) {
                maand = "September heeft 30 dagen.";
            }
            if (input == 10) {
                maand = "Oktober heeft 31 dagen.";
            }
            if (input == 11) {
                maand = "November heeft 30 dagen.";
            }
            if (input == 12) {
                maand = "December heeft 31 dagen.";
            }


            tekstvak.setText("");
            repaint();


        }
    }


    class okknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Integer.parseInt(s);

            if (input == 1) {
                maand = "Januari heeft 31 dagen.";
            }
            if (input == 2) {
                maand = "Februari heeft 28 dagen maar in het schrikkeljaar 29.";
            }
            if (input == 3) {
                maand = "Maart heeft 31 dagen.";
            }
            if (input == 4) {
                maand = "April heeft 30 dagen.";
            }
            if (input == 5) {
                maand = "Mei heeft 31 dagen.";
            }
            if (input == 6) {
                maand = "Juni heeft 30 dagen.";
            }
            if (input == 7) {
                maand = "Juli heeft 31 dagen.";
            }
            if (input == 8) {
                maand = "Augustus heeft 31 dagen.";
            }
            if (input == 9) {
                maand = "September heeft 30 dagen.";
            }
            if (input == 10) {
                maand = "Oktober heeft 31 dagen.";
            }
            if (input == 11) {
                maand = "November heeft 30 dagen.";
            }
            if (input == 12) {
                maand = "December heeft 31 dagen.";
            }


            tekstvak.setText("");
            repaint();
        }
    }

        class tekstvakkListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s1 = tekstvakk.getText();
                jaartal = Integer.parseInt(s1);
                if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0) {
                    tekst = "" + jaartal + " is een schrikkeljaar";
                } else {
                    tekst = "" + jaartal + " is geen schrikkeljaar";
                }

                tekstvakk.setText("");
                repaint();
            }
        }
    }













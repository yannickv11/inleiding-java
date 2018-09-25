package h010;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Opdracht106 extends Applet {
    double input;
    double input2;
    double input3;
    double input4;
    double input5;
    double gem;

    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;

    Label label;

    Button berekenknop;


    String st;
    String cijfer;

    public void init() {

        label = new Label("Vul in");

        add(label);

        tekstvak = new TextField(" ", 2);
        add(tekstvak);

        tekstvak2 = new TextField("", 2);
        add(tekstvak2);

        tekstvak3 = new TextField("", 2);
        add(tekstvak3);

        tekstvak4 = new TextField("", 2);
        add(tekstvak4);

        tekstvak5 = new TextField("", 2);
        add(tekstvak5);


        berekenknop = new Button(" bereken je cijfer");
        berekenknop.addActionListener(new berekenknopListener ());
        add(berekenknop);

        cijfer = "";

    }


    public void paint (Graphics g) {
        g.drawString("Je cijfer: " + input, 50, 100);
        g.drawString("" + cijfer  , 50,115);

    }

    class berekenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            st = tekstvak.getText();
            input = Double.parseDouble(st);

            st = tekstvak2.getText();
            input2 = Double.parseDouble(st);

            st = tekstvak3.getText();
            input3 = Double.parseDouble(st);

            st = tekstvak4.getText();
            input4 = Double.parseDouble(st);

            st = tekstvak5.getText();
            input5 = Double.parseDouble(st);


            ;

            if (input > 5.5 && (gem < 7.4)) {
                cijfer = "Voldoende";}

                if (input > 1.5 && (gem < 3.4 )) {
                    cijfer = "slecht";}

                    if (input > 3.4 && (gem < 4.4 )) {
                    cijfer = "onvoldoende ";}

                    if (input > 4.4 && (gem < 5.4 )) {
                    cijfer = "matig ";}

                    if (input > 7.4 && (gem < 10 )) {
                    cijfer = "goed";}






            tekstvak.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
            tekstvak5.setText("");
            repaint();
        }
    }
}






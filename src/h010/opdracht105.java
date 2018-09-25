package h010;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class opdracht105 extends Applet {

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


    String s;
    String geslaagd;

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


        berekenknop = new Button(" bereken het gemideldde ");
        berekenknop.addActionListener(new berekenknopListener ());
        add(berekenknop);

        geslaagd = "";

    }


    public void paint (Graphics g) {
        g.drawString("Je gemiddelde is " + gem, 50, 100);
        g.drawString("" +  geslaagd, 50,115);

    }

    class berekenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Double.parseDouble(s);

            s = tekstvak2.getText();
            input2 = Double.parseDouble(s);

            s = tekstvak3.getText();
            input3 = Double.parseDouble(s);

            s = tekstvak4.getText();
            input4 = Double.parseDouble(s);

            s = tekstvak5.getText();
            input5 = Double.parseDouble(s);


            gem = (input + input2 + input3 + input4 + input5) / 5;
            gem = (int) (gem * 10);
            gem = gem / 10.0;

            if (gem > 5.5) {
                geslaagd = "Geslaagd";
            }
            else {
                geslaagd = "Gezakt";
            }
            tekstvak.setText("");
            tekstvak2.setText("");
            tekstvak3.setText("");
            tekstvak4.setText("");
            tekstvak5.setText("");
            repaint();
        }
    }
}











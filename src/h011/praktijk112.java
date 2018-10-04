package h011;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class praktijk112 extends Applet {

    TextField tekstvak;
    Button knop;
    Label label;

    int input;

    int uitkomst;
    int y;
    int knopp;



    public void init() {

        label = new Label("Invoer");
        add(label);

        tekstvak = new TextField("", 5);
        add(tekstvak);

        knop = new Button();
        knop.setLabel("Ok");
        knop.addActionListener(new knopListener());
        add(knop);



    }

    public void paint(Graphics g) {
        y = 40;

        for (int teller = 1; teller < 11; teller++) {

            uitkomst = input * teller;
            g.drawString(input + " * " + teller + " = " + uitkomst,20, y );
            y += 20;

        }
    }


    class knopListener implements ActionListener  {
        public void actionPerformed (ActionEvent e) {

            input += 1;

            tekstvak.setText("");
            repaint();

        }
    }
}


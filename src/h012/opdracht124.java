package h012;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdracht124 extends Applet {
    TextField tekstvak;
    Button knop;
    int[] tabel = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    int x;
    boolean gevonden;
    int gezocht;
    int index;
    String s;


    public void init() {
        setSize(600, 400);

        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add(knop);

    }

    public void paint(Graphics g) {

        for (int i = 0; i < tabel.length; i++) {
            x += 20;
            g.drawString("" + tabel[i], 20, x);
        }
        x = 0;

        if (gevonden == true) {
            g.drawString("Waarde is gevonden.", 100, 50);
        }
        if (gevonden == true){
            g.drawString("index: "+ index,100,80);

        }
        else {
            g.drawString("Waarde niet gevonden.", 100, 50);
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           s = tekstvak.getText();
           gezocht= Integer.parseInt(s);

            gevonden = false;

            index = (gezocht/100)-1;
            int i = 0;
            while (i < tabel.length) {
                if (tabel[i] == gezocht) {
                    gevonden = true;
                }
                i++;
            }
            repaint();
        }
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            gezocht = Integer.parseInt(s);

            gevonden = false;

            index = (gezocht/ 100)-1;

            int i = 0;
            while (i < tabel.length) {
                if (tabel[i] == gezocht) {
                    gevonden = true;
                }
                i++;
            }
            repaint();
        }
    }
}




package h013;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht133 extends Applet {
    Button knop1;
    Button knop2;
    boolean grijs;
    boolean rood;

    public void init() {
        setSize(450, 420);
        knop1 = new Button("Gray");
        knop1.addActionListener(new knop1Listener());
        add(knop1);

        knop2 = new Button("red");
        knop2.addActionListener(new knop2Listener());
        add(knop2);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        for (int i = 0; i < 400; i += 22) {

            for (int x = 0; x < 400; x += 72) {

                g.fillRect(x, i, 70, 20);

            }
        }
    }

    class knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Graphics g = getGraphics();
            grijs = true;
            rood = false;
            if (grijs = true) {
                int pattern = 0;
                g.setColor(Color.gray);
                for (int i = 0; i < 400; i += 22) {
                    for (int x = 0; x < 400; x += 72) {
                        if (pattern == 0) g.fillRect(x,i,70,20);
                        else g.fillRect(x,i,70,20);

                        if (pattern == 0) g.fillRect(x,i,70,20);
                        else g.fillRect(x - 8,i,70,20);



                    }
                    if (pattern==0) pattern = 1;
                    else pattern=0;
                }
            }
        }
    }

    class knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Graphics g = getGraphics();
            rood = true;
            grijs = false;
            if (rood = true) {
                g.setColor(Color.red);
                for (int i = 0; i < 400; i += 22) {
                    for (int x = 0; x < 400; x += 72) {

                        g.fillRect(x, i, 70, 20);
                    }
                }
            }
        }
    }
}

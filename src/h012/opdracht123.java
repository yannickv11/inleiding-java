package h012;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class opdracht123  extends Applet {

    TextField[] tekstvak;
    Button okknop;

    int[] input;
    String[] s;

    public void init() {
        input = new int[5];
        tekstvak = new TextField[5];

        s=new String[5];


        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField("" + teller);
            add(tekstvak[teller]);
        }
        tekstvak[4].addActionListener(new tekstvakListener());
        okknop = new Button("OK");
        okknop.addActionListener(new  okknopListener());
        add(okknop);
    }
        public void paint (Graphics g) {
        for (int teller = 0; teller < tekstvak.length; teller ++) {

        }
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s[0] = tekstvak[0].getText();
            s[1] = tekstvak[1].getText();
            s[2] = tekstvak[2].getText();
            s[3] = tekstvak[3].getText();
            s[4] = tekstvak[4].getText();

            Arrays.sort(s);

            tekstvak[0].setText(""+ s[0]);
            tekstvak[1].setText(""+ s[1]);
            tekstvak[2].setText(""+ s[2]);
            tekstvak[3].setText(""+ s[3]);
            tekstvak[4].setText(""+ s[4]);

            repaint();
        }
    }

    class okknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s[0] = tekstvak[0].getText();
            s[1] = tekstvak[1].getText();
            s[2] = tekstvak[2].getText();
            s[3] = tekstvak[3].getText();
            s[4] = tekstvak[4].getText();

            Arrays.sort(s);

            tekstvak[0].setText(""+ s[0]);
            tekstvak[1].setText(""+ s[1]);
            tekstvak[2].setText(""+ s[2]);
            tekstvak[3].setText(""+ s[3]);
            tekstvak[4].setText(""+ s[4]);

            repaint();
        }
    }

}

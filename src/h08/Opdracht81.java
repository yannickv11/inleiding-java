import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht81 extends Applet {
    Button okknop;
    Button clearknop;
TextField Textvak;
    Label label;
    String string;
    String schermtekst;

    public void init() {

        label = new Label ("Type hier");
        add(label);
        Textvak = new TextField("",15);
        add(Textvak);

        okknop = new Button();
        okknop.setLabel("OK");
        okknop.addActionListener ( new okknopListener ());
        add(okknop);

        clearknop = new Button();
        clearknop.setLabel("Clear");
        clearknop.addActionListener ( new clearknopListener ());
        add(clearknop);
        string = "";








    }
    public void paint(Graphics g) {
        g.drawString(string,45,45);
        g.drawString(schermtekst,50,60);


    }
    class okknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = Textvak.getText();
            Textvak.setText("");
            schermtekst = "";
            repaint();
        }
    }
    class clearknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = Textvak.getText();
            Textvak.setText("");
            schermtekst = "";
            repaint();
        }
    }
}
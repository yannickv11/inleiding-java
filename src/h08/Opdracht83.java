import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht83 extends Applet {

    Button okKnop;
    Label label;
    TextField tekstvak;


    int input;

    double btwbedrag;

    public void init() {

        setSize(600,400);
        label = new Label("Bereken BTW:");
        add(label);

        tekstvak = new TextField("",15);
        add(tekstvak);

        okKnop = new Button();
        okKnop.setLabel( "Bereken" );
        okKnop.addActionListener( new okKnopListener() );
        add(okKnop);
    }

    public void paint(Graphics g) {
        g.drawString("Het BTW bedrag is: " + btwbedrag, 25,50);

    }
    class okKnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            input = Integer.parseInt(tekstvak.getText());
            btwbedrag = input * 1.21;
            tekstvak.setText("");
            repaint();



        }
    }
}

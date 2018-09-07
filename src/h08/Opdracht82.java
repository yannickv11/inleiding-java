package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht82 extends Applet {
    Button manknop;
    Button vrouwknop;
    Button meisjeknop;
    Button jongenknop;

    String SchermtekstM;
    String Schermtekstv;
    String Schermtekstj;
    String SchermtekstMe;

    int tellerman;
    int tellervrouw;
    int tellermeisje;
    int tellerjongen;

    public void init() {
        tellerman = 1;
        tellervrouw = 1;
        tellerjongen = 1;
        tellermeisje = 1;

        manknop = new Button();
        manknop.setLabel( "man" );
        add(manknop);
        manknop.addActionListener( new manknopListener() );

       vrouwknop = new Button();
        vrouwknop.setLabel( "vrouw" );
        add(vrouwknop);
        vrouwknop.addActionListener( new vrouwknopListener() );

        meisjeknop = new Button();
        meisjeknop.setLabel( "meisje" );
        add(meisjeknop);
        meisjeknop.addActionListener( new meisjeknopListener() );

       jongenknop = new Button();
       jongenknop.setLabel( "jongen" );
        add(jongenknop);
        jongenknop.addActionListener( new jongenknopListener() );



    }

    public void paint(Graphics g) {

        g.drawString(SchermtekstM,50,75);
        g.drawString(Schermtekstv,50,90);
        g.drawString(Schermtekstj,50,105);
        g.drawString(SchermtekstMe,50,120);

    }
    class manknopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            SchermtekstM = "" + tellerman;
            tellerman++;
            repaint();
        }
    }
    class vrouwknopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Schermtekstv = "" + tellervrouw;
            tellervrouw++;
            repaint();
        }
    }
    class meisjeknopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Schermtekstj = "" + tellermeisje;
            tellermeisje++;
            repaint();
        }
    }
    class jongenknopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            SchermtekstMe = "" + tellerjongen;
            tellerjongen++;
            repaint();
        }
    }
}
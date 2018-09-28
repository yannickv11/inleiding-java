package challange1;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht82c  extends Applet{

Button frisknop;
Button bierknop;
Button wijnknop;
Button koffieknop;
Button binngedist;
Button buitgedist;
Button nieuwebestellingk;

double frisdrank;
double bier;
double wijn;
double koffie;
double binnenlandsgedistilleerd;
double buitenlandsgedistilleerd;
double bestellingtotaal;
double totaaldagomzet;

public void init () {


    frisknop = new Button("fris");
    add(frisknop);
    FrisKnopListener fl = new FrisKnopListener();
    frisknop.addActionListener(fl);
    bierknop = new Button("bier");
    add(bierknop);
    BierKnopListener bl = new BierKnopListener();
    bierknop.addActionListener(bl);
    wijnknop= new Button("wijn");
    add(wijnknop);
    WijnKnopListener wl = new WijnKnopListener();
    wijnknop.addActionListener(wl);
    koffieknop = new Button("koffie");
    add(koffieknop);
    KoffieKnopListener kl = new KoffieKnopListener();
    koffieknop.addActionListener(kl);
    binngedist = new Button("binn gedist");
    add(binngedist);
    binnenKnopListener bl2 = new binnenKnopListener();
    binngedist.addActionListener(bl2);

    buitgedist = new Button();
    buitgedist.setLabel("buit gedist");
    buitgedistListener Bl =  new buitgedistListener();
    buitgedist.addActionListener(bl);


    nieuwebestellingk = new Button("nieuwe bestelling");
    add(nieuwebestellingk);
    NieuwKnopListener nl = new NieuwKnopListener();
    nieuwebestellingk.addActionListener(nl);


    frisdrank = 2.25;
    bier = 2.50;
    wijn = 2.75;
    koffie = 2;
    binnenlandsgedistilleerd = 3;
    buitenlandsgedistilleerd = 3.75;



}


public void paint (Graphics g) {
    g.drawString("bestelling totaal: "+ bestellingtotaal,60,70 );
    g.drawString("totalen dagomzet:" + totaaldagomzet, 60,90);



}

    class FrisKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal = frisdrank + bestellingtotaal;
            totaaldagomzet = totaaldagomzet + frisdrank;
            repaint();
        }
    }

    class BierKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal = bier + bestellingtotaal;
            totaaldagomzet= totaaldagomzet + bier;
            repaint();

        }
    }



    class WijnKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + wijn;
            totaaldagomzet= totaaldagomzet+ wijn;
            repaint();

        }
    }




    class KoffieKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + koffie;
            totaaldagomzet= totaaldagomzet + koffie;
            repaint();
        }
    }




    class binnenKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + binnenlandsgedistilleerd;
            totaaldagomzet= totaaldagomzet + binnenlandsgedistilleerd;
            repaint();
        }
    }

    class buitgedistListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= bestellingtotaal + buitenlandsgedistilleerd;
            totaaldagomzet= totaaldagomzet + buitenlandsgedistilleerd;
            repaint();
        }
    }

    class NieuwKnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            bestellingtotaal= 0;
            repaint();
        }
    }




}


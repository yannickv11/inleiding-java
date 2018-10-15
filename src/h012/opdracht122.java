package h012;

    import java.awt.*;
    import java.applet.*;

    public class opdracht122 extends Applet {

        Button[] knop;

        public void init() {
            knop = new Button[26];

            for (int teller = 0; teller < knop.length; teller++) {
                knop[teller] = new Button("" + teller);
                add(knop[teller]);
            }
        }
    }





package Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        for(int teller = 0; teller < 10; teller++) {
            g.drawString("Wiljan Verhoeven", 20, 20 + 40*teller);
            if (teller == 4) {
                g.drawString("jorn", 20, 10 + 40*teller);
            }
        }
    }
}

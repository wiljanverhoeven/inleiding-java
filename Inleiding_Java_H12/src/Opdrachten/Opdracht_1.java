package Opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_1 extends Applet {
    double[] cijfer;
    double gemidelde = (1+2+3+4+5+6+7+8+9+10) / 10;

    public void init() {
        cijfer = new double[10];

        for (int teller = 0; teller < cijfer.length; teller++) {
            cijfer[teller] = 1 * teller + 1;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < cijfer.length; teller++) {
            g.drawString("" + cijfer[teller], 50, 20 * teller + 20);
        }
        g.drawString("het gemidelde is: "+gemidelde,50, 220);
    }
}

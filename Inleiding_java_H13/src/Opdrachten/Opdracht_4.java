package Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        for (int e = 0; e < 5; e++) {
        g.setColor(Color.green);
        int x1, y1, x2, y2, x3, y3;
        x1 = x2 = x3 = 60+60*e;
        y1 = y2 = y3 = 60;
        for (int i = 0; i < 30; i++) {
            tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
            y1--;
            x2--;
            y2++;
            x3++;
            y3++;
        }
    }

        for (int e = 0; e < 5; e++) {
            g.setColor(Color.green);
            int x1, y1, x2, y2, x3, y3;
            x1 = x2 = x3 = 60+60*e;
            y1 = y2 = y3 = 150;
            for (int i = 0; i < 30; i++) {
                tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
                y1--;
                x2--;
                y2++;
                x3++;
                y3++;
            }
        }
        for (int a = 0; a < 5; a++) {
            g.setColor(Color.black);
            g.fillRect(55+60*a, 90, 10, 20);
        }
        for (int a = 0; a < 5; a++) {
            g.setColor(Color.black);
            g.fillRect(55+60*a, 180, 10, 20);
        }
}
    void tekenDriehoek( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
            g.drawLine(x1, y1, x2, y2);
            g.drawLine(x2, y2, x3, y3);
            g.drawLine(x3, y3, x1, y1);
        }
}

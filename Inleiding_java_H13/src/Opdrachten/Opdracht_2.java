package Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_2 extends Applet {

    public void init() {
    }
    public void paint(Graphics g) {
        int x1, y1, height1, width1;
        x1 = y1 = 20;
        height1 = width1 = 200;
        for (int i=0; i<100; i++) {
            brickwall (g, x1, y1, height1, width1);
            width1++;
        }
    }
    void brickwall( Graphics g, int x1, int y1, int height1, int width1) {
        g.setColor(Color.red);
        g.fillRect(x1, y1, width1, height1);
        for(int i=0; i<5; i++) {
            g.setColor(Color.white);
            g.drawLine(20, 60 + 40*i, 400, 60 + 40*i);
        }
        for(int i=0; i<5; i++) {
            g.drawLine(80 + 60*i, 20, 80 + 60*i, 60);
        }
        for(int i=0; i<5; i++) {
            g.drawLine(50 + 60*i, 60, 50 + 60*i, 100);
        }
        for(int i=0; i<5; i++) {
            g.drawLine(80 + 60*i, 100, 80 + 60*i, 140);
        }
        for(int i=0; i<5; i++) {
            g.drawLine(50 + 60*i, 140, 50 + 60*i, 180);
        }
        for(int i=0; i<5; i++) {
            g.drawLine(80 + 60*i, 180, 80 + 60*i, 220);
        }
    }
}

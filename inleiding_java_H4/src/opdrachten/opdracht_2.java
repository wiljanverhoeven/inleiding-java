package opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {

    public void init() {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        g.setColor(Color.magenta);
        g.fillRect(20, 100, 150, 150);
        g.drawLine(20, 100, 95, 20);
        g.drawLine(95, 20, 170, 100);

        g.setColor(Color.orange);
        g.fillRect(75, 175, 40, 75);

        g.setColor(Color.gray);
        g.fillRect(109,212,5,4);

        g.setColor(Color.blue);
        g.fillRect(30, 110,35,35);
        g.fillRect(125,110,35,35);

        g.setColor(Color.black);
        g.drawLine(30,127,65,127);
        g.drawLine(47,110,47,145);
        g.drawLine(125,127,160,127);
        g.drawLine(142,110,142,145);

       g.setColor(Color.green);
        g.fillRect(0,250,700,300);
    }

}

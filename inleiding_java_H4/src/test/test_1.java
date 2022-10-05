package test;

import java.awt.*;
import java.applet.*;

public class test_1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.red);
        g.drawRect(20, 20, 200, 50);
        g.fillRect(20, 80, 100, 50);

        g.setColor(Color.orange);
        g.drawRoundRect(20, 135, 150, 150, 10, 10);

        g.setColor(Color.black);
        g.fillOval(230, 20, 60, 100);

        g.setColor(Color.magenta);
        g.drawArc(230, 130, 50, 50, 0, 180);
    }
}
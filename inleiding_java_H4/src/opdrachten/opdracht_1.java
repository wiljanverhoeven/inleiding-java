package opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_1 extends Applet {

    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(100,250,225,100);
        g.drawLine(225,100,350,250);
        g.drawLine(100,250,350,250);

    }



}

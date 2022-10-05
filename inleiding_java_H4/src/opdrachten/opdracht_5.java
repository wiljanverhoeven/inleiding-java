package opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_5 extends Applet {

    public void init() {

        setBackground(Color.blue);
    }
    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillArc(50,50,300,150,0,360);
    }
}


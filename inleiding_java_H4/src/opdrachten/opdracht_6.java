package opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_6 extends Applet {

    public void init() {

        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {

        g.setColor(Color.gray);
        g.fillRect(100, 100, 50, 100);
        g.fillRect(120,200,10,100);

        g.setColor(Color.green);
        g.fillOval(110,101,30,30);

        g.setColor(Color.orange);
        g.fillOval(110,135,30,30);

        g.setColor(Color.red);
        g.fillOval(110,169,30,30);
    }
}



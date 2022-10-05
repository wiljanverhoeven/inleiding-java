package opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_3 extends Applet {

    public void init() {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(40,40,130,25);

        g.setColor(Color.white);
        g.fillRect(40,65,130,25);

        g.setColor(Color.blue);
        g.fillRect(40,90,130,25);

        g.setColor(Color.gray);
        g.fillRect(35,35,5,300);
    }

}

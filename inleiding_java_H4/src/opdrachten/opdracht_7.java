package opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_7 extends Applet {

    public void init() {

        setBackground(Color.blue);
    }

    public void paint(Graphics g) {

        g.setColor(Color.white);
        g.fillRoundRect(50, 50, 150, 150,30,30);

        g.setColor(Color.black);
        g.fillOval(70,65,45,45);
        g.fillOval(140,65,45,45);
        g.fillOval(140,140,45,45);
        g.fillOval(70, 140,45,45);
    }
 }

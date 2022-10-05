package H2_opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Wiljan", 150, 150 );

        g.setColor(Color.red);
        g.drawString( "verhoeven", 150, 160);
    }
}

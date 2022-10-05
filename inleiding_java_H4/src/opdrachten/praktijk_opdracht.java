package opdrachten;

import java.awt.*;
import java.applet.*;

public class praktijk_opdracht extends Applet {

    public void init() {

        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        g.drawLine(10,10,100,10);
        g.drawString("lijn", 45,22);

        g.drawRect(10,30,100,50);
        g.drawString("rechthoek",30,90);

        g.drawRoundRect(10,100,100,50,30,30);
        g.drawString("afgeronde rechthoek",10,165);

        g.setColor(Color.magenta);
        g.fillRect(120,10,100,50);

        g.setColor(Color.black);
        g.drawOval(120,10,100,50);
        g.drawString("gevulde rechthoek",120,70);
        g.drawString("met ovaal",140,80);

        g.setColor(Color.magenta);
        g.fillOval(120,90,100,50);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",120,150);

        g.setColor(Color.black);
        g.drawOval(230,20,100,50);
        g.drawString("taartpunt met ovaal",230,80);

        g.setColor(Color.magenta);
        g.fillArc(230,20,100,50,0,45);

        g.setColor(Color.black);
        g.drawOval(230,100,50,50);
        g.drawString("cirkel",245,165);
    }

}
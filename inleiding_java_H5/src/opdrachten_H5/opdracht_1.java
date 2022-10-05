package opdrachten_H5;

import java.awt.*;
import java.applet.*;

public class opdracht_1 extends Applet {
    Color magenta = new Color(255, 0, 255);
    Color black = new Color(0,0,0);
    Color white= new Color(255, 255, 255);
    int Width = 100;
    int Height = 50;

    public void init() {

        setBackground(white);
    }

    public void paint(Graphics g) {

        g.drawLine(10,10,100,10);
        g.drawString("lijn", 45,22);

        g.drawRect(10,30, Width, Height);
        g.drawString("rechthoek",30,90);

        g.drawRoundRect(10,100, Width, Height,30,30);
        g.drawString("afgeronde rechthoek",10,165);

        g.setColor(magenta);
        g.fillRect(120,10, Width, Height);

        g.setColor(black);
        g.drawOval(120,10,Width,Height);
        g.drawString("gevulde rechthoek",120,70);
        g.drawString("met ovaal",140,80);

        g.setColor(magenta);
        g.fillOval(120,90, Width, Height);
        g.setColor(Color.black);
        g.drawString("gevulde ovaal",120,150);

        g.setColor(black);
        g.drawOval(230,20,Width,Height);
        g.drawString("taartpunt met ovaal",230,80);

        g.setColor(magenta);
        g.fillArc(230,20, Width, Height,0,45);

        g.setColor(black);
        g.drawOval(230,100,50,50);
        g.drawString("cirkel",245,165);
    }

}
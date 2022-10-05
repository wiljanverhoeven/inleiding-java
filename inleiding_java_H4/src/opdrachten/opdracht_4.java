package opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_4 extends Applet {

    public void init() {

        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(50,20,50,260);
        g.drawLine(50,260,250,260);

        g.drawLine(50,20,55,20);
        g.drawLine(50,60,55,60);
        g.drawLine(50,100,55,100);
        g.drawLine(50,140,55,140);
        g.drawLine(50,180,55,180);
        g.drawLine(50,220,55,220);


        g.drawString("120",20,25);
        g.drawString("100",20,65);
        g.drawString("80",25,105);
        g.drawString("60",25,145);
        g.drawString("40",25,185);
        g.drawString("20",25,225);

        g.setColor(Color.red);
        g.fillRect(60,180,40,80);

        g.setColor(Color.green);
        g.fillRect(120,60,40,200);

        g.setColor(Color.blue);
        g.fillRect(180,100,40,160);

        g.setColor(Color.black);
        g.drawString("valerie", 63,275);
        g.drawString("jeroen",123,275);
        g.drawString("hans",186,275);

    }
}
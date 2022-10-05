package opdrachten_H5;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {
    Color red= new Color(255,0, 0);
    Color green= new Color(0, 255, 0);
    Color blue= new Color(0, 0, 255);
    Color black= new Color(0, 0, 0);
    Color white= new Color(255, 255, 255);
    int valerie= 40;
    int jeroen= 100;
    int hans= 80;




    public void init() {
        setBackground(white);
        valerie= 80;
        jeroen= 200;
        hans= 160;
    }

    public void paint(Graphics g) {
        g.setColor(black);
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

        g.setColor(red);
        g.fillRect(60,180,40, valerie);

        g.setColor(green);
        g.fillRect(120, 60,40,jeroen);

        g.setColor(blue);
        g.fillRect(180,100,40,hans);

        g.setColor(black);
        g.drawString("valerie", 63,275);
        g.drawString("jeroen",123,275);
        g.drawString("hans",186,275);

    }
}
package Opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_1 extends Applet {
    double a, b, uitkomst;


    public void init() {
        //berekening
        a = 113;
        b = 4;
        uitkomst = a / b;
    }
    public void paint(Graphics g){
        //tekst
        g.drawString("Jan krijgt: "+ uitkomst,20,20);
        g.drawString("Ali krijgt: "+ uitkomst,20,35);
        g.drawString("Jeannette krijgt: "+ uitkomst,20,50);
        g.drawString("Wiljan krijgt: "+ uitkomst,20,65);
    }
}



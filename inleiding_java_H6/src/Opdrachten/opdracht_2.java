package Opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht_2 extends Applet {
    //variabelen
    int seconden = 1;
    int minuut;
    int uuren;
    int dagen;
    int jaar;

    public void init() {
        //berekeningen
        minuut = seconden * 60;
        uuren = minuut * 60;
        dagen = uuren * 24;
        jaar = dagen * 365;
    }

    public void paint(Graphics g) {
        //tekst enzo
        g.drawString("er zitten " + uuren + " seconden in een uur", 20, 20);
        g.drawString("er zitten " + dagen + " seconden in een dag", 20, 35);
        g.drawString("er zitten " + jaar + " seconden in een jaar", 20, 50);
    }
}

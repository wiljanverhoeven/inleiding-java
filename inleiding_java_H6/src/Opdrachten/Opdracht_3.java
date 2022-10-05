package Opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht_3 extends Applet {
    int a=2147483647;
    int b=2147483647;
    int uitkomst;

    public void init() {
        uitkomst= a + b;
    }

    public void paint(Graphics g){
        g.drawString("idk how but i did it: "+uitkomst, 20,20);

    }
}
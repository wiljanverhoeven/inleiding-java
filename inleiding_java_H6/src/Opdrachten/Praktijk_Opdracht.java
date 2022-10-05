package Opdrachten;

import java.awt.*;
import java.applet.*;

public class Praktijk_Opdracht extends Applet {
    int mensen = 3;
    double[] cijfer = new double[mensen];
    double antwoord;
    double antwoord1;
    double antwoord2;
    int geheel;

    public void init() {
        cijfer[0] = 5.9;
        cijfer[1] = 6.3;
        cijfer[2] = 6.9;

        antwoord = cijfer[0] + cijfer[1] + cijfer[2];
        antwoord1 = antwoord / mensen;


        antwoord1 *= 10;
        geheel = (int) antwoord1;


        antwoord2 = geheel;
        antwoord2 /= 10;

        System.out.println("Debug: " + antwoord2);
    }

    public void paint(Graphics g) {
        g.drawString("het gemiddelde is: " + antwoord2,20,20);

    }
}


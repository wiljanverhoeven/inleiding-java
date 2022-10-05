package Opdrachten;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;

public class Opdracht_4 extends Applet {
    int getallen[] = new int[6];
    TextField tekstvak;
    Button knop;
    String input;
    int input2;
    String eind;

    public void init() {
        tekstvak = new TextField(20);
        knop = new Button("OK");
        knop.addActionListener(new knoplistener());
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 6; i++) {
            getallen[i] = i;
            g.drawString("" + getallen[i], 50, 50 + 20 * i);
        }
        g.drawString(" "+ eind, 60, 50 +20 * input2);
    }

    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = tekstvak.getText();
            input2 = Integer.parseInt(input);
            if (input2 <= 5) {
                eind = "< de index is " + input2;
            }
            else {
                eind = "vul een getal juist in";
            }
            repaint();
        }
    }
}

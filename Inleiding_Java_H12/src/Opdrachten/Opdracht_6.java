package Opdrachten;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;

public class Opdracht_6 extends Applet {
    Button knop;
    TextField tekstvak;
    String input;
    int antwoord;
    String eind;

    public void init() {
        tekstvak = new TextField();
        add(tekstvak);
        knop = new Button();
        knop.addActionListener(new knoplistener());
        add(knop);
        eind =" ";

    }

    public void paint(Graphics g) {
        for (int i = 0; i < 10; i++) {
            g.drawString(" "+i * (i -1), 50, 50 + 20 * i);
        }
        g.drawString(" "+ eind, 100, 100);
    }

    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = tekstvak.getText();
            antwoord = Integer.parseInt(input);
            if (antwoord == 0) {
                eind = "0 komt 2 keer voor";
            }
            if (antwoord == 2) {
                eind ="2 komt 1 keer voor";
            }
            if (antwoord == 6) {
                eind ="6 komt 1 keer voor";
            }
            if (antwoord == 12) {
                eind ="12 komt 1 keer voor";
            }
            if (antwoord == 20) {
                eind ="20 komt 1 keer voor";
            }
            if (antwoord == 30) {
                eind ="30 komt 1 keer voor";
            }
            if (antwoord == 42) {
                eind ="42 komt 1 keer voor";
            }
            if (antwoord == 56) {
                eind ="56 komt 1 keer voor";
            }
            if (antwoord == 72) {
                eind ="72 komt 1 keer voor";
            }
            repaint();
        }
    }
}

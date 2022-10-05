package Opdrachten;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_3 extends Applet {
    Button knop1, knop2;
    String a;

    public void init() {
        knop1 = new Button("baksteen");
        knop2 = new Button("betonblokken");
        knop1.addActionListener(new knop1listener());
        knop2.addActionListener(new knop2listener());
        add(knop1);
        add(knop2);
    }
    public void paint(Graphics g) {
        int x1, y1, height1, width1;
        x1 = y1 = 20;
        height1 = width1 = 200;
        for (int i=0; i<100; i++) {
            brickwall (g, x1, y1, height1, width1);
            width1++;
        }
    }
    void brickwall( Graphics g, int x1, int y1, int height1, int width1) {
        if (a == "baksteen") {
            g.setColor(Color.red);
            g.fillRect(x1, y1, width1, height1);
            g.setColor(Color.white);
            for (int i = 0; i < 5; i++) {
                g.drawLine(20, 60 + 40 * i, 400, 60 + 40 * i);
            }
            for (int i = 0; i < 5; i++) {
                g.drawLine(80 + 60 * i, 20, 80 + 60 * i, 60);
            }
            for (int i = 0; i < 5; i++) {
                g.drawLine(50 + 60 * i, 60, 50 + 60 * i, 100);
            }
            for (int i = 0; i < 5; i++) {
                g.drawLine(80 + 60 * i, 100, 80 + 60 * i, 140);
            }
            for (int i = 0; i < 5; i++) {
                g.drawLine(50 + 60 * i, 140, 50 + 60 * i, 180);
            }
            for (int i = 0; i < 5; i++) {
                g.drawLine(80 + 60 * i, 180, 80 + 60 * i, 220);
            }
        }
        if (a == "beton") {
            g.setColor(Color.gray);
            g.fillRect(x1, y1, width1, height1);
            g.setColor(Color.white);
            for (int i = 0; i < 5; i++) {
                g.drawLine(20, 70 + 50 * i, 400, 70 + 50 * i);
            }
            for (int i = 0; i < 4; i++) {
                g.drawLine(95 + 75 * i, 20, 95 + 75 * i, 220);
            }
        }
    }
    class knop1listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = "baksteen";
            repaint();
        }
    }

        class knop2listener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                a = "beton";
                repaint();
            }
        }
    }

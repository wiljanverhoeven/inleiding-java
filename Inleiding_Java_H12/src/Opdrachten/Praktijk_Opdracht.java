package Opdrachten;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;

public class Praktijk_Opdracht extends Applet {
    Button knop;
    TextField tekstvak[] = new TextField[10];
    TextField tekstvak2[] = new TextField[10];
    String input[] = new String[10];
    String input2[] = new String[10];

    public void init(){
        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField(1);
            add(tekstvak[i]); }
        knop = new Button("OK");
        knop.addActionListener(new knoplistener());
        add(knop);
        for (int i = 0; i < tekstvak2.length; i++) {
            tekstvak2[i] = new TextField(1);
            add(tekstvak2[i]); }
        for (int i = 0; i < 10; i++) {
            input[i] = " ";
        }
        for (int i = 0; i < 10; i++) {
            input2[i] = " ";
        }


    }

    public void paint(Graphics g){
        g.drawString("namen", 10, 70);
        g.drawString("telefoon nummers", 55, 70);

        for (int i = 1; i < 10; i++) {
         g.drawString(""+input[i], 10, 90 + 20 * i); }
        for (int i = 1; i < 10; i++) {
            g.drawString(""+input2[i], 50, 90 + 20 * i); }

    }
    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 1; i < 10; i++) {
                input[i] = tekstvak[i].getText();
            }
            for (int i = 1; i < 10; i++) {
                input2[i] = tekstvak2[i].getText();
            }
            repaint();
        }
    }
}

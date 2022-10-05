package Opdrachten;

import java.applet.Applet;
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;
import java.util.*;

public class Opdracht_3 extends Applet {
    int numberOfInputs = 5;
    TextField tekstvak[] = new TextField[numberOfInputs];
    Button knop;
    int source[] = new int[numberOfInputs];
    int dest[] = new int[numberOfInputs];

    public void init() {
        drawScreen();
    }

    public void drawScreen() {

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 5);
            add(tekstvak[i]);
        }
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new knoplistener());
    }


    class knoplistener implements ActionListener {
        public void actionPerformed ( ActionEvent e) {

            for (int i = 0; i < source.length; i++) {
                source[i] =Integer.parseInt(tekstvak[i].getText());
            }

            dest = doSort(source);

            for (int i = 0; i < dest.length; i++) {
                tekstvak[i].setText(String.valueOf(dest[i]));
            }

            repaint();
        }
    }

    public  int[] doSort(int[] list)
    {
        boolean swapDone = false;
        for(int i = 0; i < (list.length-1); i++)
        {
            if (list[i] > list[i+1])
            {
                int temp_int = list[i];
                list[i] = list[i+1];
                list[i+1] = temp_int;
                swapDone = true;
            }
        }
        if (swapDone) doSort(list);
        return list;
    }
}

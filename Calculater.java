package GUIgraphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class Calculater extends JFrame {
    JPanel p1;
    JTextField t1;
    JButton b[];
    GridLayout g;

    public Calculater() {
        p1 = new JPanel();
        t1 = new JTextField(30);
        getContentPane().add("North", t1);
        getContentPane().add("Center", p1);
        g = new GridLayout(4, 4, 5, 5);
        p1.setLayout(g);
        b = new JButton[16];
        for (int i = 0; i < 10; i++) {
            b[i] = new JButton(" " +i);
            p1.add(b[i]);
        }
        b[10] = new JButton(".");
        b[11] = new JButton("+");
        b[12] = new JButton("=");
        b[13] = new JButton("-");
        b[14] = new JButton("*");
        b[15] = new JButton("/");
        for (int i = 10; i < 16; i++) {
            p1.add(b[i]);
        }
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
    	Calculater c = new Calculater();
    }
}

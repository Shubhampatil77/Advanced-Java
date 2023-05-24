package GUIgraphicuserinterface;

import javax.swing.*;
import java.awt.*;

public class SetBounds extends JFrame {
    JButton b1, b2;
    JLabel l1, l2;
    JTextField t1, t2;

    public SetBounds() {
        l1 = new JLabel("Enter First Number:");
        l2 = new JLabel("Enter Second Number:");
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        b1 = new JButton("OK");
        b2 = new JButton("CANCEL");

        l1.setBounds(50, 100, 150, 40);
        l2.setBounds(50, 180, 150, 40);
        t1.setBounds(250, 100, 100, 40);
        t2.setBounds(250, 180, 100, 40);
        b1.setBounds(70, 260, 70, 40);
        b2.setBounds(170, 260, 90, 40);

        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(t1);
        getContentPane().add(t2);
        getContentPane().add(b1);
        getContentPane().add(b2);

        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        SetBounds sb = new SetBounds();
    }
}

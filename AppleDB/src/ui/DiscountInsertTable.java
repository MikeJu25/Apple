package ui;

import javax.swing.*;
import java.awt.*;

public class DiscountInsertTable extends JFrame {

    DiscountInsertTable() {
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Please enter the information below:                ");
        JTextField text1 = new JTextField("  Discount Name  ");
        JTextField text2 = new JTextField("  Discount Level  ");
        JTextField text3 = new JTextField("  Applicability  ");

        JButton button = new JButton(" Insert Discount ");

        panel.add(label);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(button);

        setSize(new Dimension(380, 115));
        setResizable(false);
        setLocation(730, 370);
        setTitle("Insert Discount");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

package ui;

import javax.swing.*;
import java.awt.*;

public class DiscountUpdateTable extends JFrame{


    DiscountUpdateTable() {
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("        Please enter the information below:             ");
        JTextField text1 = new JTextField("  Discount Name  ");
        text1.setText("  Discount Name  ");
        JTextField text2 = new JTextField("  New Discount Level  ");


        JButton button = new JButton(" Update Discount ");

        panel.add(label);
        panel.add(text1);
        panel.add(text2);
        panel.add(button);

        setSize(new Dimension(380, 115));
        setResizable(false);
        setLocation(730, 510);
        setTitle("Update Discount");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

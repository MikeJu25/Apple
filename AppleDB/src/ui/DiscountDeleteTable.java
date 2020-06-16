package ui;

import javax.swing.*;
import java.awt.*;

public class DiscountDeleteTable extends JFrame{
    DiscountDeleteTable(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Please enter the name of discount to delete: ");
        JTextField text = new JTextField("                 Enter Here                  ");
        JButton button = new JButton("Delete Discount");
        button.setText("");

        panel.add(label);
        panel.add(text);
        panel.add(button);

        setSize(new Dimension(380, 90));
        setResizable(false);
        setLocation(730, 250);
        setTitle("Delete Discount");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }
}

package ui;

import SQL.AppleProductDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DiscountUpdateTable extends JFrame implements ActionListener {

    JTextField discountName;
    JTextField newLevel;
    private String name;
    private String level;

    DiscountUpdateTable() {
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("        Please enter the information below:             ");
        discountName = new JTextField("  Discount Name  ");
        discountName.addActionListener(this);
      //  discountName.setText("  Discount Name  ");
        newLevel = new JTextField("  New Discount Level  ");
        newLevel.addActionListener(this);

        JButton button = new JButton(" Update Discount ");
        panel.add(label);
        panel.add(discountName);
        panel.add(newLevel);
        panel.add(button);

        setSize(new Dimension(380, 115));
        setResizable(false);
        setLocation(730, 510);
        setTitle("Update Discount");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField source = (JTextField) e.getSource();
        if (source.getText() == "discountName") {
            name = discountName.getText();
            //System.out.println(discountName.getText());
        }
        if (source.getText() == "newLevel") {
            level = newLevel.getText();
        }
        new DiscountResultTable(AppleProductDataBase.updateDl(level,name));
    }
}

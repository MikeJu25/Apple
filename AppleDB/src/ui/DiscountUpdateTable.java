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
    public static Boolean hasUpdated = false;

    DiscountUpdateTable() {
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("        Please enter the information below:             ");

        discountName = new JTextField("    Discount Name    ");

        // discountName.addActionListener(this);
        //discountName.setPreferredSize(new Dimension(100, 40));

        newLevel = new JTextField("    New Level    ");
       // newLevel.setPreferredSize(new Dimension(100, 40));
        // newLevel.addActionListener(this);

        JButton button = new JButton();
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new DiscountResultTable(AppleProductDataBase.updateDl(level, name));
//            }
//        });
        button.setText(" Update Discount ");
        button.addActionListener(this);
        panel.add(label);
        panel.add(discountName);
        panel.add(newLevel);
        panel.add(button);

        setSize(new Dimension(380, 145));
        setResizable(false);
        setLocation(730, 510);
        setTitle("Update Discount");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        name = discountName.getText();
        level = newLevel.getText();
        hasUpdated = true;
        new DiscountResultTable(AppleProductDataBase.updateDl(level, name));
    }
}



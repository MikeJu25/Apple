package ui;

import SQL.AppleProductDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiscountInsertTable extends JFrame implements ActionListener {

    JTextField discountName;
    JTextField level;
    JTextField applicability;

    DiscountInsertTable() {
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Please enter the information below:                ");
        discountName = new JTextField("  Discount Name  ");
        level = new JTextField("  Discount Level  ");
        applicability = new JTextField("  Applicability  ");

        JButton button = new JButton(" Insert Discount ");
        button.addActionListener(this);

        panel.add(label);
        panel.add(discountName);
        panel.add(level);
        panel.add(applicability);
        panel.add(button);

        setSize(new Dimension(380, 115));
        setResizable(false);
        setLocation(900, 370);
        setTitle("Insert Discount");
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = discountName.getText();
        String insertLevel = level.getText();
        String applica = applicability.getText();

        GeneralResultTable table2 = new GeneralResultTable(AppleProductDataBase.addDiscount(name,insertLevel,applica),"New Table After Insertion");
        table2.setLocation(570, 270);
    }
}

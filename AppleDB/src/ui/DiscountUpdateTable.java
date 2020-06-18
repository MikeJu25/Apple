package ui;

import SQL.AppleProductDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JLabel blank = new JLabel("                    ");


        DiscountDeleteTable table1 = new DiscountDeleteTable();
        DiscountInsertTable table2 = new DiscountInsertTable();

        JButton close = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                table1.setVisible(false);
                table2.setVisible(false);
            }
        });
        close.setText("     close     ");

        button.setText("                 Update Discount                    ");
        button.addActionListener(this);
        panel.add(label);
        panel.add(discountName);
        panel.add(newLevel);
        panel.add(button);
        //panel.add(blank);
        panel.add(close);

        setSize(new Dimension(380, 145));
        setResizable(false);
        setLocation(900, 510);
        setTitle("Update Discount");
        setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        name = discountName.getText();
        level = newLevel.getText();
        hasUpdated = true;
        GeneralResultTable table = new GeneralResultTable(AppleProductDataBase.updateDl(level, name),"New Table After Update");
        table.setLocation(570, 270);
    }
}



package ui;

import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiscountRedirectTable extends JFrame implements ActionListener {

    DiscountRedirectTable(){
        JPanel panel = new JPanel();
        add(panel);

        JButton button1 = new JButton("     View All Current Discounts     ");

        JButton button2 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DiscountResultTable(Result.resultsDiscount, "All Available Discounts");
//                if (DiscountUpdateTable.hasUpdated) {
//                    System.out.println("yes");
//                    dr.dispose();
//                }
                setVisible(false);
            }
        });

      button2.setText("        Edit Existing Discounts        ");



        panel.add(button1);
        panel.add(button2);

        button1.addActionListener(this);

        setSize(new Dimension(280, 100));
        setResizable(false);
        setLocation(570, 374);
        setTitle("Options");
        setVisible(true);









    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new DiscountViewAllTable();
    }
}

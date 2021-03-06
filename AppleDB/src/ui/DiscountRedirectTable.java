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

        JButton button1 = new JButton("  View iPhones Applicable to All Discount  ");

        JButton button2 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GeneralResultTable discountTable = new GeneralResultTable(Result.resultsDiscount, "All Available Discounts");
                discountTable.setLocation(570, 270);
                new DiscountUpdateTable();
                GeneralResultTable retailTable = new GeneralResultTable(Result.resultsRetailed,"Retailer");
                retailTable.setLocation(230,270);
                setVisible(false);
            }
        });
      button2.setText("        Edit Existing Discounts        ");

        JButton back = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new AdministratorTable();
            }
        });
        back.setText("    Return      ");


        panel.add(button1);
        panel.add(button2);
        panel.add(back);

        button1.addActionListener(this);

        setSize(new Dimension(340, 130));
        setResizable(false);
        setLocation(530, 374);
        setTitle("Options");
        setVisible(true);









    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new GeneralResultTable(Result.resultsAppAllDis, "iPhone Applicable to All Discounts");
    }
}

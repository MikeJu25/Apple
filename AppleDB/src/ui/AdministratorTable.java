package ui;

import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorTable extends JFrame implements ActionListener {
    
    AdministratorTable(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("What would you like to do?");

        JButton editPhone = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ResultProductTable();
                setVisible(false);
            }
        });
        editPhone.setText("   Update Product Database   ");

        JButton editDiscount = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DiscountResultTable(Result.resultsDiscount);
//                if (DiscountUpdateTable.hasUpdated) {
//                    System.out.println("yes");
//                    dr.dispose();
//                }
                new DiscountDeleteTable();
                new DiscountInsertTable();
                new DiscountUpdateTable();
                setVisible(false);
            }
        });
        editDiscount.setText("Update Promotion Discounts");


        JButton view = new JButton("  View All Existing Products  ");
        view.addActionListener(this);

        panel.add(label);
        panel.add(editPhone);
        panel.add(editDiscount);
        panel.add(view);

        setSize(new Dimension(230, 150));
        setResizable(false);
        setLocation(600, 340);
        setTitle("Administrator Table");
        setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ComparisonSuperTable();

    }
}

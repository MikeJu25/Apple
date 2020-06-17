package ui;

import SQL.AppleProductDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DiscountDeleteTable extends JFrame implements ActionListener {
    private JTextField discountName;
    DiscountDeleteTable(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Please enter the name of discount to delete: ");
        discountName = new JTextField("              Enter Here                  ");
        JButton button = new JButton("Delete Discount");
        button.addActionListener(this);

        panel.add(label);
        panel.add(discountName);
        panel.add(button);

        setSize(new Dimension(380, 90));
        setResizable(false);
        setLocation(730, 250);
        setTitle("Delete Discount");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String name = discountName.getText();
       new DiscountResultTable(AppleProductDataBase.removeDiscount(name));
    }
}

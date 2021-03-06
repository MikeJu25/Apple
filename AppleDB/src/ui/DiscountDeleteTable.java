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
        setLocation(900, 250);
        setTitle("Delete Discount");
        setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String name = discountName.getText();
       GeneralResultTable newDiscount = new GeneralResultTable(AppleProductDataBase.removeDiscount(name),"New Table After Deletion");
       newDiscount.setLocation(570, 270);
       GeneralResultTable newRetail = new GeneralResultTable(AppleProductDataBase.showRetailedThrough(),"New Retailer Table");
       newRetail.setLocation(230,270);
    }
}

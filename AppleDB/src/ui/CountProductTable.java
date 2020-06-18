package ui;

import SQL.AppleProductDataBase;
import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountProductTable extends JFrame implements ActionListener {


    CountProductTable(){
        JPanel panel = new JPanel();
        add(panel);
        String number1 = " " + AppleProductDataBase.count6();
        String number2 = " " + AppleProductDataBase.countSE();
        String number3 = " " + AppleProductDataBase.countX();

        JLabel label1 = new JLabel();
        label1.setText("The number of existing iPhone 6 is:  " + number1);

        JLabel label2 = new JLabel();
        label2.setText("The number of existing iPhone SE is:" + number2);

        JLabel label3 = new JLabel();
        label3.setText("The number of existing iPhone X is:  " + number3);


        JButton button = new JButton("     OK!     ");
        button.addActionListener(this);


        JButton viewAveragePrice = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new CountAveragePriceTable();
            }
        });
        viewAveragePrice.setText("  View Average Price of All Products");

        JButton viewHigher6 = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new GeneralResultTable(Result.resultsHigher6,"Price Higher than 6");
            }
        });
        viewHigher6.setText("  View Average Price Higher Than iPhone6");

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(viewAveragePrice);
        panel.add(viewHigher6);
        panel.add(button);

        button.addActionListener(this);

        setSize(new Dimension(300, 260));
        setResizable(false);
        setLocation(550, 374);
        setTitle("Product Count");
        setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new AdministratorTable();

    }
}

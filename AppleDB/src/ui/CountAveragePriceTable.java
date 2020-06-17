package ui;

import SQL.AppleProductDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountAveragePriceTable extends JFrame implements ActionListener {
    CountAveragePriceTable(){
        JPanel panel = new JPanel();
        add(panel);
        String number1 = "" + AppleProductDataBase.countNumber();

        JLabel label1 = new JLabel();
        label1.setText("The average price of all products is:  $" + number1);
        JLabel label2 = new JLabel("                            ");

        JButton button = new JButton("                  OK!                    ");

        panel.add(label1);
        panel.add(label2);
        panel.add(button);

        button.addActionListener(this);

        setSize(new Dimension(300, 120));
        setResizable(false);
        setLocation(560, 400);
        setTitle("Invalid Input");
        setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new CountProductTable();


    }
}

package ui;

import SQL.AppleProductDataBase;
import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountAveragePriceTable extends JFrame implements ActionListener {
    CountAveragePriceTable(){
        setLayout(new GridLayout(6,1));
        JPanel panel1 = new JPanel();
        add(panel1);
        JPanel panel2 = new JPanel();
        add(panel2);
        JPanel panel3 = new JPanel();
        add(panel3);
        JPanel panel4 = new JPanel();
        add(panel4);
        JPanel panel5 = new JPanel();
        add(panel5);
        JPanel panel6 = new JPanel();
        add(panel6);

        String avg6 = "" + Result.resultsAvgPrice.get(0);
        String avg6P = "" + Result.resultsAvgPrice.get(1);
        String avgSE1 = "" + Result.resultsAvgPrice.get(2);
        String avgSE2 = "" + Result.resultsAvgPrice.get(3);
        String avgX = "" + Result.resultsAvgPrice.get(4);

        JLabel label6 = new JLabel();
        label6.setText(avg6);
        JLabel label6P = new JLabel();
        label6P.setText(avg6P);
        JLabel labelSE1 = new JLabel();
        labelSE1.setText(avgSE1);
        JLabel labelSE2 = new JLabel();
        labelSE2.setText(avgSE2);
        JLabel labelX = new JLabel();
        labelX.setText(avgX);
        JLabel label2 = new JLabel("                            ");

        JButton button = new JButton("                  OK!                    ");

        panel1.add(label6);
        panel2.add(label6P);
        panel3.add(labelSE1);
        panel4.add(labelSE2);
        panel5.add(labelX);
        panel6.add(button);

        button.addActionListener(this);

        setSize(new Dimension(600, 240));
        setResizable(false);
        setLocation(560, 400);
        setTitle("Average Price of All iPhones");
        setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new CountProductTable();


    }
}

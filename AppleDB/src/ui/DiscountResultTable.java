package ui;

import ui.model.Result;

import javax.swing.*;
import java.awt.*;

public class DiscountResultTable extends JFrame{

    DiscountResultTable(){

        JPanel panel = new JPanel();
        add(panel);

        JButton label1 = new JButton(Result.resultsDiscount.get(0));
        JButton label2 = new JButton(Result.resultsDiscount.get(1));
        JButton label3 = new JButton(Result.resultsDiscount.get(2));
        JButton label4 = new JButton(Result.resultsDiscount.get(3));
        JButton label5 = new JButton(Result.resultsDiscount.get(4));
//        JButton label6 = new JButton(Result.resultsDiscount.get(5));
//        JButton label7 = new JButton("                                                            ");
//        JButton label8 = new JButton("                                                            ");
//        JButton label9 = new JButton("                                                            ");
//        JButton label10 = new JButton("                                                            ");

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
//        panel.add(label6);
//        panel.add(label7);
//        panel.add(label8);
//        panel.add(label9);
//        panel.add(label10);

        setSize(new Dimension(300, 375));
        setResizable(false);
        setLocation(400, 250);
        setTitle("Result Table");
        setVisible(true);

    }










}

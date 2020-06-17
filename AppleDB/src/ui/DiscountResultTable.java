package ui;

import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DiscountResultTable extends JFrame{

//    private JButton addNum(int i) {
//
//    }
    ArrayList<JButton> labels;

    DiscountResultTable(ArrayList<String> results){


        JPanel panel = new JPanel();
        add(panel);

        JButton label1 = new JButton();
        JButton label2 = new JButton();
        JButton label3 = new JButton();
        JButton label4 = new JButton();
        JButton label5 = new JButton();
        ArrayList<JButton> buttonsBase = new ArrayList<>();
        buttonsBase.add(label1);
        buttonsBase.add(label2);
        buttonsBase.add(label3);
        buttonsBase.add(label4);
        buttonsBase.add(label5);

        Integer size = results.size();
        labels = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            labels.add(buttonsBase.get(i));
        }

        for (int i = 0; i < size; i++) {
            panel.add(labels.get(i));
            labels.get(i).setText(results.get(i));
        }
//        JButton label1 = new JButton(results.get(0));
//        JButton label2 = new JButton(results.get(1));
//        JButton label3 = new JButton(results.get(2));
//        JButton label4 = new JButton(results.get(3));
//        JButton label5 = new JButton(results.get(4));
//        JButton label6 = new JButton(Result.resultsDiscount.get(5));
//        JButton label7 = new JButton("                                                            ");
//        JButton label8 = new JButton("                                                            ");
//        JButton label9 = new JButton("                                                            ");
//        JButton label10 = new JButton("                                                            ");

//        panel.add(label1);
//        panel.add(label2);
//        panel.add(label3);
//        panel.add(label4);
//        panel.add(label5);
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

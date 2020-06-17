package ui;

import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DiscountResultTable extends JFrame implements ActionListener {

    ArrayList<JButton> labels;
    DiscountUpdateTable table1;
    DiscountInsertTable table2;
    DiscountDeleteTable table3;

    DiscountResultTable(ArrayList<String> results, String titlte){


        JPanel panel = new JPanel();
        add(panel);

        JButton label1 = new JButton();
        JButton label2 = new JButton();
        JButton label3 = new JButton();
        JButton label4 = new JButton();
        JButton label5 = new JButton();
        JButton label6 = new JButton();
        JButton label7 = new JButton();
        JButton label8 = new JButton();
        JButton label9 = new JButton();
        JButton label10 = new JButton();
        ArrayList<JButton> buttonsBase = new ArrayList<>();
        buttonsBase.add(label1);
        buttonsBase.add(label2);
        buttonsBase.add(label3);
        buttonsBase.add(label4);
        buttonsBase.add(label5);
        buttonsBase.add(label6);
        buttonsBase.add(label7);
        buttonsBase.add(label8);
        buttonsBase.add(label9);
        buttonsBase.add(label10);

        Integer size = results.size();
        labels = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            labels.add(buttonsBase.get(i));
        }

        for (int i = 0; i < size; i++) {
            panel.add(labels.get(i));
            labels.get(i).setText(results.get(i));
        }

        JButton back = new JButton("    Return     ");
        panel.add(back);
        back.addActionListener(this);


        setSize(new Dimension(300, 375));
        setResizable(false);
        setLocation(400, 270);
        setTitle(titlte);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table1 = new DiscountUpdateTable();
        table2 = new DiscountInsertTable();
        table3 = new DiscountDeleteTable();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        new AdministratorTable();
        table1.setVisible(false);
        table2.setVisible(false);
        table3.setVisible(false);
    }
}

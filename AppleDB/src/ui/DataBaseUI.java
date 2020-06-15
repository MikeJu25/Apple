package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataBaseUI extends JFrame implements ActionListener {
    private JPanel panel;
    private final JPanel panel2;
    private final JPanel panel3;
    private JLabel empty;
    private JLabel yearTitle;
    private JLabel priceTitle;
    private JLabel storage;
    private JLabel color;
    private JComboBox price;
    private JComboBox year;
    private JCheckBox gold;
    private JCheckBox gray;
    private JCheckBox black;
    private JCheckBox shiliu;
    private JCheckBox liushisi;
    private JCheckBox yibaershiba;
    private JButton apply;

    private final JLabel test = new JLabel("good");


    String[] priceStrings = {"High to Low", "Low to High", "Enter Price Interval"};
    String[] yearStrings = {"Oldest to Newest", "Newest to Oldest", "Enter Year Interval"};

    DataBaseUI() {
//        panel = new JPanel();
        apply = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ResultTable();
            }
        });
        apply.setText("Apply");
        add(apply);

        panel = new JPanel(new GridLayout(5, 1));
        add(panel);
        this.setLayout(new GridLayout(4, 1));
        panel2 = new JPanel(new GridLayout(1, 3));
        add(panel2);
        panel3 = new JPanel(new GridLayout(1, 3));
        add(panel3);

        priceTitle = new JLabel("Price");
        yearTitle = new JLabel("Year");
        storage = new JLabel("Storage");
        color = new JLabel("Color");
        empty = new JLabel("\n");


        gold = new JCheckBox("gold");
        black = new JCheckBox("black");
        gray = new JCheckBox("gray");
        shiliu = new JCheckBox("16GB");
        liushisi = new JCheckBox("64GB");
        yibaershiba = new JCheckBox("128GB");


        price = new JComboBox(priceStrings);
        price.setSelectedIndex(2);
        price.addActionListener(this);

        year = new JComboBox(yearStrings);
        year.setSelectedIndex(2);
        year.addActionListener(this);

        panel.add(yearTitle);
        panel.add(year);
        panel.add(gold);
        panel.add(empty);
        panel.add(priceTitle);
        panel.add(price);
        panel.add(empty);
        panel.add(empty);
        //panel.add(color);
        panel3.add(gold);
        panel3.add(black);
        panel3.add(gray);
        panel3.add(gold);
        //panel.add(storage);
        panel2.add(shiliu);
        panel2.add(liushisi);
        panel2.add(yibaershiba);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel, BorderLayout.CENTER);
        pack();

        setLocation(560, 350);
        setTitle("Filter");
        setSize(600, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        JButton applyClicked = (JButton) e.getSource();
//        JComboBox comboBox = (JComboBox) e.getSource();
//
//        if (applyClicked.getText().equals("Apply")) {
//            System.out.println(comboBox.getSelectedIndex());
//            if (comboBox.getSelectedItem() == "Low to High") {
//                new EmptyNameWindow();
//            }
//        } else {
//
//        }
    }
}


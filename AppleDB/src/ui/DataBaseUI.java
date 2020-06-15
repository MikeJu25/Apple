package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataBaseUI extends JFrame implements ActionListener {
    private JPanel panel;
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




    String[] strings = { "High to Low", "Low to High", "Interval"};

    DataBaseUI() {
//        panel = new JPanel();
        panel = new JPanel(new GridLayout(5,1));
        add(panel);
        this.setLayout(new GridLayout(3,1));
        final JPanel panel2 = new JPanel(new GridLayout(3,1));
        this.add(panel2);
        final JPanel panel3 = new JPanel(new GridLayout(1,3));
        this.add(panel3);


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


        price = new JComboBox(strings);
        price.setSelectedIndex(2);
        price.addActionListener(this);

        year = new JComboBox(strings);
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

        setTitle("Filter");
        setSize(450, 250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

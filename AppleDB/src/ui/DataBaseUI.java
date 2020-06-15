package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataBaseUI extends JFrame implements ActionListener {
    private JPanel panel;

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
    private JCheckBox black;



    String[] strings = { "High to Low", "Low to High", "Interval"};

    DataBaseUI() {
        panel = new JPanel(new GridLayout(3,1));
        add(panel);


        priceTitle = new JLabel("Price");
        yearTitle = new JLabel("Year");
        storage = new JLabel("Storage");
        color = new JLabel("Color");

        price = new JComboBox(strings);
        price.setSelectedIndex(2);
        price.addActionListener(this);

        year = new JComboBox(strings);
        year.setSelectedIndex(2);
        year.addActionListener(this);

        panel.add(yearTitle);
        panel.add(year);
        panel.add(priceTitle);
        panel.add(price);
        panel.add(color);
        panel.add(storage);

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

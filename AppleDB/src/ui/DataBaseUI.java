package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataBaseUI extends JFrame implements ActionListener {
    private JPanel panel;
   // private JLabel filter;
    private JLabel yearTitle;
    private JLabel priceTitle;
    private JComboBox price;
    private JComboBox year;
    private JComboBox storage;
    private JComboBox color;

    String[] strings = { "High to Low", "Low to High", "Interval"};

    DataBaseUI() {
        panel = new JPanel();
        add(panel);

       //filter = new JLabel("Filter");
        priceTitle = new JLabel("Price");
        yearTitle = new JLabel("Year");

        price = new JComboBox(strings);
        price.setSelectedIndex(2);
        price.addActionListener(this);

        year = new JComboBox(strings);

        year.setSelectedIndex(2);
        year.addActionListener(this);

       // panel.add(filter);
        panel.add(yearTitle);
        panel.add(year);
        panel.add(priceTitle);
        panel.add(price);

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

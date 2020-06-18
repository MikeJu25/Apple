package ui;

import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataBaseUI extends JFrame implements ActionListener {

    private final JPanel panel;
    private final JPanel panel2;
    private final JPanel panel3;
    private final JPanel panel4;
    private final JPanel panel5;
    private final JPanel panel6;
    private JLabel empty;
    private JLabel yearTitle;
    private JLabel priceTitle;
    private JLabel storage;
    private JLabel color;
    private JLabel blank;
    private JComboBox price;
    private JComboBox year;
    private JCheckBox gold;
    private JCheckBox gray;
    private JCheckBox black;
    private JCheckBox shiliu;
    private JCheckBox liushisi;
    private JCheckBox yibaershiba;
    private JButton apply;
    private JButton priceLTHApply;
    private JButton yearNTO64GB;
    private JButton back;
    private Boolean liushisiSelected;

    String[] priceStrings = {"High to Low", "Low to High", "Default"};
    String[] yearStrings = {"Oldest to Newest", "Newest to Oldest", "Default"};

    DataBaseUI() {


        JButton compareModels = new JButton("Compare All Models");
        compareModels.addActionListener(this);


        blank = new JLabel("                                                                            ");
        apply = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ResultTableProducts(Result.resultsAll,"All Available iPhones");
            }
        });
        apply.setText("Apply");


        priceLTHApply = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ResultTableProducts(Result.resultsPLTH,"Price Low to High");
            }
        });
        priceLTHApply.setText("Apply");

        yearNTO64GB = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ResultTableProducts(Result.resultsYNTO64,"Newest to Oldest + 64GB");
            }
        });
        yearNTO64GB.setText("Apply");


        panel = new JPanel(new GridLayout(5, 1));
        add(panel);
        this.setLayout(new GridLayout(6, 1));
        panel2 = new JPanel(new GridLayout(1, 3));
        add(panel2);
        panel3 = new JPanel(new GridLayout(1, 3));
        add(panel3);
        panel4 = new JPanel(new GridLayout(1, 3));
        panel4.add(apply);
        add(panel4);
        panel5 = new JPanel(new GridLayout(1,1));
        add(panel5);
        panel6 = new JPanel(new GridLayout(1,1));
        add(panel6);



        priceTitle = new JLabel("Price");
        yearTitle = new JLabel("Year");
        storage = new JLabel("Storage");
        color = new JLabel("Color");
        empty = new JLabel("\n");
        back = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginUI();
            }
        });
        back.setText("     Return     ");


        gold = new JCheckBox("gold");
        black = new JCheckBox("black");
        gray = new JCheckBox("gray");
        shiliu = new JCheckBox("16GB");
        liushisi = new JCheckBox(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton abstractButton = (AbstractButton) e.getSource();
                if (abstractButton.isSelected()) {
                    liushisiSelected = true;
                }
            }
        });
        liushisi.setText("64GB");


        yibaershiba = new JCheckBox("128GB");


        price = new JComboBox(priceStrings);
        price.setSelectedIndex(2);
        price.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPrice = (String) price.getSelectedItem();
                if (selectedPrice == "Low to High") {
                    panel4.remove(apply);
                    panel4.add(priceLTHApply);
                    pack();
                    setSize(600, 400);
                }

            }
        });


        year = new JComboBox(yearStrings);
        year.setSelectedIndex(2);
        year.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedYear = (String) year.getSelectedItem();
                if (selectedYear == "Newest to Oldest") {
                    System.out.println("Yes");
                    if (liushisiSelected) {
                        System.out.println("Yes");
                        panel4.remove(apply);
                        panel4.add(yearNTO64GB);
                        pack();
                        setSize(600, 400);
                    }
                }
            }
        });


        panel.add(yearTitle);
        panel.add(year);
        panel.add(gold);
        panel.add(empty);
        panel.add(priceTitle);
        panel.add(price);
        panel.add(empty);
        panel.add(empty);
        panel3.add(gold);
        panel3.add(black);
        panel3.add(gray);
        panel3.add(gold);
        panel2.add(shiliu);
        panel2.add(liushisi);
        panel2.add(yibaershiba);
        panel5.add(back);
        panel6.add(compareModels);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel, BorderLayout.CENTER);
        pack();

        setLocation(410, 250);
        setTitle("Filter");
        setSize(600, 450);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ComparisonTable();

    }
}


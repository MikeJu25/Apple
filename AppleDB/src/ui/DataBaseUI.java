package ui;

import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataBaseUI extends JFrame implements ActionListener {
   // public static ArrayList<String> results;
  //  public Result result;
    private final JPanel panel;
    private final JPanel panel2;
    private final JPanel panel3;
    private final JPanel panel4;
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
    private JButton priceLTHApply;
    private JButton yearNTO64GB;
    private JButton comparison;
    private Boolean liushisiSelected;


  //  private final JLabel test = new JLabel("good");

//    public static void getResultsAll() {
//        results = AppleProductDataBase.getPhoneInfo();
//    }
//
//    public static void getResultsPLTH() {
//        results = AppleProductDataBase.getPhoneInfo();
//    }



    String[] priceStrings = {"High to Low", "Low to High", "Default"};
    String[] yearStrings = {"Oldest to Newest", "Newest to Oldest", "Default"};

    DataBaseUI() {
//        panel = new JPanel();
        apply = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // getResultsAll();
                dispose();
                new ResultTablePrice(Result.resultsAll);
            }
        });
        apply.setText("Apply");


        priceLTHApply = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ResultTablePrice(Result.resultsPLTH);
            }
        });
        priceLTHApply.setText("Apply");

        yearNTO64GB = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ResultTableYear(Result.resultsYNTO64);
            }
        });
        yearNTO64GB.setText("Apply");

        comparison = new JButton("Compare All iPhones");
        comparison.addActionListener(this);


        panel = new JPanel(new GridLayout(5, 1));
        add(panel);
        this.setLayout(new GridLayout(5, 1));
        panel2 = new JPanel(new GridLayout(1, 3));
        add(panel2);
        panel3 = new JPanel(new GridLayout(1, 3));
        add(panel3);
        panel4 = new JPanel(new GridLayout(1, 1));
        panel4.add(apply);
        add(panel4);
        add(comparison);
        priceTitle = new JLabel("Price");
        yearTitle = new JLabel("Year");
        storage = new JLabel("Storage");
        color = new JLabel("Color");
        empty = new JLabel("\n");


        gold = new JCheckBox("gold");
        black = new JCheckBox("black");
        gray = new JCheckBox("gray");
        shiliu = new JCheckBox("16GB");
        liushisi = new JCheckBox(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton abstractButton = (AbstractButton) e.getSource();
                if (abstractButton.isSelected()) {
                   // System.out.println("Yes");
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
        JButton comparisonClicked = (JButton) e.getSource();
        if (comparisonClicked.getText() == "Compare All iPhones") {
            new ComparisonTable();
        }
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


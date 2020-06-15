package ui;

import SQL.AppleProductDataBase;
import ui.model.Result;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ResultTable extends JFrame {
    //public Result result = new Result();
   // private static ArrayList<String> results = new ArrayList<String>();



    ResultTable(ArrayList<String> results){



        JPanel panel = new JPanel();
        add(panel);

        JButton label1 = new JButton(results.get(0));
        JButton label2 = new JButton(results.get(1));
        JButton label3 = new JButton(results.get(2));
        JButton label4 = new JButton(results.get(3));
        JButton label5 = new JButton(results.get(4));
 //       JButton label6 = new JButton(results.get(6));
//        JButton label7 = new JButton(getResult(7));
//        JButton label8 = new JButton("                                                            ");
//        JButton label9 = new JButton("                                                            ");
//        JButton label10 = new JButton("                                                            ");
//        JButton label11 = new JButton("                                                            ");
//        JButton label12 = new JButton("                                                            ");
//        JButton label13 = new JButton("                                                            ");
//        JButton label14 = new JButton("                                                            ");
//        JButton label15 = new JButton("                                                            ");
//        JButton label16 = new JButton("                                                            ");
//        JButton label17 = new JButton("                                                            ");
//        JButton label18 = new JButton("                                                            ");
//        JButton label19 = new JButton("                                                            ");
//        JButton label20 = new JButton("                                                            ");

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
//        panel.add(label11);
//        panel.add(label12);
//        panel.add(label13);
//        panel.add(label14);
//        panel.add(label15);
//        panel.add(label16);
//        panel.add(label17);
//        panel.add(label18);
//        panel.add(label19);
//        panel.add(label20);
        
        setSize(new Dimension(300, 700));
        setResizable(false);
        setLocation(600, 100);
        setTitle("Result Table");
        setVisible(true);



    }
}

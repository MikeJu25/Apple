package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResultTable extends JFrame implements ActionListener{
    ResultTable(){
        //this.setLayout(new GridLayout(23,2));
        //JScrollBar bar = new JScrollBar();
        JPanel panel = new JPanel();
        add(panel);

        JButton label1 = new JButton("                                                            ");
        JButton label2 = new JButton("                                                            ");
        JButton label3 = new JButton("                                                            ");
        JButton label4 = new JButton("                                                            ");
        JButton label5 = new JButton("                                                            ");
        JButton label6 = new JButton("                                                            ");
        JButton label7 = new JButton("                                                            ");
        JButton label8 = new JButton("                                                            ");
        JButton label9 = new JButton("                                                            ");
        JButton label10 = new JButton("                                                            ");
        JButton label11 = new JButton("                                                            ");
        JButton label12 = new JButton("                                                            ");
        JButton label13 = new JButton("                                                            ");
        JButton label14 = new JButton("                                                            ");
        JButton label15 = new JButton("                                                            ");
        JButton label16 = new JButton("                                                            ");
        JButton label17 = new JButton("                                                            ");
        JButton label18 = new JButton("                                                            ");
        JButton label19 = new JButton("                                                            ");
        JButton label20 = new JButton("                                                            ");

        //panel.add(bar);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(label7);
        panel.add(label8);
        panel.add(label9);
        panel.add(label10);
        panel.add(label11);
        panel.add(label12);
        panel.add(label13);
        panel.add(label14);
        panel.add(label15);
        panel.add(label16);
        panel.add(label17);
        panel.add(label18);
        panel.add(label19);
        panel.add(label20);



        setSize(new Dimension(300, 700));
        setResizable(true);
        setLocation(600, 100);
        setTitle("Result Table");
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

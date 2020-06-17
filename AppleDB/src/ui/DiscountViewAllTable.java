package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiscountViewAllTable extends JFrame implements ActionListener {

    DiscountViewAllTable(){
        JPanel panel = new JPanel();
        String string = "                                    ";
        add(panel);

        JLabel label = new JLabel("                                                ");

        JButton button1 = new JButton(string);
        JButton button2 = new JButton(string);
        JButton button3 = new JButton(string);
        JButton button4 = new JButton(string);
        JButton button5 = new JButton(string);
        JButton button6 = new JButton(string);
        JButton button7 = new JButton(string);

        JButton ok = new JButton("OK!");
        ok.addActionListener(this);


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(label);
        panel.add(ok);

        setSize(new Dimension(200, 340));
        setResizable(false);
        setLocation(600, 274);
        setTitle("Products Applicable for All Discounts");
        setVisible(true);









    }


    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new DiscountRedirectTable();

    }
}

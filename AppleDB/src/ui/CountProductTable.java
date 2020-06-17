package ui;

import SQL.AppleProductDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountProductTable extends JFrame implements ActionListener {


    CountProductTable(){
        JPanel panel = new JPanel();
        add(panel);
        String number1 = " " + AppleProductDataBase.countNumber();
        String number2 = " " + AppleProductDataBase.countNumber();
        String number3 = " " + AppleProductDataBase.countNumber();

        JLabel label1 = new JLabel();
        label1.setText("The number of existing iPhone 6 is:  " + number1);

        JLabel label2 = new JLabel();
        label2.setText("The number of existing iPhone SE is:" + number2);

        JLabel label3 = new JLabel();
        label3.setText("The number of existing iPhone X is:  " + number3);




        JButton button = new JButton("     OK!     ");
        button.addActionListener(this);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        panel.add(button);
        button.addActionListener(this);

        setSize(new Dimension(300, 120));
        setResizable(false);
        setLocation(550, 374);
        setTitle("Product Count");
        setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new AdministratorTable();

    }
}

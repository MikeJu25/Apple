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
        String numberIs = "The number of existing iPhone6 is:" + AppleProductDataBase.countNumber();

        JLabel label = new JLabel();
        label.setText(numberIs);
        JButton button = new JButton("     OK!     ");
        button.addActionListener(this);

        panel.add(label);
        panel.add(button);
        button.addActionListener(this);

        setSize(new Dimension(500, 70));
        setResizable(false);
        setLocation(480, 374);
        setTitle("Product Count");
        setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new AdministratorTable();

    }
}

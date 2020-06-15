package ui;

import sun.invoke.empty.Empty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmptyNameWindow extends JFrame implements ActionListener {


    EmptyNameWindow(){

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(2,1));

        JLabel label = new JLabel();
        label.setText("            Please provide a valid combination of username and password!");
        JButton button = new JButton("     OK!     ");

        panel.add(label);
        panel.add(button);

        button.addActionListener(this);

        setSize(new Dimension(500, 120));
        setResizable(false);
        setLocation(460, 374);
        setTitle("Invalid Input");
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
}

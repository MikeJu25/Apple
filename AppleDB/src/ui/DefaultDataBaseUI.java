package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DefaultDataBaseUI extends JFrame implements ActionListener {
    DefaultDataBaseUI(){

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(2,1));

        JLabel label = new JLabel();
        label.setText("            ");
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

    }
}

package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TooLongNameWindow extends JFrame implements ActionListener {


    TooLongNameWindow()  {
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(2,1));

        JLabel label = new JLabel();
        label.setText("                     Your username or password is incorrect. Please retry!");
        JButton button = new JButton("     OK!     ");

        panel.add(label);
        panel.add(button);

        button.addActionListener(this);

        setSize(new Dimension(500, 120));
        setResizable(false);
        setLocation(460, 174);
        setTitle("Incorrect Login");
        setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }
}

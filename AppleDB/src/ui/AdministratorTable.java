package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorTable extends JFrame implements ActionListener {

    AdministratorTable(){
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(2,1));

        JLabel label = new JLabel();
        label.setText("            Get ready to manipulate some data!");
        JButton button = new JButton("     View All Models     ");

        panel.add(label);
        panel.add(button);
        button.addActionListener(this);


        setSize(new Dimension(600, 400));
        setResizable(false);
        setLocation(420, 250);
        setTitle("Administrator Table");
        setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ComparisonSuperTable();

    }
}

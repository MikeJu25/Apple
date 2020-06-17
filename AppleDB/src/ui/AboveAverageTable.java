package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboveAverageTable extends JFrame implements ActionListener {

    AboveAverageTable(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel();
        label.setText("                                                                                      ");

        JButton button1 = new JButton("                                            ");
        JButton button2 = new JButton("                                            ");
        JButton button3 = new JButton("                                            ");
        JButton button4 = new JButton("                                            ");
        JButton button5 = new JButton("                                            ");
        JButton ok = new JButton("    OK    ");

        ok.addActionListener(this);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(label);
        panel.add(label);
        panel.add(label);
        panel.add(ok);



        setSize(new Dimension(300, 260));
        setResizable(false);
        setLocation(600, 300);
        setTitle("Price Above Average");
        setVisible(true);






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new AdministratorTable();
    }
}

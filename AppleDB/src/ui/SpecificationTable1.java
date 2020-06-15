package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.sun.tools.internal.xjc.reader.Ring.add;

public class SpecificationTable1 extends JFrame{
    SpecificationTable1(){

        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon(getClass().getResource("IPhone6.jpg"));
        Image imageEditable = image.getImage();
        Image imageEdited = imageEditable.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        image = new ImageIcon(imageEdited);

        JLabel imageLabel = new JLabel(image);
        add(panel);

        JLabel label = new JLabel();
        label.setText("IPhone 6 Specification Details");
        JButton button1 = new JButton("      Model Name: IPhone 6 Grey 16GB    ");
        JButton button2 = new JButton("      Processor: 12315 A8 Superchip       ");
        JButton button3 = new JButton("           Camera: 800 Wide 120 FHP         ");
        JButton button4 = new JButton("           Water Resistance: 0 Meters         ");
        JButton button5 = new JButton("  Price: $449  ");

        panel.add(label);
        panel.add(imageLabel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        setSize(new Dimension(300, 480));
        setResizable(false);
        setLocation(570, 320);
        setTitle("Model Details");
        setVisible(true);

    }
}

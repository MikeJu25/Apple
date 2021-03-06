package ui;

import javax.swing.*;
import java.awt.*;

public class SpecificationTable4 extends JFrame {

    SpecificationTable4(){

        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon(getClass().getResource("Image/IPhone SE Red.jpg"));
        Image imageEditable = image.getImage();
        Image imageEdited = imageEditable.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        image = new ImageIcon(imageEdited);

        JLabel imageLabel = new JLabel(image);
        add(panel);

        JLabel label = new JLabel();
        label.setText("IPhone SE 2 Specification Details");
        JButton button1 = new JButton("       Model Name: IPhone SE 2 128GB      ");
        JButton button2 = new JButton("     Processor: 102580 A13 Superchip      ");
        JButton button3 = new JButton("           Camera: 1200 Wide 700 FHP         ");
        JButton button4 = new JButton("              Water Resistance: IP67               ");
        JButton button5 = new JButton("  Price: $809  ");

        panel.add(label);
        panel.add(imageLabel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        setSize(new Dimension(300, 480));
        setResizable(false);
        setLocation(550, 220);
        setTitle("Model Details");
        setVisible(true);

    }
}

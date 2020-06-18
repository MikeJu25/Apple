package ui;

import javax.swing.*;
import java.awt.*;

public class SpecificationTable5 extends JFrame{
    SpecificationTable5(){
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon(getClass().getResource("Image/IPhone X Black.jpg"));
        Image imageEditable = image.getImage();
        Image imageEdited = imageEditable.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        image = new ImageIcon(imageEdited);

        JLabel imageLabel = new JLabel(image);
        add(panel);

        JLabel label = new JLabel();
        label.setText("IPhone X Specification Details");
        JButton button1 = new JButton("     Model Name: IPhone X Black 256GB    ");
        JButton button2 = new JButton("     Processor: 10086 A11 Bionic Chip      ");
        JButton button3 = new JButton("          Camera: 1200 Wide 1200 FHP        ");
        JButton button4 = new JButton("              Water Resistance: IP67               ");
        JButton button5 = new JButton("  Price: $779  ");

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

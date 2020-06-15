package ui;

import javax.swing.*;
import java.awt.*;

public class SpecificationTable3 extends JFrame {
    SpecificationTable3(){

        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon(getClass().getResource("IPhone SE Silver.jpg"));
        Image imageEditable = image.getImage();
        Image imageEdited = imageEditable.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        image = new ImageIcon(imageEdited);

        JLabel imageLabel = new JLabel(image);
        add(panel);

        JLabel label = new JLabel();
        label.setText("IPhone SE 1 Specification Details");
        JButton button1 = new JButton("        Model Name: IPhone SE 1 16GB      ");
        JButton button2 = new JButton("      Processor: 10010 A9 Superchip       ");
        JButton button3 = new JButton("          Camera: 1200 Wide 720 FHP        ");
        JButton button4 = new JButton("              Water Resistance: IP65             ");
        JButton button5 = new JButton("  Price: $299  ");

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

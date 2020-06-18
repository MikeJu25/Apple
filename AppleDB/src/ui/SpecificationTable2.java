package ui;

import javax.swing.*;
import java.awt.*;

public class SpecificationTable2 extends JFrame{


    SpecificationTable2(){
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon(getClass().getResource("Image/IPhone6 Plus.jpg"));
        Image imageEditable = image.getImage();
        Image imageEdited = imageEditable.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
        image = new ImageIcon(imageEdited);

        JLabel imageLabel = new JLabel(image);
        add(panel);

        JLabel label = new JLabel();
        label.setText("IPhone 6 Plus Specification Details");
        JButton button1 = new JButton("  Model Name: IPhone 6 Plus Gold 64GB");
        JButton button2 = new JButton("      Processor: 12315 A8 Superchip       ");
        JButton button3 = new JButton("           Camera: 800 Wide 120 FHP         ");
        JButton button4 = new JButton("           Water Resistance: 0 Meters         ");
        JButton button5 = new JButton("  Price: $569  ");

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

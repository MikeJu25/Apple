package ui;

import javax.swing.*;
import java.awt.*;

public class ModelInformationTable4 extends JFrame {
    ModelInformationTable4(){
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
        JButton button5 = new JButton("          Suggested Retail Price: $809          ");
        JButton button6 = new JButton("       Design Location: California USA       ");
        JButton button7 = new JButton("Manufacture Location: Guangzhou China");
        JButton button8 = new JButton("       Product Supervisor: Allison Lee        ");
        JButton button9 = new JButton("         Release Date: 04-24-2020            ");
        JButton button10 = new JButton("        Factory Serial Number: 10004         ");


        panel.add(label);
        panel.add(imageLabel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);

        setSize(new Dimension(300, 650));
        setResizable(false);
        setLocation(570, 120);
        setTitle("Administrator - Model Details");
        setVisible(true);


    }
}

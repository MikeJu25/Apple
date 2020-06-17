package ui;

import javax.swing.*;
import java.awt.*;

public class ModelInformationTable3 extends JFrame {
    ModelInformationTable3(){
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon(getClass().getResource("Image/IPhone SE Silver.jpg"));
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
        JButton button5 = new JButton("        Suggested Retail Price: $299         ");
        JButton button6 = new JButton("      Design Location: California USA      ");
        JButton button7 = new JButton("   Manufacture Location: Tianjin China   ");
        JButton button8 = new JButton("    Product Supervisor: Benjamin Choi    ");
        JButton button9 = new JButton("         Release Date: 03-31-2016           ");
        JButton button10 = new JButton("       Factory Serial Number: 10003        ");


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

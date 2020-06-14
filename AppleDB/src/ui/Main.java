package ui;
// how can customer choose the amount their food want to be


import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        JFrame frame = new JFrame("APPLE PRODUCT DATABASE");
        frame.setContentPane(new LoginUI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        new LoginUI();
    }
}

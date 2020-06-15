package ui;


import exception.TooLongName;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Objects;

public class LoginUI extends JFrame implements ActionListener {

    static String userName;
    private JPanel panel;

    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel message;
    private JLabel tooLongNameWarning;
    private JLabel emptyNameWarning;
    private JLabel blankLabel;

    private static JTextField userNameText;
    private static JTextField passwordText;
    private JButton submit;


    LoginUI() {
        panel = new JPanel();
        add(panel);

        userLabel = new JLabel();
        userLabel.setText("  Username: ");
        //userLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        userNameText = new JTextField();
        userNameText.setPreferredSize(new Dimension(200,40));

        passwordLabel = new JLabel();
        passwordLabel.setText("  Password: ");
        //passwordLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        passwordText = new JTextField();
        passwordText.setPreferredSize(new Dimension(200,40));

        blankLabel = new JLabel();
        blankLabel.setText("      ");

        submit = new JButton("              LOG IN              ");
        submit.setSize(200, 50);

        panel = new JPanel();
        //panel.setLayout(new GridLayout(3,1));
        panel.add(userLabel);
        panel.add(userNameText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener( this);
        add(panel, BorderLayout.CENTER);
        pack();

        setSize(new Dimension(300, 160));
        setResizable(false);
        setLocation(560, 350);
        setTitle("Apple Product Database");
        setVisible(true);

    }

    public boolean checkNameLegal(String s) {
        return (s.length() > 10);
    }

    static void playSound(String soundName) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }


    // EFFECTS: When submit is clicked, if input is null, print the error message to the panel; if input is longer
    //          than 10 characters, print the warning message to the panel; otherwise get into a new membership UI
    public void actionPerformed(ActionEvent ae) {
        tooLongNameWarning = new JLabel();
        tooLongNameWarning.setText("   Your username or password is incorrect.");
        emptyNameWarning = new JLabel("           Invalid input.");
        userName = userNameText.getText();
        playSound("./data/buzzer.wav");

        if (Objects.equals(userName, "")) {
            new EmptyNameWindow();


        } if (userName.equals("feng0025")) {
            new DataBaseUI();
            setVisible(false);

        } if (!userName.equals("feng0025") && !userName.equals("")){
            new TooLongNameWindow();

        }

    }
}
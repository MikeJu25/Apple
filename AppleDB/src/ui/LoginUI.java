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
    private static JTextField userNameText;
    private JButton submit;
    private JLabel tooLongNameWarning;
    private JLabel emptyNameWarning;


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


    LoginUI() {
        panel = new JPanel();
        add(panel);

        // Username Label
        userLabel = new JLabel();
        userLabel.setText("Welcome! Please in put your Name :");
        userNameText = new JTextField();

        // Password Label

        // passwordText = new JPasswordField();
        tooLongNameWarning = new JLabel();
        tooLongNameWarning.setText("Your input name is too long, change to another one");
        emptyNameWarning = new JLabel("Please enter a valid name");
        // Submit

        submit = new JButton("SUBMIT");
        setLocation(500, 300);

        panel = new JPanel(new GridLayout(3, 1));
        panel.add(userLabel);
        panel.add(userNameText);
        // panel.add(passwordText);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding the listeners to components..
        submit.addActionListener( this);
        add(panel, BorderLayout.CENTER);
        pack();

        setTitle("Name Input");
        setSize(450, 250);
        setVisible(true);

    }

    public boolean checkNameLegal(String s) throws TooLongName {
        //names = new ArrayList<String>();
        if (s.length() > 10) {
            throw new TooLongName();
        } else {
            return true;
        }
    }


    // EFFECTS: When submit is clicked, if input is null, print the error message to the panel; if input is longer
    //          than 10 characters, print the warning message to the panel; otherwise get into a new membership UI
    public void actionPerformed(ActionEvent ae) {
        userName = userNameText.getText();
        playSound("./data/buzzer.wav");
        if (Objects.equals(userName, "")) {
            panel.add(emptyNameWarning);
        }
        try {
            if (checkNameLegal(userName)) {
                dispose();

                //new MembershipUI(this);

            }
        } catch (TooLongName tooLongName) {
            // setSize(450, 350);
            panel.add(tooLongNameWarning);
            pack();
//        } catch (RepeatedName repeatedName) {
//           // repeatedName.printStackTrace();
        }

    }
}
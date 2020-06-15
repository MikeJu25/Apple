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

    private static JTextField userNameText;
    private static JTextField passwordText;
    private JButton submit;


    LoginUI() {
        panel = new JPanel();
        add(panel);

        userLabel = new JLabel();
        userLabel.setText("       Username: ");
        userNameText = new JTextField();
        userNameText.setSize(300,100);

        passwordLabel = new JLabel();
        passwordLabel.setText("       Password: ");
        passwordText = new JTextField();
        passwordText.setSize(300,100);

        tooLongNameWarning = new JLabel();
        tooLongNameWarning.setText("Your username or password is incorrect. Please retry!");
        emptyNameWarning = new JLabel("Please enter a valid combination of username and password!");

        submit = new JButton("LOG IN");

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(userLabel);
        panel.add(userNameText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener( this);
        add(panel, BorderLayout.CENTER);
        pack();

        setSize(new Dimension(400, 500));
        setResizable(true);
        setLocation(500, 300);
        setTitle("Name Input");
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
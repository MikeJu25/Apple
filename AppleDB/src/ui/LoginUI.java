package ui;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Objects;

public class LoginUI extends JFrame {

    static String userName;
    private JLabel userNameLabel;
    private JLabel passWordLabel;
    private JButton submit;
    private JTextField userNameText;
    public JPanel panel;
    private JTextField passwordText;
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

    public LoginUI() {

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userName = userNameText.getText();
                playSound("./data/buzzer.wav");
                if (Objects.equals(userName, "")) {
                    panel.add(emptyNameWarning);
                }
            }
        });
    }
    }






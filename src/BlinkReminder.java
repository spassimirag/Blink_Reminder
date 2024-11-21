import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import static java.lang.Thread.sleep;

public class BlinkReminder implements ActionListener {

    JButton button;
    JFrame frame;

    public static void main(String[] args) {
        BlinkReminder blinkReminder = new BlinkReminder();
        blinkReminder.startReminder();
        // Timer timer = new Timer(5000, blinkReminder);
        // timer.setInitialDelay(500);
        // timer.start();


    }
    public void startReminder() {
        frame = new JFrame();
        button = new JButton("It's been 20 minutes - time to blink! Click me once you've blinked 5 times.");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e) {
       // button.setText("Good job!");
        frame.setVisible(false);
        try {
            Thread.sleep(20 * 60 * 1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        frame.setVisible(true);


    }
}



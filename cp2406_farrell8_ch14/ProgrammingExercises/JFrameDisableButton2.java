import javax.swing.*;
import java.awt.*;

/**
 * Created by Ryan Thorp.
 */
public class JFrameDisableButton2 extends JFrame {

    Container container = getContentPane();
    JButton button = new JButton("Push the Button!!!");
    int count = 0;
    final int MAX = 8;
    JLabel label = new JLabel("That's enough!");

    public JFrameDisableButton2() {
        super("Button Frame");
        container.setLayout(new FlowLayout());
        setSize(360, 180);
        setVisible(true);
        container.add(button);
        container.add(label);
        label.setVisible(false);
        button.addActionListener(e -> {
            ++count;
            if (count == MAX) {
                button.setEnabled(false);
                label.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrameDisableButton2 frame =
                new JFrameDisableButton2();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
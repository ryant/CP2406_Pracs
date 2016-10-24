import javax.swing.*;
import java.awt.*;

/**
 * Created by Ryan Thorp.
 */
public class JFrameDisableButton extends JFrame {

    Container container = getContentPane();
    JButton button = new JButton("Push the Button!!!");

    public JFrameDisableButton() {
        super("Button Frame");
        container.setLayout(new FlowLayout());
        setSize(360, 180);
        setVisible(true);
        container.add(button);
        button.addActionListener(e ->
                button.setEnabled(false));
    }

    public static void main(String[] args) {
        JFrameDisableButton2 frame =
                new JFrameDisableButton2();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
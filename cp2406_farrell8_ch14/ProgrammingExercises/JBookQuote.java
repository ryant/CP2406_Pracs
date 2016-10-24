import javax.swing.*;
import java.awt.*;

/**
 * Created by Ryan Thorp.
 */
public class JBookQuote extends JFrame {
    FlowLayout flowLayout = new FlowLayout();
    JLabel sentence = new JLabel("Mr and Mrs Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much.");

    public JBookQuote() {
        super("Book Quote");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        add(sentence);
    }

    public static void main(String[] args) {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(1024, 768);
        aFrame.setVisible(true);
    }
}

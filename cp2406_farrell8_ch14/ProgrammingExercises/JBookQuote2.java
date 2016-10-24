import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Ryan Thorp.
 */
public class JBookQuote2 extends JFrame {
    FlowLayout flowLayout = new FlowLayout();
    JLabel sentence = new JLabel("Mr and Mrs Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much.");
    JButton button = new JButton("Click for Title");
    JLabel bookTitle = new JLabel("Harry Potter and The Philosophers Stone");
    public JBookQuote2() {
        super("Book Quote");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        add(sentence);
        add(button);
        button.addActionListener(e -> {
            add(bookTitle);
            revalidate();
            repaint();
        });
    }

    public static void main(String[] args) {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(1024, 768);
        aFrame.setVisible(true);
    }
}

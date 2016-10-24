import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by Ryan Thorp.
 */

public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Press to change fact");
    JLabel fact1 = new JLabel("In 1838 it was declared illegal to swim at public beaches during the day! This law was enforced until 1902.");
    JLabel fact2 = new JLabel("Australia was the second country to give women the vote.");
    JLabel fact3 = new JLabel("In 1954, Bob Hawke was immortalised by the Guinness Book of Records for sculling 2.5 pints of beer in 11 seconds.\n" +
            "Bob later became the Prime Minister of Australia.");
    JLabel fact4 = new JLabel("Until 1984, Australia's National anthem was 'God save the Queen/King.'");
    JLabel fact5 = new JLabel("Australia was the 3rd country, after the US and Russia, to launch a satellite into orbit. It was for the British, using a 'Blue Streak' rocket");
    int counter = 0;
    public JHistoricalFacts()
    {
        super("Facts");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(fact1);
        button.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JHistoricalFacts rFrame = new JHistoricalFacts();
        rFrame.setSize(1024,768);
        rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(fact1);
            add(fact2);
        }
        else
        if(counter == 2)
        {
            remove(fact2);
            add(fact3);
        }
        else
        if(counter == 3)
        {
            remove(fact3);
            add(fact4);
        }
        else
        if(counter == 4)
        {
            remove(fact4);
            add(fact5);
        }
        else
        {
            remove(fact5);
            add(fact1);
        }

        revalidate();
        repaint();
    }

}

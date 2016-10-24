// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;

public class FixDebugFifteen2 extends JFrame
{
   JButton nb = new JButton("Left    ");
   JButton sb = new JButton("Down  ");
   JButton eb = new JButton("Right ");
   JButton wb = new JButton("Center  ");
   JButton cb = new JButton("Up");
   Container con = null;

   public FixDebugFifteen2()
   {
      con = this.getContentPane();
      con.setLayout(new BorderLayout());
      con.add(nb, BorderLayout.NORTH);
      con.add(sb, BorderLayout.SOUTH);
      con.add(eb, BorderLayout.EAST);
      con.add(wb, BorderLayout.WEST);
      con.add(cb, BorderLayout.CENTER);
   }
   public static void main(String[] args)
   {
      FixDebugFifteen2 f = new FixDebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}
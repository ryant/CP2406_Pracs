import javax.swing.*;

public class MinutesConversion {
    public static void main(String[] args) {

        long minutes;
        String minutesString = JOptionPane.showInputDialog(null, "Enter number of minutes ", "Minutes Converter",
                JOptionPane.INFORMATION_MESSAGE);
        minutes = Long.parseLong(minutesString);
        long hours = minutes / 60;
        double days = hours / 24d;
        JOptionPane.showMessageDialog(null, minutes + " minutes = " + hours + " hours and equals " + String.format("%.3f", days) + " days");


    }
}

import javax.swing.*;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        int inches;
        final int FEET_IN_INCHES = 12;
        String inchesString = JOptionPane.showInputDialog(null, "Enter number of inches ", "Inches Converter",
                JOptionPane.INFORMATION_MESSAGE);
        inches = Integer.parseInt(inchesString);
        int inchesRemaining = inches % FEET_IN_INCHES;
        JOptionPane.showMessageDialog(null, inches + " inches = " + (inches / FEET_IN_INCHES) + " feet and " + inchesRemaining + " inches");


    }
}

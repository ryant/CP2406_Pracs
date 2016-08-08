/**
 * Created by jc209333 on 8/08/16.
 */
public class InchesToFeet {
    public static void main(String[] args) {
        int inches = 1;
        final int FEET_IN_INCHES = 12;
        int inchesLeft = inches % FEET_IN_INCHES;
        System.out.println(inches + " inches = " + (inches / FEET_IN_INCHES) + " feet and " + inchesLeft + " inches");

    }
}

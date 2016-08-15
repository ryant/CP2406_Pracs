import java.util.Scanner;

public class MetricConversion {
    public static void main(String[] args) {
        int value;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you wish to convert to litres and gallons ");
        value = input.nextInt();
        convertToCentimeters(value);
        convertToLitres(value);

    }

    private static void convertToCentimeters(int inches) {
        final double INCH_TO_CENTIMETERS = 2.54d;
        System.out.println(inches + " inches is " + (inches * INCH_TO_CENTIMETERS) + " cm's" );
    }

    private static void convertToLitres(int gallons) {
        final double GALLONS_TO_LITRES = 3.78541d;
        System.out.println(gallons + " gallons is " + (gallons * GALLONS_TO_LITRES) + " lt's");

    }
}

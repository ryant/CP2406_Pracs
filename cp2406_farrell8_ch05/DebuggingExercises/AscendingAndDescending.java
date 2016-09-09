import java.util.Scanner;

/**
 * Created by ryan on 27/08/16.
 */
public class AscendingAndDescending {
    public static void main(String[] args) {
        int low = 0, med = 0, high = 0;
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        System.out.println("Enter the third number");
        num3 = input.nextInt();
        if (num1 < num2 && num1 < num3) {
            low = num1;
            if (num2 < num3) {
                med = num2;
                high = num3;
            } else {
                med = num3;
                high = num2;
            }
        }
        else {
            if (num2 < num1 && num2 < num3) {
                low = num2;
                if (num1 < num2) {
                    med = num1;
                    high = num3;
                } else {
                    med = num2;
                    high = num1;
                }

            }

        }
        System.out.println("Ascending - " + low + " " + med + " " + high);
        System.out.println("Descending - " + high + " " + med + " " + low);

    }
}

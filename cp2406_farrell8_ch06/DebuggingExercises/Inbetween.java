import java.util.Scanner;

/**
 * Created by Ryan Thorp on 11-Sep-16.
 */
public class Inbetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter another number");
        int num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("No numbers in between entered integers");
        }
        else {
            if (num1 < num2) {
                for (int i = num1 + 1; i < num2; ++i) {
                    System.out.println(i);
                }
            }
            else {
                for (int i = num2 + 1; i < num1; ++i) {
                    System.out.println(i);
                }
            }
        }
    }
}

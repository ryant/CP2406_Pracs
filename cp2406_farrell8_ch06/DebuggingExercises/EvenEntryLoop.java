import java.util.Scanner;

/**
 * Created by Ryan Thorp on 11-Sep-16.
 */
public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an even number or 999 to stop");
        int num = input.nextInt();
        while (num != 999) {
            if (num % 2 == 1) {
                System.out.println("Please enter an even number");
                num = input.nextInt();
            }
            else {
                System.out.println("Good job!");
                System.out.println("Enter an even number or 999 to stop");
                num = input.nextInt();
            }
        }
    }
}

import java.util.Scanner;

/**
 * Created by ryan on 27/08/16.
 */
public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        System.out.println("Enter the third number");
        int num3 = input.nextInt();
        if (num1 < num2 && num1 < num3){
            System.out.println(num1);
        }

    }
}

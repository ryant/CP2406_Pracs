import java.util.Scanner;

/**
 * Created by ryan on 27/08/16.
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("This number is even");
        }
        else{
            System.out.println("This number is odd");
        }

    }
}

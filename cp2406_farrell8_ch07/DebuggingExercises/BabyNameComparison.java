import java.util.Scanner;

/**
 * Created by Ryan Thorp on 11-Sep-16.
 */
public class BabyNameComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name1 = input.nextLine();
        System.out.println("Enter a second name");
        String name2 = input.nextLine();
        System.out.println("Enter a third name");
        String name3 = input.nextLine();
        System.out.println("The combinations are:");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);
    }

}

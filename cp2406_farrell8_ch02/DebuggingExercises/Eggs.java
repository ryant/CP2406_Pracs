import javax.swing.*;
import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final int DOZEN = 12;
        final float COST_DOZEN_EGGS = 3.25f;
        final float COST_LOOSE_EGGS = 0.45f;
        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs would you like?");
        int eggs = input.nextInt();
        int cartons = eggs / DOZEN;
        int loose = eggs % DOZEN;
        System.out.println("You ordered " + eggs + " eggs. That's " + cartons + " dozen at $" + COST_DOZEN_EGGS +
                " per dozen and " + loose + " loose eggs at $" + COST_LOOSE_EGGS + " each for a total of $" + ((cartons * COST_DOZEN_EGGS) + (loose * COST_LOOSE_EGGS)));
    }
}

import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String name;
        double gpa;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("What is your gpa? ");
        gpa = input.nextDouble();
        calculateCredit(name, gpa);
    }
    private static void calculateCredit(String name, double gpa){
        final double CREDIT_RATE = 10d;
        double credit = gpa * CREDIT_RATE;
        System.out.println("Hi " + name + " you have a gpa of " + gpa + " therefor you have $" + credit + " credit to spend at the bookstore");


    }

}


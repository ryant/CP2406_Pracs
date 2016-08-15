// This program calculates tuition bills as credits times rate per credit hour
public class FixDebugThree4
{
   public static void main(String args[])
   {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84;
      System.out.println("My tuition:");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition:");
      tuitionBill(yourCredits, rate);
   }
   private static void tuitionBill(int credits, double rate)
   {
      System.out.println("Total due " + (rate*credits));
   }
}


public class Billing {
    final static double TAX = 0.08d;
    public static void main(String[] args) {
        System.out.println("Total cost of a $20 photo book with tax is $" + computeBill(20) );
        System.out.println("Total cost of 4 $20 photo books with tax is $" + computeBill(20, 4));
        System.out.println("Total cost of 4 $20 photo books with tax minus a $20 coupon is $" + computeBill(20, 4, 20));


    }
    public static double computeBill(double price){
       double cost = price + price * TAX;
       return cost;

    }
    public static double computeBill(double price, int quantity){
        double cost = (price + price * TAX) * quantity;
        return cost;
    }
    public static double computeBill(double price, int quantity, double couponValue){
        double cost = ((price + price * TAX) * quantity) - couponValue;
        return cost;
    }
}

/**
 * Created by Ryan on 19-Sep-16.
 */
public class Candle {
    private String color;
    private int height;
    protected double price;


    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
        final double PRICE_PER_INCH = 2;
        price = height * PRICE_PER_INCH;
    }
}

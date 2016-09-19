/**
 * Created by Ryan on 19-Sep-16.
 */
public class ScentedCandle extends Candle {
    private String scent;

    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    @Override
    public void setHeight(int height){
        final double PRICE_PER_INCH = 3;
        super.setHeight(height);
        price = height * PRICE_PER_INCH;
    }
}

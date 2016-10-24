/**
 * Created by Ryan Thorp on 24-Oct-16.
 */
public class NonFiction extends Book
{
    public NonFiction(String title)
    {
        super(title);
        setPrice();
    }
    public void setPrice()
    {
        super.price = 37.99;
    }
}

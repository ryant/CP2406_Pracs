/**
 * Created by Ryan Thorp on 24-Oct-16.
 */
public abstract class Book {
    String title;
    Double price;

    public Book(String title) {
        this.title = title;
    }

    protected abstract void setPrice();

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

}

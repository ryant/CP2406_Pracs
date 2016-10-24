/**
 * Created by Ryan Thorp on 24-Oct-16.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction aNovel = new Fiction("Harry Potter and the Chamber of Secrets");
        NonFiction aDictionary = new NonFiction("The Macquarie Dictionary");
        System.out.println("Fiction " +  aNovel.getTitle() + " costs $" +  aNovel.getPrice());
        System.out.println("Non-Fiction " + aDictionary.getTitle() + " costs $" + aDictionary.getPrice());
    }
}
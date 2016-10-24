/**
 * Created by Ryan Thorp on 24-Oct-16.
 */
public class BookArray {
    public static void main(String[] args) {
        Book aBook[] = new Book[5];
        int x;
        aBook[0] = new Fiction("Harry Potter and the Philosophers stone");
        aBook[1] = new NonFiction("The Macquarie Dictionary");
        aBook[2] = new Fiction("The Wheel of Time");
        aBook[3] = new NonFiction("Guinness Book of World Records");
        aBook[4] = new Fiction("The Name of the Wind");
        for (x = 0; x < aBook.length; ++x){
            System.out.println("Book: " + aBook[x].getTitle() + " costs $" + aBook[x].getPrice());
        }
    }
}

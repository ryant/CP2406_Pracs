/**
 * Created by Ryan Thorp.
 */
public class DemoPoems {
    public static void main(String[] args) {
        Poem poem1 = new Poem("Fun", 12);
        Couplet poem2 = new Couplet("The Dog");
        Limerick poem3 = new Limerick("The Cat");
        Haiku poem4 = new Haiku("The Bird");
        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);

    }
    public static void display(Poem poem)
    {
        System.out.println("Poem: " + poem.getTitle() +
                "   Lines: " + poem.getLines());
    }
}

/**
 * Created by Ryan Thorp.
 */
public class DomesticDivision extends Division
{
    protected String state;
    public DomesticDivision(String title, int acct, String state)
    {
        super(title, acct);
        this.state = state;
    }
    public void display()
    {
        System.out.println("Domestic Division: " +
                divisionTitle + "  Acct #" + acctNum +
                "\nLocated in " + state);
    }
}
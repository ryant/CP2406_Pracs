/**
 * Created by Ryan Thorp.
 */
public class InternationalDivision extends Division
{
    protected String country;
    protected String language;
    public InternationalDivision(String title, int acct, String country, String language)
    {
        super(title, acct);
        this.country = country;
        this.language = language;
    }
    public void display()
    {
        System.out.println("International Division: " + divisionTitle +
                "  Acct #" + acctNum + "\nLocated in " + country +
                " Language is " + language);
    }
}
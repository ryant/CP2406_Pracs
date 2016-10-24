/**
 * Created by Ryan Thorp.
 */
public abstract class Division
{
    protected String divisionTitle;
    protected int acctNum;
    public Division(String title, int acctNum)
    {
        divisionTitle = title;
        this.acctNum = acctNum;
    }
    public abstract void display();
}

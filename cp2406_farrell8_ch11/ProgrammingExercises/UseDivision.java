/**
 * Created by Ryan Thorp.
 */
public abstract class UseDivision {
    public static void main(String[] args) {
        DomesticDivision aDomDiv = new
                DomesticDivision("Sales", 123, "Queensland");
        DomesticDivision bDomDiv = new
                DomesticDivision("Technology", 234, "South Australia");
        InternationalDivision aIntDiv = new
                InternationalDivision("Technology", 345, "Germany", "German");
        InternationalDivision bIntDiv = new
                InternationalDivision("Marketing", 456, "Sweden",
                "Swedish");
        aDomDiv.display();
        bDomDiv.display();
        aIntDiv.display();
        bIntDiv.display();
    }
}

/**
 * Created by Ryan Thorp.
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String address) {
        boolean hasAtSign = false;
        this.address = address;
        for (int x = 0; x < address.length(); ++x) {
            if (address.charAt(x) == '@') {
                hasAtSign = true;
            }
        }
        if (hasAtSign) {
            rate = 9.00;
        } else {
            rate = 0;
            System.out.print("Address needs an '@' symbol\n");
        }
    }

}
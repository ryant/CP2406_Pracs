/**
 * Created by Ryan Thorp.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String address) {
        boolean hasDigit = false;
        this.address = address;
        for (int x = 0; x < address.length(); ++x) {
            if (Character.isDigit(address.charAt(x))) {
                hasDigit = true;
            }
        }
        if (hasDigit) {
            rate = 15.00;
        } else {
            rate = 0;
            System.out.print("Address needs to contain a digit\n");
        }
    }

}

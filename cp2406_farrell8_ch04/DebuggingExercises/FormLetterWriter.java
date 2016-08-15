
public class FormLetterWriter {
    public static void main(String[] args) {
        displaySalutation("Thorp");
        displayLetter();
        displaySalutation("Ryan", "Thorp");
        displayLetter();
    }
    public static void displaySalutation(String lName){
        System.out.println("Dear Mr. or Ms. " + lName);

    }
    public static void displaySalutation(String fName, String lName){
        System.out.println("Dear " + fName + " " + lName);

    }
    public static void displayLetter(){
        System.out.println("Thank you for your recent order.\n");
    }

}

/**
 * Created by Ryman on 19-Sep-16.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setInvoiceNumber(1234);
        item1.setDescription("Big Fish Tank");
        item1.setPrice(39.95);
        item2.setInvoiceNumber(4321);
        item2.setDescription("mouse cage");
        item2.setPrice(8.95);
        pet1.setInvoiceNumber(2341);
        pet1.setDescription("dog");
        pet1.setPrice(400.00);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(false);
        pet2.setInvoiceNumber(6541);
        pet2.setDescription("Fluffy cat");
        pet2.setPrice(50.95);
        pet2.setIsVaccinated(false);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(true);
        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }

    public static void display(ItemSold item) {
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("    - Description: " + item.getDescription());
        System.out.println("    - Price: $" + item.getPrice());
    }

    public static void displayPetData(PetSold item) {
        System.out.println("    - Vaccinated = " + item.getIsVaccinated());
        System.out.println("    - Neutered = " + item.getIsNeutered());
        System.out.println("    - Housebroken = " + item.getIsHousebroken());
    }
}

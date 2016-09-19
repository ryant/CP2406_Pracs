/**
 * Created by Ryman on 19-Sep-16.
 */
public class DemoHorse {
    public static void main(String[] args) {
        RaceHorse horse1 = new RaceHorse();
        Horse horse2 = new Horse();
        horse1.setName("Phar Lap");
        horse1.setBirthYear(1900);
        horse1.setColor("brown");
        horse1.setNumRaces(50);
        horse2.setName("Daisy");
        horse2.setColor("black and white");
        horse2.setBirthYear(1905);

        display(horse1);
        displayRaceHorseData(horse1);
        display(horse2);
    }
    public static void display(Horse horse) {
        System.out.println("Name: " + horse.getName());
        System.out.println("    - Birth Year: " + horse.getBirthYear());
        System.out.println("    - Color: " + horse.getColor());
    }

    public static void displayRaceHorseData(RaceHorse horse) {
        System.out.println("    - Number of races = " + horse.getNumRaces());

    }
}

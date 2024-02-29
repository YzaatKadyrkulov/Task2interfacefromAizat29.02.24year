import java.time.LocalDate;
import java.time.Period;

public class Assailant extends Athlete implements Player {

    public Assailant(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
        super(firstName, lastName, birthDate, height, weight);
    }

    @Override
    public void displayInfo() {
        System.out.println("Forward " + firstName + " " + lastName + ", Age: " + calculateAge() + ", Height: " + height + "cm, Weight: " + weight + " kg");

    }

    @Override
    public void play() {
        System.out.println("Assailant " + firstName + " " + lastName + " is attacking.");
    }

    private int calculateAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}

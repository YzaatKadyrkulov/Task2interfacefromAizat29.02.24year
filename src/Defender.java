import java.time.LocalDate;
import java.time.Period;

public class Defender extends Athlete implements Player {
    public Defender(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
        super(firstName, lastName, birthDate, height, weight);
    }

    @Override
    void displayInfo() {
        System.out.println("Defender: " + firstName + " " + lastName + ", Age: " + calculateAge() + ", Height: " + height + " cm, Weight: " + weight + " kg");

    }

    @Override
    public void play() {
        System.out.println("Defender " + firstName + " " + lastName + " is defending!");

    }
    private int calculateAge(){
        return Period.between(birthDate,LocalDate.now()).getYears();
    }
}

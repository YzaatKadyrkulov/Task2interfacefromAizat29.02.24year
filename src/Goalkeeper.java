import java.time.LocalDate;
import java.time.Period;

public class Goalkeeper extends Athlete implements Player {
    public Goalkeeper(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
        super(firstName, lastName, birthDate, height, weight);
    }

    @Override
    void displayInfo() {
        System.out.println("Goalkeeper: " + firstName + " " + lastName + ", Age: " + calculateAge() + ", Height: " + height + " cm, Weight: " + weight + " kg");

    }

    @Override
    public void play() {
        System.out.println("Goalkeeper " + firstName + " " + lastName + " is saving the goal!");

    }
    public int calculateAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}

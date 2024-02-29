import java.time.LocalDate;

public abstract class Athlete {
      protected String firstName;
      protected String lastName;
      protected LocalDate birthDate;
      protected int height;
      protected int weight;


      public Athlete(String firstName, String lastName, LocalDate birthDate, int height, int weight) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.birthDate = birthDate;
          this.height = height;
          this.weight = weight;
      }
      abstract void displayInfo();
  }
      interface Player{
        void play();
  }



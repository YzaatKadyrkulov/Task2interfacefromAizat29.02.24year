public class Coach {
    private String firstName;
    private String lastName;


    public Coach(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayInfo() {
        System.out.println("Coach: " + firstName + " " + lastName);
    }
}



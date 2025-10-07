package RecordsHomework;

public record Student(String firstName, String lastName, int studentNumber) {


    // Örneğin:
    public String fullName() {
        return firstName + " " + lastName;
    }
}

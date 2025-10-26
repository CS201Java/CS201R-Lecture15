import java.util.Objects;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String major;

    public Student(int id, String lastName, String firstName, String major) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.major = major;
    }

    public int getId()          {return id; }

    public String getLastName() { return lastName;}
    public String getFirstName() {return firstName;}
    public String getMajor() { return major; }

    @Override
    public String toString() {
        return String.format("%d - %s, %s (%s)", id, lastName, firstName, major);
    }
}

 
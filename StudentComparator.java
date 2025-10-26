import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int lastCompare = s1.getLastName().compareToIgnoreCase(s2.getLastName());
        if (lastCompare != 0) {
            return lastCompare;
        }
        // If last names are equal, compare first names
        return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
    }
}

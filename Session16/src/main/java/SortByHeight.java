import java.util.Comparator;

public class SortByHeight implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getHeight(), person2.getHeight());
    }
}

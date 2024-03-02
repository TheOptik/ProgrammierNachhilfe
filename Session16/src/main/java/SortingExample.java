import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {

    public static void main(String[] args) {

        //initialize list
        var people = new ArrayList<Person>();
        people.add(new Person("Albert", 56, 170));
        people.add(new Person("Bruno", 34, 165));
        people.add(new Person("Carol", 29, 172));

        //shuffle list, so people are in a random order
        Collections.shuffle(people);
        System.out.println(people);

        //sort people by their natural order (implemented via comparable)
        Collections.sort(people);
        System.out.println(people);

        //sort people by a different order (implemented via comparator)
        Collections.sort(people, new SortByHeight());
        System.out.println(people);


    }

}

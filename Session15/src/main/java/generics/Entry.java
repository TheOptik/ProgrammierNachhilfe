package generics;

import java.util.List;

public class Entry<T extends Comparable<T>> {

    private T value;

    public Entry(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {

        Entry<ComparableClass> entry = new Entry<>(new ComparableClass());

        printEntry(entry);


    }

    public static void printEntry(Entry<? extends ComparableClass> entry){
        System.out.println(entry);
    }

    public static void printList(List<?> list){
        //print the list
    }

    public static <T> void addToList(List<T> list, T newEntry){
        list.add(newEntry);
        //print the list
    }



    static class ComparableClass implements Comparable<ComparableClass>{

        @Override
        public int compareTo(ComparableClass o) {
            return 0;
        }
    }

}

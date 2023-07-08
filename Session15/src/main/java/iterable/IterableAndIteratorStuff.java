package iterable;

import java.util.Iterator;

public class IterableAndIteratorStuff {


    public static void main(String[] args) {

        MyCoolIterableThing thing = new MyCoolIterableThing("Hallo", "Welt", "!");

        for (String temp : thing) {
            System.out.println(temp);
        }

        Iterator<String> iterator = thing.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }


}

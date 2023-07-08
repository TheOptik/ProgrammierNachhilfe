package iterable;

import java.util.Iterator;

public class MyCoolIterableThing implements Iterable<String> {

    private String[] strings;

    public MyCoolIterableThing(String... strings) {

        this.strings = strings;
    }

    protected String[] getStrings() {
        return strings;
    }

    @Override
    public Iterator<String> iterator() {
        return new ThingIterator(this);
    }

}

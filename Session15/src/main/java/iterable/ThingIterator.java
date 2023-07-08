package iterable;

import java.util.Iterator;

public class ThingIterator implements Iterator<String> {

    private MyCoolIterableThing thing;
    private int index = 0;

    public ThingIterator(MyCoolIterableThing thing) {
        this.thing = thing;
    }

    @Override
    public boolean hasNext() {
        return index < thing.getStrings().length;
    }

    @Override
    public String next() {
        index++;
        return thing.getStrings()[index - 1];
    }

}
